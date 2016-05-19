package ex02;
/**
 * 
 */

/**
 * 20160517-Atividade04 / Main.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class Main {

	public static void main(String[] args) {

		Aeroporto aero = new Aeroporto("Santos Dumount");

		Aviao a01 = new Aviao("TAN 123", aero);
		Aviao a02 = new Aviao("OLÉ 111", aero);		
		Aviao a03 = new Aviao("LINHA 222", aero);


		a01.start();
		a02.start();
		a03.start();

		while(true){
			try {
				Thread.sleep(1000);
				System.out.println("=== Status dos Aviões ===");
				System.out.printf("%s%n%s%n%s%n",a01,a02,a03);


			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
