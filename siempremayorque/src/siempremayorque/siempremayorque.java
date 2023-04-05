package siempremayorque;

import java.util.Scanner;

public class siempremayorque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Creamos 2 variables, en la primera introduciremos un número y la segunda variable sera compara 
 con ese número comprobando si es mayor para que el programa funcione */
int n1 = 0;
int n2 = 0;
Scanner numero;
numero = new Scanner(System.in);
System.out.println("Introduce un numero");
n1 = numero.nextInt();
/*Para que el primer bucle funcione n2 será igual a n1 - 1 */
n2 = n1 - 1;
do
{
	/*En el bucle primero se guardará el número en la variable n2 para ser comparado con 
	 siguiente valor que será introducido en la variable n1 */ 
	n2 = n1;
	n1 = numero.nextInt();
}
while (n1 > n2);
System.out.println("Has introducido un número menor o igual que el anterior, el programa se ha detenido");
numero.close();
	}

}
