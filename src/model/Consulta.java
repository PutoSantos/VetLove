package model;

public class Consulta 
{
	private String Cliente;
	private String data;
	
	public Consulta(String cliente, String data) 
	{
		super();
		Cliente = cliente;
		this.data = data;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
	
}
