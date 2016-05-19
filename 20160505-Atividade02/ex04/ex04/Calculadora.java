package ex04;

public class Calculadora extends RpnCalculator implements CalculadoraBasica {

	private RpnCalculator calc;

	public Calculadora() {
		super();
		this.calc = new RpnCalculator();
	}

	private float operacao(String op){	
		try {
			return (float) calc.operation(op);
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public float somar(float op1, float op2) {
		calc.pushtoStack(op1);
		calc.pushtoStack(op2);
		return operacao("+");
	}

	@Override
	public float subtrair(float op1, float op2) {
		calc.pushtoStack(op1);
		calc.pushtoStack(op2);
		return operacao("-");
	}

	@Override
	public float dividir(float op1, float op2) {
		calc.pushtoStack(op1);
		calc.pushtoStack(op2);
		return operacao("/");
	}

	@Override
	public float multiplicar(float op1, float op2) {
		calc.pushtoStack(op1);
		calc.pushtoStack(op2);
		return operacao("*");
	}


}
