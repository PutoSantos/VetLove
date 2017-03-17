package model;

public class Cliente 
{
	private int idCliente;
	private String nome;
	private String morada;
	private String email;
	private int telefone;
	
	public Cliente(int id, String nome, String morada, String email, int telefone) 
	{
		super();
		this.idCliente = id;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telefone = telefone;
	}

	public int getIdCliente() 
	{
		return idCliente;
	}

	public void setId(int id) 
	{
		this.idCliente = id;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getMorada() 
	{
		return morada;
	}

	public void setMorada(String morada) 
	{
		this.morada = morada;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public int getTelefone() 
	{
		return telefone;
	}

	public void setTelefone(int telefone) 
	{
		this.telefone = telefone;
	}
	
	
}
