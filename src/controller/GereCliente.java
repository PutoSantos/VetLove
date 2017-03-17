package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Bixos;
import model.Cliente;
import model.Vacinacoes;

public class GereCliente 
{
	ArrayList <Cliente> arCliente;
	
	public GereCliente()
	{
		this.arCliente = new ArrayList<Cliente>();
	
	}
	
	public void addCliente(String nome, String morada, String email, int telefone)
	{
		Cliente c = new Cliente(nome, morada, email, telefone);
		int novoId = arCliente.size();
		
		c.setId(novoId);
		
		arCliente.add(c);
		
		
	}
	
	public Cliente getCliente(int id)
	{
		for (Cliente c : arCliente)
		{
			if(c.getIdCliente() == id)
				return c;
		}
		return null;
	}
	
	public double getGastoVacinas(Cliente c)
	{
			double totalVacBixo = 0;
			
			for(Bixos a :c.getBixo())
			{
				double totalVacinaBixo=0;
				
				for(Vacinacoes v : a.getFicha().getVacina())
				{
					totalVacinaBixo += v.getPreco();
				}
				totalVacBixo +=  totalVacinaBixo;
				
				//totalVacBixo += a.getGastosVacinas();
			}
			return totalVacBixo;
	}
	
}
