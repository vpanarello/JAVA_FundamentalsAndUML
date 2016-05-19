/**
 * 
 */
package ex03;

/**
 * 20160517-Atividade04 / Main.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class Main {

	public static void main(String[] args) {
		
		for(Cores cor : Cores.values()){
			System.out.printf("%s - %d%n",cor.getName(),cor.getCode());
		}
		
		System.out.printf("%nCod. Branco: %d", Cores.BRANCO.getCode());
	}

}
