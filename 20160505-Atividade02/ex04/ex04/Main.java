package ex04;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();

		float op1;
		float op2;
		try {
			op1 = Float.valueOf(JOptionPane.showInputDialog("Insira Operador 1"));
			
			if (op1 == 0) throw new CalculatorException("Operador 1 n�o pode ser 0 (zero)");
			op2 = Float.valueOf(JOptionPane.showInputDialog("Insira Operador 2"));
			
			String var = JOptionPane.showInputDialog("Insira Sinal da Opera��o (+,-,*,/)");
			switch (var){
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
					throw new CalculatorException("'" + var + "' N�o � um operador especificado v�lido");
			}
						
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"A entrada n�o � v�lida: (" + e.getMessage() + ")");
		} catch (CalculatorException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}	
}