package media;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero = 0;
int media = 0;
int total = 0;
int numerodato = -1;
Scanner teclado = new Scanner(System.in);
do
{
	System.out.println("Introduce un número");
	numerodato++;
	numero = teclado.nextInt();
	total = total + numero;
}
while(numero>=0);
media = total / numerodato;
System.out.println("la media es de " + media);
teclado.close();
	}

}
