/**
 * 
 */
package ex02;

/**
 * 20160517-Atividade04 / Aeroporto.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class Aeroporto{
	private String nomeAeroporto;
	private boolean pistaDisponivel;

	public Aeroporto(String nomeAeroporto) {
		super();
		this.nomeAeroporto = nomeAeroporto;
		pistaDisponivel = true;
	}

	public synchronized void aguardarPistaDisponivel() throws Exception{
		while(!pistaDisponivel){
			wait();
		}
		pistaDisponivel = false;
	}
	public synchronized boolean alterarEstadoPista() throws Exception{

		pistaDisponivel = true;

		notifyAll();
		return false;
	}	
}
