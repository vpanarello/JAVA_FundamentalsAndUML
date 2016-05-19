
//## Exercício 2 - Saída no console

//2012-09-10 12:00
//10-09-12 12:00:00
//MONDAY(dia da semana)
//2012(ano)
//AD (anno Domini)

package ex02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		LocalDateTime d = LocalDateTime.of(2012, 9, 10, 12, 0);
		
		LocalDateTime d1 = LocalDateTime.now();
		
		
		
		System.out.println(d.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
		System.out.println(d.format(DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:ss")));
		System.out.println(d.getDayOfWeek() + "(dia da semana)");
		System.out.println(Math.abs(d.getYear()) + "(ano)");
		if (d.getYear() < 0) System.out.println("BC (before Christ)");
		else System.out.println("AD (anno Domini)");
		
	}
}
