package br.edu.infnet.prjatm;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo!");		
		System.out.print("Por favor, entre com seu número da conta: ");
		Scanner scan = new Scanner(System.in);
		int numeroConta = scan.nextInt();
		System.out.println(numeroConta);
		System.out.print("Entre com seu PIN:");
		
	}
}
