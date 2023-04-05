package factorialdowhile;

import java.util.Scanner;

public class factorialdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		int factorial = 1;
		int resultado = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		numero = teclado.nextInt();
		do
		{
		System.out.println(factorial + " es factorial de " + numero);
			resultado = factorial * resultado;
			factorial++	;	
		}
		while (factorial <= numero);
			System.out.println(resultado);
			teclado.close();

	}

}
