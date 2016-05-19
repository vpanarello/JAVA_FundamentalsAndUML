package ex01;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 20160517-Atividade04 / Racer.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class SendDates extends Thread {
	private long sleepMillis;
	DateTimeFormatter dateF;
	
	public SendDates(DateTimeFormatter dateFormatter,long eachSecounds, String threadName) {
		super(threadName);
		this.sleepMillis = eachSecounds * 1000;
		this.dateF = dateFormatter;
	}
	@Override
	public void run() {
		
		try {
			while(true) {
				LocalDateTime date = LocalDateTime.now();
				System.out.println(date.format(dateF));
				this.sleep(this.sleepMillis);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
