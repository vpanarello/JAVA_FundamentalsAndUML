package enumerdos;

public enum Datas {
	
	JANEIRO(1), FEVEREIRO(2), MARCO(3), ABRIL(4), MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8), SETEMBRO(9), OUTUBRO(10), NOVEMBRO(11),DEZEMBRO(12);
	
	private int month;

	private Datas(int month) {
		this.month = month;
	}
	
	public String getDate(int dia, int ano){
		return dia + "/" + this.month + "/" + ano;
	}
}
