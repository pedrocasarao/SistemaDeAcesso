package sistemadeacesso.michael.pucrs.br;

public class Cliente {
	private String nome;
	private int idade;
	public Cliente (String nome , int idade)
	{
		this.idade = idade;
		this.nome= nome;
	}
	public String getNome()
	{
		return nome;
	}
	public int getIdade()
	{
		return idade;
	}
}
