package model;

public class Vacinacoes 
{
	private String data;
	private String nomeVacina;
	private int preco;
	
	public Vacinacoes(String data, String nomeVacina, int preco) 
	{
		super();
		this.data = data;
		this.nomeVacina = nomeVacina;
		this.preco = preco;
	}

	public String getData() 
	{
		return data;
	}

	public void setData(String data) 
	{
		this.data = data;
	}

	public String getNomeVacina() 
	{
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) 
	{
		this.nomeVacina = nomeVacina;
	}

	public int getPreco() 
	{
		return preco;
	}

	public void setPreco(int preco) 
	{
		this.preco = preco;
	}
	
	
}
