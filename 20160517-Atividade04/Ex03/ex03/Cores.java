/**
 * 
 */
package ex03;

/**
 * 20160517-Atividade04 / Cores.java
 * FIAP / RM30222 - Vagner Panarello
 */
public enum Cores {
	BRANCO(21,"branco"),
	PRETO(22,"preto"),
	VERMELHO(23,"vermelho"),
	AMARELO(24,"amarelo"),
	AZUL(25,"azul");
	
	private int code;
	private String name;
	
	Cores(int color, String nome){
		this.code = color;
		this.name = nome;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
}
