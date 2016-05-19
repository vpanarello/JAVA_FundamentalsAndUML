package ex01;

public class StringsCheckPerformance {
	
	public static long concatenacao(int interacoes) {
        String strFinal = "";
        
		long inicio = System.currentTimeMillis();
        for(int i = 0; i < interacoes; i ++){
               strFinal += "a";                  
        }
	    long fim = System.currentTimeMillis();
	    
		return  fim - inicio;        
	}
	
	public static long classStringBuilder(int interacoes){
		StringBuilder strBuilder = new StringBuilder();
		
		long inicio = System.currentTimeMillis();
        for(int i = 0; i < interacoes; i ++){
               strBuilder.append("a");                 
        }
        long fim = System.currentTimeMillis();
        
    	return  fim - inicio;
	}
	
	static long classStringBuffer(int interacoes) {
        StringBuffer strBuffer = new StringBuffer();
        
        long inicio = System.currentTimeMillis();
        for(int i = 0; i < interacoes; i ++){
               strBuffer.append("a");
        }
        long fim = System.currentTimeMillis();
        
		return  fim - inicio;
	}
}