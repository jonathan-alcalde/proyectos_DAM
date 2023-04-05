import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* creamos las variables donde se introducirán el número , otra donde se guardarán los número pares, otra donde se almacenarán
 los números impares y otras dos donde se guardaran las sumas de los numeros pares e impares  */
  		int numero;
		int sumapares = 0;
		int sumaimpares = 0;
/* Creamos el objeto escaner donde para poder introducir por el teclado el numero que separaremos entre pares e impares*/
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Inserta un número");
		numero = teclado.nextInt();
		System.out.println ("los pares de " + numero + " son :");
/* Creamos un bucle for que creará una variable contador donde se almacenarán los números que haya hasta el número que se ha introducido al 
 principio, después el if que hay dentro del for separa los números entre pares e impares y los suma entre sí */
		for (int contador = 0; contador <= numero ; contador++)
		{
				if(contador%2 == 0)
					{
					sumapares = contador + sumapares;
					System.out.println("Par: " + contador);
					System.out.println("La suma de los pares es " + sumapares);
			}
				else
				{
					sumaimpares = contador + sumaimpares;
					System.out.println( "Impar:  " + contador);
					System.out.println("La suma de los impares: " + sumaimpares);
		}
		
		}
			
teclado.close();			

}
	}

