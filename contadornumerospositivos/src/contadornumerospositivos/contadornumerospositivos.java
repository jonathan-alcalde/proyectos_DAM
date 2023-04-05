package contadornumerospositivos;

import java.util.Scanner;

public class contadornumerospositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Declaramos 2 variables, cantidad, que será la veces que pedirá un número y 
 numero que será el númeroq ue se escribirá para continuar la serie */		
int cantidad = 0;
int numero = 0;
/*Se crea un objeto Scanner */
Scanner teclado = new Scanner (System.in);
/*Pedimos que se inserte un valor a la variable cantidad */
System.out.println("Escribe la cantidad de números que se van a escribir");
cantidad = teclado.nextInt();
/*Mientras que cantidad sea mayor que 0 se repetirá este bucle */ 
do
{
	numero = teclado.nextInt();
	/*El programa solo debe restar a cantidad cuando el número introducido sea positivo */
	if (numero >= 0)
	{
		cantidad--;
	}	
}
while (cantidad > 0);
teclado.close();
System.out.println("El programa ha terminado");
	}

}
