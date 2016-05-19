package ex01;
/**
 * 
 */

/**
 * 20160517-Atividade04 / MyThread.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class SendMessages extends Thread {
	private String[] messages;
	private long sleepMillis;
	
	public SendMessages(String[] messages, long eachSecounds, String threadName) {
		super(threadName);
		this.messages = messages;
		this.sleepMillis = eachSecounds * 1000;
	}
	public void run(){
		
		try {
			for (String msg : messages) {
				System.out.println(msg);
				this.sleep(this.sleepMillis);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
