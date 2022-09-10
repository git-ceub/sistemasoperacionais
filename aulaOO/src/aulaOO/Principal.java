package aulaOO;

public class Principal {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Francisco Molina");
		pessoa.setEmail("francisco@ceub.edu.br");
		pessoa.escreverEmail();
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Fulano");
		pf.setEmail("fulano@gmail.com");
		pf.setCpf("89898989");
		pf.escreverEmail();
		
		PessoaFisica pf1 = 
	new PessoaFisica("Siclano", "siclano@gmail.com", "55555");
		pf1.escreverEmail();
		
	}
}
