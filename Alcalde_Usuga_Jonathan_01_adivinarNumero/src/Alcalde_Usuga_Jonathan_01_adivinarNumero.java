import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_adivinarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Creamos 2 variables, N que guardará un número aleatorio y adivinar, que guardará el número que se
 vaya metiendo por teclado  */
int N = 14;
int adivinar = 0;
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce un número.");

/*El programa irá pediendo número siempre que adivinar no sea igual a N */
do
{

	adivinar = teclado.nextInt();
	/*Si adivinar es menor que N se mostrará el mensaje indicando que N es mayor */
	
	if (adivinar < N)
	{
		System.out.println("El número es mayor, introduce otro número.");
	}
	/*Si adivinar es mayor que N se mostrará el mensaje indicando que N es menor */
	else if (adivinar > N)
	{
		System.out.println("El número es menor, introduce otro número.");
	}

}
while(adivinar != N);


/*Cuando adivinar sea igual a N se mostrará un mensaje mostrando que se a adivinado N, y
 se cierra la entrada teclado */
System.out.println("Has acertado.");
teclado.close();

	}

}
