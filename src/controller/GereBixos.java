package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Bixos;

public class GereBixos 
{

	ArrayList <Bixos> arBixos;
	
	public GereBixos()
	{
		arBixos = new ArrayList<>();
		
		addBixo();
	}
	
	public void addBixo()
	{
		System.out.println("Introduza a classificacao do animal: ");
			String classificacao = (new Scanner(System.in).nextLine());
		System.out.println("Introduza a raca do animal: ");
			String raca = (new Scanner(System.in).nextLine());
		System.out.println("Introduza a data de nascimento: ");
			String dataNasc = (new Scanner(System.in).nextLine());
		
		
	}
}
