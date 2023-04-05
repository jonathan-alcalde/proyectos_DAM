package calculadoraifwhile;

import java.util.Scanner;

public class calculadoraifwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Declaramos e iniciamos las variables, se declaran 4 variables reales, "n1" y "n2" serán 
		 los operandos, "resultado" será el resultado de la operación indicada y "resto" para en caso
		 de hacerse una división que muestre también el resto, se crean dos variables enteras
		 "operación" donde se guardara el número que esta asociado a una operación y "continuar"
		 que almacenará un número que se pide al finalizar el programa */
		double n1 = 0;
		double n2 = 0;
		double resultado = 0;
		double resto = 0;
		int operacion = 0;
		int continuar = 0;
		//Importamos java.util.Scanner para crear un objeto Scanner y asi poder introducir los datos que se pidan por teclado
		Scanner escanercalculadora;
		escanercalculadora = new Scanner (System.in);
		/*Creamos un bucle while donde al finalizar la operación, se pedirá 
		un número que si es 0 repetirá el programa*/
		while (continuar == 0)
		{
		/*Ahora pedimos al usuario que introduzca los operandos y después que escriba un número que se
		 correspondrá con una operación */	
		System.out.println("Dame un numero: ");
		n1 = escanercalculadora.nextDouble();
		System.out.println("Dame otro numero: ");
		n2 = escanercalculadora.nextDouble();
		System.out.println("Escribe 1 para hacer una suma");
		System.out.println("Escribe 2 para hacer una resta");
		System.out.println("Escribe 3 para hacer una multiplicación");
		System.out.println("Escribe 4 para hacer una división");
		System.out.println("Escribe 5 para hacer una potencia");
		operacion = escanercalculadora.nextInt();
		/*Ahora creamos una cadena con la sentencia if que irá comprobando la variable "operacion"
		 hasta que se corresponda con la operación que se quiere realizar */
		if (operacion == 1)
			{
				resultado = n1 + n2;
				System.out.println ("El total es "+ resultado);
			}
		else
			{
				if(operacion == 2)
				{
					resultado = n1-n2;
					System.out.println ("La diferencia es "+ resultado);
				}
				else
				{
					if(operacion == 3)
					{
						resultado = n1*n2;
						System.out.println ("El producto es "+ resultado);
					}
					else
						
					{
						if(operacion == 4)
						{
				/*En la división colocamos dos operaciones para que se calcule y muestre 
				 tanto el resto como el cociente */ 
						resultado = n1/n2;						
						resto = n1%n2;
						System.out.println ("El cociente es "+ resultado);
						System.out.println (" resto es "+ resto);
					    }
					else
						{						
						if (operacion == 5)
						{
							/* para la potencia primero creamos un if que comprobará si "n2" no es igual a 0,
							si "n2" es 0 el resultado será 1, sino, realizará la potencia de forma normal */
						if (n2!=0)
						{
							/*Si se cumple la condición, "resultado" será igual a "n1" y se repetirá un bucle hasta que "n2" llegue a 1 */
							resultado = n1;
							while (n2 > 1)
							{
								/* dentro del bucle multiplicamos resultado por "n1" y se almacenará el resultado en "resultado"y restamos a "n2" 1 para contar realizará la multiplicación*/
								resultado = resultado*n1;
								n2--;
							}
							System.out.println("El resultado es " + resultado);
						}
							else
							{
								resultado = 1;
								System.out.println("El resultado es " + resultado);
						}
						}
						
					}
					
				}
			}
				/*Ahora, una vez mostrado el resultado se mostrará un mensaje indicando al usuario que introduzca el
				 nuevo valor de continuar*/
		System.out.println("Si quieres realizar otra operación escribe 0");
		continuar = escanercalculadora.nextInt();
			}
		}
		escanercalculadora.close();
	}
		
	}


	


