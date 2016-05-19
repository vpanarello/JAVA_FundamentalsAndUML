/**
 * 
 */
package ex02;

/**
 * 20160517-Atividade04 / Aviao.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class Aviao extends Thread {
	private Aeroporto ap;
	private boolean voando;

	public Aviao(String nomeVoo, Aeroporto aeroporto) {
		super();
		this.voando = true;
		this.setName(nomeVoo);
		this.ap = aeroporto;
	}
	public void decolar() throws Exception{
		if(!this.voando) {
			ap.alterarEstadoPista();
			this.voando = true;
		}
	}
	public void voar() throws InterruptedException{

		this.sleep(2000 +  (long) Math.random()*1000);
	}
	public void aterrissar() throws Exception{
		if(this.voando) {
			ap.aguardarPistaDisponivel();
			this.voando = false;	
		}
	}
	@Override
	public String toString() {
		String v = null;
		if(this.voando){
			v = "voando";
		} else v = "pousado";
		return "voo " + this.getName() + " está " + v;
	}

	@Override
	public void run() {

		while (true) {
			try {

				this.decolar();
				this.voar();
				this.aterrissar();
				this.sleep(1000 +  (long) Math.random()*1000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
