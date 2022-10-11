package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Bloque de variables
		int numero; 		//se guarda el numero para comprobar la nota
		// creamos el Scanner y pedimos al usuario un numero real
		Scanner sc=new Scanner (System.in);
		System.out.println("INTRODUZCA UNA NOTA: ");
		numero=sc.nextInt();
		// comprobamamos la nota
		switch (numero) {
			case 0,1,2,3,4 :
				System.out.println("La nota es Insuficiente.");
				break;
			
			case 5,6 :
				System.out.println("La nota es Bien.");
				break;
			
			case 7,8 :
				System.out.println("La nota es Notable.");
				break;
			
			case 9,10 :
				System.out.println("La nota es Sobresaliente.");
				break;
			default:
				System.out.println("VALOR INTRODUCIDO: NO PERMITIDO");
		}
		sc.close();
	}

}
