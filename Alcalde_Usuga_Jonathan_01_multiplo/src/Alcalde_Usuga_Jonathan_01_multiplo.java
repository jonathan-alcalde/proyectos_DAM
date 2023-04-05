import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Se crean 3 variables 2 enteras que guardarán un número y el número del que se quiere
		 *comprobar si es múltiplo */
		int numero = 0;
		int multiplo = 0;
		char continuar = 'S';
		Scanner teclado = new Scanner(System.in);
		do 
		{	
			System.out.println("Escribe un número :");
			numero = teclado.nextInt();
			System.out.println("Comprobar el múltiplo :");
			multiplo = teclado.nextInt();
			/*Para saber si un número es múltiplo de otro se dividen , si el resto es 0 y el cociente
			 es un número natural, significa que  el primer número que se ha introducido es 
			 múltiplo del que se ha introducido después*/
			if (numero % multiplo == 0)
			{
				System.out.println( numero + " es múltiplo de " + multiplo);
			}
			else
			{
				System.out.println(numero + " no es múltiplo de " + multiplo);
			}
			System.out.println("Escribe S si quieres repetir");
			continuar = teclado.next().charAt(0);
		}
		while( continuar == 'S' || continuar == 's');
		teclado.close();
	}

}
