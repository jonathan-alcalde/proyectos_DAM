import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_adivinarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Creamos 2 variables, N que guardar� un n�mero aleatorio y adivinar, que guardar� el n�mero que se
 vaya metiendo por teclado  */
int N = 14;
int adivinar = 0;
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce un n�mero.");

/*El programa ir� pediendo n�mero siempre que adivinar no sea igual a N */
do
{

	adivinar = teclado.nextInt();
	/*Si adivinar es menor que N se mostrar� el mensaje indicando que N es mayor */
	
	if (adivinar < N)
	{
		System.out.println("El n�mero es mayor, introduce otro n�mero.");
	}
	/*Si adivinar es mayor que N se mostrar� el mensaje indicando que N es menor */
	else if (adivinar > N)
	{
		System.out.println("El n�mero es menor, introduce otro n�mero.");
	}

}
while(adivinar != N);


/*Cuando adivinar sea igual a N se mostrar� un mensaje mostrando que se a adivinado N, y
 se cierra la entrada teclado */
System.out.println("Has acertado.");
teclado.close();

	}

}
