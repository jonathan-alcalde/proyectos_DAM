package contadornumerospositivos;

import java.util.Scanner;

public class contadornumerospositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Declaramos 2 variables, cantidad, que ser� la veces que pedir� un n�mero y 
 numero que ser� el n�meroq ue se escribir� para continuar la serie */		
int cantidad = 0;
int numero = 0;
/*Se crea un objeto Scanner */
Scanner teclado = new Scanner (System.in);
/*Pedimos que se inserte un valor a la variable cantidad */
System.out.println("Escribe la cantidad de n�meros que se van a escribir");
cantidad = teclado.nextInt();
/*Mientras que cantidad sea mayor que 0 se repetir� este bucle */ 
do
{
	numero = teclado.nextInt();
	/*El programa solo debe restar a cantidad cuando el n�mero introducido sea positivo */
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
