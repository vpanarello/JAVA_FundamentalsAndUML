package ex01;
import java.time.format.DateTimeFormatter;

/**
 * 
 */

/**
 * 20160517-Atividade04 / Main.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class Main {

	static final String[] mensagens = {  "Mensagem 1",
										"Mensagem 2",
										"Mensagem 3",
										"Mensagem 4",
										"Mensagem 5",
										"Mensagem 6",
										"Mensagem 7",
										"Mensagem 8",
										"Mensagem 9",
										"Mensagem 10"  };


	public static void main(String[] args) throws InterruptedException {

		SendMessages t01 = new SendMessages(mensagens,20,"Thread Mensagens");
		SendDates d01 = new SendDates(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"),10,"Thread Datas" );

		t01.start();
		d01.start();

		while(true){			
			System.out.println("==== Thread Status ==== ");
			
			System.out.printf("%s -> isAlive?: %b, Priority: %d, Status: %s %n",t01.getName(),t01.isAlive(),t01.getPriority(),t01.getState().toString());
			System.out.printf("%s -> isAlive?: %b, Priority: %d, Status: %s %n",d01.getName(),d01.isAlive(),d01.getPriority(),d01.getState().toString());
			
			Thread.sleep(5000);
		}
	}
}
