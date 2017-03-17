package model;

public class Ficha 
{
	private int id;
	private String cliente;
	private String vacinas;
	
	
	public Ficha(int id, String cliente, String vacinas) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.vacinas = vacinas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getVacinas() {
		return vacinas;
	}
	public void setVacinas(String vacinas) {
		this.vacinas = vacinas;
	}
	
	
}
