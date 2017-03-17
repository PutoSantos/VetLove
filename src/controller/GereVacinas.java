package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Vacinacoes;

public class GereVacinas
{
	ArrayList<Vacinacoes> arVacinacoes;
	
	public GereVacinas()
	{
		arVacinacoes = new ArrayList<>();
		addVacinacoes();
	}
	
	public void addVacinacoes()
	{
		System.out.println("Introduza a data da vacina: ");
			String data = (new Scanner(System.in).nextLine());
		System.out.println("Introduza o nome da vacina: ");
			String nomeVacina = (new Scanner(System.in).nextLine());
		System.out.println("Introduza o preco da vacina: ");
			int preco = (new Scanner(System.in).nextInt());
	}
}
