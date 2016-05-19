package ex01;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PerformanceCheck {
	
	private static int interacoes;
	private static long[] tempo = new long[3];	
	@BeforeClass
	static public void inicialization(){
		interacoes = 100000;		
	}
	@Test
	public void testStringSimpleConcatenate() {
		tempo[0] = StringsCheckPerformance.concatenacao(interacoes);
	}
	@Test
	public void testStringBulder() {
		tempo[1] = StringsCheckPerformance.classStringBuilder(interacoes);
	}
	@Test
	public void testStringBuffer() {
		tempo[2] = StringsCheckPerformance.classStringBuffer(interacoes);
	}
	@AfterClass
	static public void finalCalculation(){
		System.out.printf("Simples: %d (ms) - %.3f (s)%n",tempo[0],((float)tempo[0]/1000));
		System.out.printf("StringBuilder: %d (ms) - %.3f (s)%n",tempo[1],((float)tempo[1]/1000));
		System.out.printf("StringBuffer: %d (ms) - %.3f (s)%n",tempo[2],((float)tempo[2]/1000));
	}
}
