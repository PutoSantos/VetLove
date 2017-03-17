package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class GereCliente 
{
	ArrayList <Cliente> arCliente;
	
	public GereCliente()
	{
		arCliente = new ArrayList<>();
	
		addCliente();
	
	}
	
	public void addCliente()
	{
		System.out.println("Introduza o nome do cliente: ");
			String nome = (new Scanner(System.in).nextLine());
		System.out.println("Introduza a morada do cliente: ");
			String morada = (new Scanner(System.in).nextLine()); 
		System.out.println("Introduza o email do cliente: ");
			String email = (new Scanner(System.in).nextLine());
		System.out.println("Introduza o telefone do cliente: ");
			int telefone = (new Scanner(System.in).nextInt());
	}
	
	
}
