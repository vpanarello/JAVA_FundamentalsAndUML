package ex03;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class StackVsHashSet {
	
	Stack<Integer> pilha;
	Set<Integer> hashSet;
	

	public StackVsHashSet() {
		super();
		pilha = new Stack<>();
		hashSet = new HashSet<>();
	}

	public double insertValuesStack(int interacoes){
		
		double tInicial = System.currentTimeMillis();
		for(int i = 1; i <= interacoes; i++){
			pilha.push(i);
		}
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
	
	public double insertValuesHashSet(int interacoes){
		
		double tInicial = System.currentTimeMillis();
		for(int i = 1; i <= interacoes; i++){
			hashSet.add(i);
		}
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
	
	public double reachValueStack(int value){
		
		double tInicial = System.currentTimeMillis();
		
		pilha.indexOf(value);
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
	
	public double reachValueHashSet(int value){
		
		double tInicial = System.currentTimeMillis();
		
		hashSet.contains(value);
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}

}