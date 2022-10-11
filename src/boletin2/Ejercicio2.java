package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Bloque de variables
		int numero;			//resgistrara el numero del dia de la semana
		// creamos el scanner y solicitamos el numero
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un numero de dia de la semana: ");
		numero=sc.nextInt();
		// asociamos los numeros 1-7 a cada dua de la semana
		switch (numero) {
		case 1: 
			System.out.println("LUNES ");
			break;
		case 2: 
			System.out.println("MARTES");
			break;
		case 3: 
			System.out.println("MIERCOLES");
			break;
		case 4: 
			System.out.println("JUEVES");
			break;
		case 5: 
			System.out.println("VIERNES");
			break;
		case 6: 
			System.out.println("SABADO");
			break;
		case 7: 
			System.out.println("DOMINGO");
			break;
		default :
			System.out.println("INTRODUCE UN VALOR CORRECTO.");
		}
		sc.close();
	}
	

}
