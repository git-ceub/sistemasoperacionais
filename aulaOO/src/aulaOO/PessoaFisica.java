package aulaOO;

public class PessoaFisica extends Pessoa {
	
	private String cpf;

	public PessoaFisica(String cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisica() {
	}
	
	public PessoaFisica(String nome, 
			String email, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	public void escreverEmail() {
		System.out.println("Email de Pessoa Fisica " + this.nome);
		super.escreverEmail();
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
