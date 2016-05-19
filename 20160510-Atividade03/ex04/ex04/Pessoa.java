package ex04;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private String empresa;
	private int idade;
	private char sexo;
	
	
	
	public Pessoa(String nome, String empresa, int idade, char sexo) {
		super();
		this.nome = nome;
		this.empresa = empresa;
		this.idade = idade;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public int getIdade() {
		return idade;
	}
	public char getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		return "[" + nome + ", " + empresa + ", " + idade + ", " + sexo + "]";
	}
	@Override
	public int compareTo(Pessoa p) {
		if (this.idade < p.idade) {
			return -1;
		}
		if (this.idade > p.idade) {
			return 1;
		}
		return 0;
	}

}
