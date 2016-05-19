package ex04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	static ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

	public static void main(String[] args) {
		
		lista.add(new Pessoa("João Garcia", "AIK Enteprises", 20, 'M'));
		lista.add(new Pessoa("Maria Martins", "Simples", 44, 'F'));
		lista.add(new Pessoa("Henrique Fernando","AIK Enterprises", 43, 'M'));
		lista.add(new Pessoa("Inacio Luis", "Magazine André", 33, 'M'));
		lista.add(new Pessoa("Fernando Ferreira", "Casas Recife", 87, 'M'));
		
		System.out.println(lista);
		
		Collections.sort(lista);
		
		System.out.println(lista);
		
		
		
		
		
		

	}

}
