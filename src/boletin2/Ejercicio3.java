package boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// bloque de variables
		int num1,num2;			// aqui se registraran los numeros para la operacion
		String op;				// 
		// creamos el scanner y solicitamos los numeros
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un numero para la operacion: ");
		num1=sc.nextInt();
		System.out.println("Introduzca un 2º numero para la operacion: ");
		num2=sc.nextInt();
		// ahora vamos a solicitar una letra para ver el tipo de op que quiere
		System.out.println("A-SUMA");
		System.out.println("B-RESTA");
		System.out.println("C-MULTIPLICACIÓN");
		System.out.println("D-DIVISIÓN");
		System.out.println("Introduzca una letra para realizar la operacion: ");
		op= sc.next();
		// SEGUN LA LETRA PUES SE REALIZARA UNA OP U OTRA
		switch (op) {
		case "A", "a":
			System.out.println("la suma da como resultado: "+ (num1 + num2));
		break;
		case "B", "b":
			System.out.println("la resta da como resultado: "+ (num1 - num2));
		break;
		case "C", "c":
			System.out.println("la multiplicacion da como resultado: "+ (num1 * num2));
		break;
		case "D","d":
			System.out.println("la division da como resultado: "+ (num1 / num2));
		break;
		}
		sc.close();
	}

}
