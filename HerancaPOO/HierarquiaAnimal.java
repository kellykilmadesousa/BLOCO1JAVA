package BLOCO1JAVA.HerancaPOO;
/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/
public class HierarquiaAnimal {
	
	private String nome;
	private int idade;
	
	public void DeveEmitirSom()
	{
		System.out.println("O animal está emitindo som...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}