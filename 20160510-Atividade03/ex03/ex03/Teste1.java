package ex03;

import static org.junit.Assert.*;

import org.hamcrest.internal.ArrayIterator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Teste1 {
	
	static ArrayListVsLinkedList teste01;
	static StackVsHashSet teste02;
	static HashMapVsWeakHashMap teste03;
	
	static int valorEncontrar;
	static int interacoes;
	static int numberOfTests;
	
	static double[] testTimmings;
	static String[] testNames;
	
	@BeforeClass
	static public void createInstances(){
		
		teste01 = new ArrayListVsLinkedList();
		teste02 = new StackVsHashSet();
		teste03 = new HashMapVsWeakHashMap();
		
		interacoes = 1000000;
		valorEncontrar = 500000;
		numberOfTests  = 0;
		
		testTimmings = new double[15];
		testNames = new String[15];
	}
	
	
	// Testes ArrayList Vs. LinkedList

	@Test
	public void popularArrayList() {
		 testTimmings[0] = teste01.insertValuesList(interacoes);
		 testNames[0] = "Populando ArrayList";
		 numberOfTests++;
	}
	@Test
	public void popularLinkedList() {
		 testTimmings[1] = teste01.insertValuesLinked(interacoes);
		 testNames[1] = "Populando LinkedList";
		 numberOfTests++;
	}
	
	@Test
	public void buscaEmArrayList() {
		 testTimmings[2] = teste01.reachValueList(valorEncontrar);
		 testNames[2] = "Acessando ArrayList";
		 numberOfTests++;
	}
	
	@Test
	public void buscaEmLinkedList() {
		 testTimmings[3] = teste01.reachValueLinked(valorEncontrar);
		 testNames[3] = "Acessando Linked";
		 numberOfTests++;
	}
	
	// Testes Stack Vs. HashSet
	
	@Test
	public void popularStack() {
		 testTimmings[4] = teste02.insertValuesStack(interacoes);
		 testNames[4] = "Populando Stack";
		 numberOfTests++;
	}
	@Test
	public void popularHashSet() {
		 testTimmings[5] = teste02.insertValuesHashSet(interacoes);
		 testNames[5] = "Populando HashSet";
		 numberOfTests++;
	}
	
	@Test
	public void buscaEmStack() {
		 testTimmings[6] = teste02.reachValueStack(valorEncontrar);
		 testNames[6] = "Acessando Stack";
		 numberOfTests++;
	}
	
	@Test
	public void buscaEmHashSet() {
		 testTimmings[7] = teste02.reachValueHashSet(valorEncontrar);
		 testNames[7] = "Acessando HashSet";
		 numberOfTests++;
	}
	
	// Testes HashMap Vs. WeakHashMap
	
	@Test
	public void popularHashMap() {
		 testTimmings[8] = teste03.insertValuesHashMap(interacoes);
		 testNames[8] = "Populando HashMap";
		 numberOfTests++;
	}
	@Test
	public void popularWeakMap() {
		 testTimmings[9] = teste03.insertValuesWeakMap(interacoes);
		 testNames[9] = "Populando WeakMap";
		 numberOfTests++;
	}
	
	@Test
	public void buscaEmHashMap() {
		 testTimmings[10] = teste03.reachValueHashMap(valorEncontrar);
		 testNames[10] = "Acessando HashMap";
		 numberOfTests++;
	}
	
	@Test
	public void buscaEmWeakMap() {
		 testTimmings[11] = teste03.reachValueWeakMap(valorEncontrar);
		 testNames[11] = "Acessando WeakMap";
		 numberOfTests++;
	}
	
	
	@AfterClass
	static public void finalizarTestes(){
		
		System.out.println("======= Todos os testes =======");
		
		for(int i = 0; i < numberOfTests; i++){
			System.out.printf("%s - T:%.0f (ms) %n", testNames[i],testTimmings[i]);
		}
		
		
		double valorMaximo = 0;
		int maxIndex = 0;
		for(int i = 0; i < numberOfTests; i++){
			if (testTimmings[i] > valorMaximo){
				valorMaximo = testTimmings[i];
				maxIndex = i;
			}
		}
		
		int minIndexPopulando = 0;
		int minIndexAcessando = 0;
		
		double menorValorPopulando =  valorMaximo; 
		double menorValorAcessando = valorMaximo;
		for(int i = 0; i < numberOfTests; i++){
			if (testTimmings[i] < menorValorPopulando && testNames[i].contains("Populando")){
				menorValorPopulando = testTimmings[i];
				minIndexPopulando = i;
			}
		if (testTimmings[i] < menorValorAcessando && testNames[i].contains("Acessando")){
			menorValorAcessando = testTimmings[i];
			minIndexAcessando = i;
			}
		}
		
		System.out.println("======= Coleções Rápidas =======");
		
		for(int i = 0; i < numberOfTests; i++){
			if (testTimmings[i] <=  testTimmings[minIndexPopulando] && testNames[i].contains("Populando")){
				System.out.printf("%s - T:%.0f (ms) %n", testNames[i],testTimmings[i]);
			}
			else if (testTimmings[i] <=  testTimmings[minIndexAcessando]){
				System.out.printf("%s - T:%.0f (ms) %n", testNames[i],testTimmings[i]);
			}	
		}		
	}
}
