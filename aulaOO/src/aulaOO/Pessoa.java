package aulaOO;

public class Pessoa {
	
	// Atributos
	protected String nome;
	protected String email;
	
	// Metodos
	public void escreverEmail() {
		System.out.println("Email enviado! "
				+ "para " + this.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
