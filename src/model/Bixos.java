package model;

public class Bixos 
{
	private String classificacao;
	private String raca;
	private String dataNasc;
	Ficha ficha;
	
	public Bixos(String classificacao, String raca, String dataNasc, Ficha ficha) 
	{
		super();
		this.classificacao = classificacao;
		this.raca = raca;
		this.dataNasc = dataNasc;
		this.ficha = ficha;
	}
	
	public double getGastosVacinas()
	{
		double total = 0;
		
		for(Vacinacoes v : ficha.getVacina())
		{
			total += v.getPreco();
		}
		return total;
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
	
	public Ficha getFicha()
	{
		return ficha;
	}
	
	public void setFicha(Ficha ficha)
	{
		this.ficha = ficha;
	}
	
}
