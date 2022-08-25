package view;

import java.util.Scanner;

import controller.SomaNController;

public class Principal {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 int numero = scan.nextInt();
	 scan.close();
	 double print = 0; 
	 double aux = 1;
	 SomaNController novo = new SomaNController();
	 print = novo.soma(numero, aux);
	 System.out.println(print);
	}

}
