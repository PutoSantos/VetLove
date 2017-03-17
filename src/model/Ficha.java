package model;

import java.util.ArrayList;

public class Ficha 
{
	
	private int id;
	private String cliente;
	private String vacinas;
	ArrayList<Vacinacoes> vacina;
	ArrayList<Consulta> consultas;
	
	
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
	
	public ArrayList<Vacinacoes> getVacina() {
		return vacina;
	}
	public void setVacina(ArrayList<Vacinacoes> vacina) {
		this.vacina = vacina;
	}
	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}
	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}
	
}
