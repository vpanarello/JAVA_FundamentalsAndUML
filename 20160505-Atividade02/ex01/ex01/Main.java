package ex01;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		Calculadora calc = new Calculadora();

		float op1 = Float.valueOf(JOptionPane.showInputDialog("Insira Operador 1"));
		float op2 = Float.valueOf(JOptionPane.showInputDialog("Insira Operador 2"));
		
		switch (JOptionPane.showInputDialog("Insira Sinal da Operação (+,-,*,/)")){
		
		case "+":
			System.out.println(calc.somar(op1, op2));
			break;
		case "-":
			System.out.println(calc.subtrair(op1, op2));
			break;
		case "*":
			System.out.println(calc.multiplicar(op1, op2));
			break;
		case "/":
			System.out.println(calc.dividir(op1, op2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operação Inválida");
		}

	}

}
