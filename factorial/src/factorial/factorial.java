package factorial;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero = 0;
int resultado = 1;
Scanner teclado = new Scanner(System.in);
System.out.println("Introduce un número");
numero = teclado.nextInt();
for (int factorial = 1; factorial <= numero ; factorial++)
{
System.out.println(factorial + " es factorial de " + numero);
	resultado = factorial * resultado;
	
}
	System.out.println(resultado);
	teclado.close();

}
}
