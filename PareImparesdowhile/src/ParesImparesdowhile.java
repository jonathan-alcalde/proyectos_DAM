import java.util.Scanner;

public class ParesImparesdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* creamos las variables donde se introducir�n el n�mero , otra donde se guardar�n los n�mero pares, otra donde se almacenar�n
		 los n�meros impares y otras dos donde se guardaran las sumas de los numeros pares e impares  */
		  		int numero = 0;
				int sumapares = 0;
				int sumaimpares = 0;
		/* Creamos el objeto escaner donde para poder introducir por el teclado el numero que separaremos entre pares e impares*/
				Scanner teclado;
				teclado = new Scanner(System.in);
				System.out.println("Inserta un n�mero");
				numero = teclado.nextInt();
				System.out.println ("los pares de " + numero + " son :");
		/* Creamos un bucle for que crear� una variable contador donde se almacenar�n los n�meros que haya hasta el n�mero que se ha introducido al 
		 principio, despu�s el if que hay dentro del for separa los n�meros entre pares e impares y los suma entre s� */
				do
				{
						if(numero%2 == 0)
							{
							sumapares = numero + sumapares;
							System.out.println("Par: " + numero);
							System.out.println("La suma de los pares es " + sumapares);
					}
						else
						{
							sumaimpares = numero + sumaimpares;
							System.out.println( "Impar:  " + numero);
							System.out.println("La suma de los impares: " + sumaimpares);
						}
						numero--;
				}
						while(numero>=0);
				
				
					
		teclado.close();			
	}
}
