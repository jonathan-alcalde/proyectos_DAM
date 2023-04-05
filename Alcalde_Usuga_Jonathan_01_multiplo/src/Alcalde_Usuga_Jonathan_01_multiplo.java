import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Se crean 3 variables 2 enteras que guardar�n un n�mero y el n�mero del que se quiere
		 *comprobar si es m�ltiplo */
		int numero = 0;
		int multiplo = 0;
		char continuar = 'S';
		Scanner teclado = new Scanner(System.in);
		do 
		{	
			System.out.println("Escribe un n�mero :");
			numero = teclado.nextInt();
			System.out.println("Comprobar el m�ltiplo :");
			multiplo = teclado.nextInt();
			/*Para saber si un n�mero es m�ltiplo de otro se dividen , si el resto es 0 y el cociente
			 es un n�mero natural, significa que  el primer n�mero que se ha introducido es 
			 m�ltiplo del que se ha introducido despu�s*/
			if (numero % multiplo == 0)
			{
				System.out.println( numero + " es m�ltiplo de " + multiplo);
			}
			else
			{
				System.out.println(numero + " no es m�ltiplo de " + multiplo);
			}
			System.out.println("Escribe S si quieres repetir");
			continuar = teclado.next().charAt(0);
		}
		while( continuar == 'S' || continuar == 's');
		teclado.close();
	}

}
