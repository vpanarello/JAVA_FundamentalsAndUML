package ex03;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
	
	ArrayList<Integer> lista;
	LinkedList<Integer> linkada;
	

	public ArrayListVsLinkedList() {
		super();
		lista = new ArrayList<>();
		linkada = new LinkedList<>();
	}

	public double insertValuesList(int interacoes){
		
		double tInicial = System.currentTimeMillis();
		for(int i = 1; i <= interacoes; i++){
			lista.add(i);
		}
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
	
	public double insertValuesLinked(int interacoes){
		
		double tInicial = System.currentTimeMillis();
		for(int i = 1; i <= interacoes; i++){
			linkada.add(i);
		}
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
	
	public double reachValueList(int value){
		
		double tInicial = System.currentTimeMillis();
		
		lista.indexOf(value);
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
	
	public double reachValueLinked(int value){
		
		double tInicial = System.currentTimeMillis();
		
		linkada.indexOf(value);
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}

}
