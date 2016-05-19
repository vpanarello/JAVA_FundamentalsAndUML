package ex03;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapVsWeakHashMap {
	
	private HashMap<Integer, Integer> mapa;
	private WeakHashMap<Integer, Integer> weakMap;
	
	public HashMapVsWeakHashMap() {
		super();
		mapa = new HashMap<>();
		weakMap = new WeakHashMap<>();
	}

	public double insertValuesHashMap(int interacoes){
		
		double tInicial = System.currentTimeMillis();
		for(int i = 1; i <= interacoes; i++){
			mapa.put(i, i);
		}
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
	
	public double insertValuesWeakMap(int interacoes){
		
		double tInicial = System.currentTimeMillis();
		for(int i = 1; i <= interacoes; i++){
			weakMap.put(i, i);
		}
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
	
	public double reachValueHashMap(int value){
		
		double tInicial = System.currentTimeMillis();
		
		mapa.get(value);
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
	
	public double reachValueWeakMap(int value){
		
		double tInicial = System.currentTimeMillis();
		
		weakMap.get(value);
		
		double tFinal = System.currentTimeMillis();
		return tFinal - tInicial;
	}
}
