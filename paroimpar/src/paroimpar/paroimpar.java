package paroimpar;

import java.util.Scanner;

public class paroimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**Declaramos las variables enteras para el número que se vaya a comoprobar, el resultado */ 
int numeroacomparar;
int resultado;
int continuar;
/**Creamos la variable Scanner para pedir un número por teclado*/
Scanner pedirnumero;
pedirnumero = new Scanner (System.in);
/** pedimos al sistema que muestre un mensaje */
System.out.println("Escribe el número que quieras saber si es par o impar :");
numeroacomparar = pedirnumero.nextInt();
/** para saber si es par o impar metemos la variable que contiene el número que queremos saber si es par o impar entre 2 */
resultado = numeroacomparar % 2;
/** y con la la variable resultado la con 0 para saber si es par  o impar */
if (resultado == 0)
	{
	System.out.println( numeroacomparar + " es par");
	}
else
{
	System.out.println ( numeroacomparar + " es impar");
}
/** tras finalizar el primer if indicamos con un mensaje si el usuario quiere o no continuar
 mostrando que con el numero 0 el programa continue y con cualquier otro número el programa se detenga */
System.out.println("Escribe 0 para continuar o escribe cualquier otro número para terminar:");
/** Volvemos a pedir un numero para saber si el usuario va a continuar */
 continuar= pedirnumero.nextInt();

/**En el if comparamos el valor de (continuar) con el numero 0*/
  if(continuar == 0)
 
{
	  /**y repetimos el proceso anterior para saber si el numero es par o impar */
	System.out.println("Escribe el número que quieras saber si es par o impar:");
	numeroacomparar = pedirnumero.nextInt();
	resultado = numeroacomparar % 2;
	if(resultado == 0)
		{
		System.out.println(numeroacomparar + " es par");
		}
	else
	{
		System.out.println(numeroacomparar + " es impar");
	}
	
}
pedirnumero.close();
	}

}
