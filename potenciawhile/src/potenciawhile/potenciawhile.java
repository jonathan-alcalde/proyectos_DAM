package potenciawhile;

import java.util.Scanner;

public class potenciawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 0;
int m = 0;
int resultado = 1;
Scanner teclado;
teclado = new Scanner(System.in);
System.out.println("Introduce una base: ");
n = teclado.nextInt();
System.out.println("Introduce un exponente: ");
m = teclado.nextInt();
if (m!=0)
{
	do
	{
		resultado = resultado*n;
		m--;
	}
	while (m > 1);
}
System.out.println("El resultado es: " + resultado);
teclado.close();

	}

}
