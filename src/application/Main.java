package application;

import controller.GereBixos;
import controller.GereCliente;
import controller.GereConsultas;
import controller.GereVacinas;

public class Main {

	public static void main(String[] args) 
	{
		new GereCliente();
		new GereBixos();
		new GereConsultas();
		new GereVacinas();

	}

}
