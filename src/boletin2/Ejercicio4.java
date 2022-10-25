package boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// bloque de variables
		String primera,segunda;					// se guardaran el valor obtenido dsp de la tirada 
		// creamos scanner y preguntadmos
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduzca el valor obtenido en la 1º (Con letras): ");
		primera=sc.next();
		
		System.out.println("Introduzca el valor obtenido en la 2º( Con letras): ");
		segunda=sc.next();
		
		int num1 = switch (primera){			// aqui se guardaran los numeros obtenidos en la tirada
		case "UNO"->{
			yield 1;	//corresponde con el numero 1
		}
		case "DOS"->{
			yield 2;	//corresponde con el numero 2
		}
		case "TRES"->{
			yield 3;	//corresponde con el numero 3
		}
		case "CUATRO"->{
			yield 4;	//corresponde con el numero 4
		}
		case "CINCO"->{
			yield 5;	//corresponde con el numero 5
		}
		case "SEIS"->{
			yield 6;	//corresponde con el numero 6
		}
		default -> {
			System.out.print("Unexpected value: " + primera);
			yield -1;
		}
		};
		
		int num2 = switch (segunda){			// aqui se guardaran los numeros obtenidos en la tirada
		case "UNO"->{
			yield 1;	//corresponde con el numero 1
		}
		case "DOS"->{
			yield 2;	//corresponde con el numero 2
		}
		case "TRES"->{
			yield 3;	//corresponde con el numero 3
		}
		case "CUATRO"->{
			yield 4;	//corresponde con el numero 4
		}
		case "CINCO"->{
			yield 5;	//corresponde con el numero 5
		}
		case "SEIS"->{
			yield 6;	//corresponde con el numero 6
		}
		default -> {
			System.out.print("Unexpected value: " + segunda);
			yield -1;
		}
	};
	if (num1>0 && num2>0){
		System.out.print("El valor de la tirada es de: "+(num1+num2));
	}
	sc.close();
	}
	
	}


