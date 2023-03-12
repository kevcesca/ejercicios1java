package practicaJava;

import java.time.LocalTime;

public class EjerciciosJava {
//	1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados                                     
// 	Revisar si es un triángulo válido
	
	static void calcularTriangulo(double lado1, double lado2, double lado3) {
		
		if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            double semiPerimetro = (lado1 + lado2 + lado3) / 2;
            double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));

            System.out.println("El área del triángulo es: " + area);
            
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }

	}
	
	
// 	2 Escribir un metodo para encontrar el area y la circunferencia de un circulo dado el radio
// 	Utilizar PI de la libreria de Java

	static void circunAreaCirculo(double radio) {                                                                                     

	       double area = Math.PI * Math.pow(radio, 2);
	       double circunferencia = 2 * Math.PI * radio;

	    	System.out.println("El área del círculo es: " + area);
	    	System.out.println("La circunferencia del círculo es: " + circunferencia);                                             
	}
	
// 	3 Escribir un metodo que muestre por consola la hora del sistema
// 	Utilizar e investigar la libreria de Java

	static void horaDelSistema() {
		LocalTime hora = LocalTime.now();
		
		System.out.println("La hora del sistema de java es: " + hora);
	}
	
	
// 	4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos,segundos) segun sea el caso
	
	static void convertirSegundos(int segundosIngresados) {
		
		int horas = segundosIngresados / 3600;
        int minutos = (segundosIngresados % 3600) / 60;
        int segundos = segundosIngresados % 60;

        System.out.println(segundosIngresados + " segundos equivale a " + horas + " hora(s), " + minutos + " minuto(s), y " + segundos + " segundo(s).");
    
	}
	
	
// 	5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	static void volumenEsfera(double radio) {
		double volumen = (4 / 3 ) * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen de la esfera es " + volumen);
	}
	
// 	6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	static void volumenCono(double radio, double altura) {                                                                      
		 double volumen = (1.0/3.0) * Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volumen del cono es:  " + volumen);                                                       
	}

// 	7 Encontrar el area superficial de un cubo dado un lado a
	static void areaSuperficialCubo(double ladoa) {
		double areaSuperficial = 6 * Math.pow(ladoa, 2);

    	System.out.println("El área superficial del cubo con lado es " + areaSuperficial);
	}
	
	
// 	8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	static void anioBisiesto (int anio) {				
		
		boolean bisiesto = false;
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    bisiesto = true;
                }
            } else {
                bisiesto = true;
            }
        }

        if (bisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
	}
	
//	9. Mostrar en pantalla los primeros 100 numeros primos
	static void numerosPrimos(int numerosSolicitados) {
		int division = 0, i = 1, numero = 1, primos = 0;
		
		
		do {
			do {
				division = numero%i;
				if(division==0 && i!=1 && i!= numero) {
					break;
				}
				if(numero == i) {
					System.out.println("El numero "+ numero + " es primo");
					primos++;
				}
				
				i++;
			} while (i<=numero);
			numero++;
			i = 1;
		}while(primos <= numerosSolicitados);
		
	}
	
	// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos

	// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
	
	
	// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	// 13. Escribir un método para remover espacios en blanco de un String. ej ->
	// "Hola Mundo" -> "HolaMundo"
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" ---
	// Sin usar loops
	// 15x. Escribir un metodo para encontrar el factorial de un numero sin loops

	// Actividad 1: Si X, Y, Z son variables de tipo boolean con valores X
	
//	metodo principal
	public static void main(String[] args) {
		
//		calcularTriangulo(10,22 ,31 );
		
//		circunAreaCirculo(1);
		
//		horaDelSistema();
		
//		convertirSegundos(3661);
		
//		volumenEsfera(9);

//		volumenCono(8, 18);

//		areaSuperficialCubo(11);
		
//		anioBisiesto(1998);
		
		numerosPrimos(100);
		
	}

}
