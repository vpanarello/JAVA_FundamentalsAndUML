package ex01;

public class Main {

	public static void main(String[] args) {
        String strFinal = "";
        
        /*
         * Vamos concatenar 65536 vezes o caractere 'a',
         * então entenda que cada vez que passarmos no laço
         * a JVM irá criar um novo objeto em memória.
         * */
        long inicio = System.currentTimeMillis();
        
        for(int i = 0; i < 100000; i ++){
               strFinal += "a";                  
        }
        
        long fim = System.currentTimeMillis();
        
        System.out.println("Final concatenação! " + ((fim - inicio)) + " ms");
        
        
        
        StringBuilder strBuilder = new StringBuilder();
        inicio = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
               strBuilder.append("a");                 
        }
        fim = System.currentTimeMillis();
        
        
        System.out.println("Final StringBuilder! " + ((fim - inicio)) + " ms");
        

	}

}
