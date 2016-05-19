package enumerdos;

public enum Color  {
	RED(255,0,0), BLUE(0,0,255), YELLOW(255,255,0), BLACK(0,0,0);
	
	private int red;
	private int green;
	private int blue;
	
	private Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public String rgbValue(){
		return "{" + this.red + " " + this.green + " " + this.blue + "}";
		
	}
	
	public String Cor(int c){
		switch (c){
		case 1:
			return "Vermelho" + this.red;
		case 2:
			return "Amarelo" + this.green;
		case 3:
			return "Verde" + this.blue;
		default:
			return "Nothing";
		}
	}
	
	@Override
	public String toString() {
		return "Enumerado de Cores";
	}
	
	
	
}
