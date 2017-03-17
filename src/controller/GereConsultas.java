package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Consulta;

public class GereConsultas
{
	ArrayList<Consulta> arConsultas;
	
	public GereConsultas()
	{
		arConsultas = new ArrayList<>();
		addConsulta();
	}
	
	public void addConsulta()
	{
		
		System.out.println("Introduza a descricao: ");
			String cliente = (new Scanner(System.in).nextLine());
		System.out.println("Introduza a data: ");
			String data = (new Scanner(System.in).nextLine());
	}
}
