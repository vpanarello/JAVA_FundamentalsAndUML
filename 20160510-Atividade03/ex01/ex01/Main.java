package ex01;

public class Main {

	public static void main(String[] args) {
        String strFinal = "";
        
        /*
         * Vamos concatenar 65536 vezes o caractere 'a',
         * ent�o entenda que cada vez que passarmos no la�o
         * a JVM ir� criar um novo objeto em mem�ria.
         * */
        long inicio = System.currentTimeMillis();
        
        for(int i = 0; i < 100000; i ++){
               strFinal += "a";                  
        }
        
        long fim = System.currentTimeMillis();
        
        System.out.println("Final concatena��o! " + ((fim - inicio)) + " ms");
        
        
        
        StringBuilder strBuilder = new StringBuilder();
        inicio = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
               strBuilder.append("a");                 
        }
        fim = System.currentTimeMillis();
        
        
        System.out.println("Final StringBuilder! " + ((fim - inicio)) + " ms");
        

	}

}
