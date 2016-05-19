package ex01;

import java.util.Stack;

/* Classe RPN Calculator imita o padrão de funcionamento das antigas calculadores científicas da HP
 * RPN significa "Reverse Polish Notation" onde primeiro se entra com os numeros e por ultimo a operação
 * O armazenamento é feito em uma pilha acumulativa onde o resutado também é armazenado sempre na primeira
 * posição da pilha.
 * */

public class RpnCalculator {
	
	private Stack<Double> st = new Stack<>();
	
	public double pushtoStack(double number){
		st.push(number);
		return st.size();
	}
	
	public double operation(String op) throws Exception {
		switch (op) {
		case "+":
			if(st.size()<2) throw new RuntimeException("operation(String op): Argumentos insulficientes");
			double summe = st.pop();
			summe += st.pop();
			st.push(summe);
			break;
		case "-":
			if(st.size()<2) throw new RuntimeException("operation(String op): Argumentos insulficientes");
			double subtrahend = st.pop();
			double minuend = st.pop();
			st.push(minuend - subtrahend);
			break;
		case "/":
			if(st.size()<2) throw new RuntimeException("operation(String op): Argumentos insulficientes");
			double denominator = st.pop();
			double numerator = st.pop();
			st.push(numerator / denominator);
			break;
		case "*":
			if(st.size()<2) throw new RuntimeException("operation(String op): Argumentos insulficientes");
			double product = st.pop();
			product *= st.pop();
			st.push(product);
			break;
		default:
			throw new RuntimeException("operation(String op): Operação Inválida");
		}
		return st.peek();
	}
	
	public int getStackDepth(){
		return st.size();
	}

	@Override
	public String toString() {
		String strStack = "";
		for(int i = 0; i < st.size(); i++){
			strStack += String.format("%d: %f%n",st.size() - i,st.get(i));
		}	
		return strStack;
	}
}

