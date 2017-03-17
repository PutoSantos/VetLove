package model;

public class Bixos 
{
	private String classificacao;
	private String raca;
	private String dataNasc;
	
	public Bixos(String classificacao, String raca, String dataNasc) 
	{
		super();
		this.classificacao = classificacao;
		this.raca = raca;
		this.dataNasc = dataNasc;
	}

	public String getClassificacao() 
	{
		return classificacao;
	}

	public void setClassificacao(String classificacao) 
	{
		this.classificacao = classificacao;
	}

	public String getRaca() 
	{
		return raca;
	}

	public void setRaca(String raca) 
	{
		this.raca = raca;
	}

	public String getDataNasc() 
	{
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) 
	{
		this.dataNasc = dataNasc;
	}
	
	
}
