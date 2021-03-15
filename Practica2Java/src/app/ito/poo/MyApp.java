package app.ito.poo;

import java.time.LocalDate;

//import  java.util.ArrayList;
import java.util.Scanner;

import Clases.ito.poo.CuentaBancaria;

public abstract class MyApp {

		private static int saldo;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
		saldo();
		
	}
		
	static void run() {
		System.out.println(new CuentaBancaria(89393L,"Lucia Mendoza",15000,
				LocalDate.of(2021, 2,18),null));
		
	}
	
	static void saldo() {
		
		Scanner sc = new Scanner(System.in);
		
		float cantidad;
				
		System.out.println("Ingrese la cantidad que desea depositar");
		cantidad= sc.nextInt();
				
		if (cantidad>=0);
		
		
		
		float saldo =15000 ;
		//int cantidad=0;
		System.out.println((saldo= saldo+ cantidad));
		System.out.println(new CuentaBancaria(89393L,"Lucia Mendoza",saldo,
				LocalDate.of(2021, 2,18),LocalDate.of(2021, 2,19)));
		
		
		float cantidad1;
				
		System.out.println("Ingrese la cantidad que desea retirar");
		cantidad1= sc.nextInt();
				
		if (cantidad1<=saldo);
		
		
		float saldo1 =15000 ;
		//int cantidad1=5000;
		System.out.println((saldo1= saldo1- cantidad1));
		System.out.println(new CuentaBancaria(89393L,"Lucia Mendoza",saldo1,
				LocalDate.of(2021, 2,18),LocalDate.of(2021, 2,19)));
	}
	

	
}
