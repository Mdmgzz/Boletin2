package boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//bloque de variables
		String carnet;			//el tipo de carnet que conduce
		// creamos el scanner y solicitamos el tipo de carnet
		Scanner sc=new Scanner (System.in);
		System.out.print("Introduzca ek tipo de carnet: ");
		carnet= sc.next();
		// una vez leido el tipo de carnte que tiene y guardado en la variable
		// vamos a identificar que tipo de carnet
		switch (carnet) {
		case "E" , "e": 
			System.out.print("El carnet es de tipo: Remolques");
		break;
		case "D" , "d": 
			System.out.print("El carnet es de tipo: Autobuses");
		break;
		case "C1" , "C5","c1","c5": 
			System.out.print("El carnet es de tipo: Camiones");
		break;
		case "A" , "a": 
			System.out.print("El carnet es de tipo: Motocicletas");
		break;
		case "B1" , "B2","b1","b2": 
			System.out.print("El carnet es de tipo: Automóviles");
		break;
		default:
			System.out.print("“Categoría no contemplada");
			break;
		}
		sc.close();
	}

}
