import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_arrayAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaraci�n de variables
		int posiciones = 0; //Esta variable indica el numero de posiciones que tendr� el array
		Scanner teclado = new Scanner(System.in);
		
		//Creaci�n del array
		System.out.println("Introduce el n�mero de datos que tendr� el array");
		posiciones = teclado.nextInt(); //Se pide al usuario que introduzca el n�mero de �ndices que tendr� el array.
		int[] numeros = new int[posiciones]; // Declaraci�n del array.
		
		//Rellenar el array de datos.
		for (int i = 1; i<=posiciones ; i++) 
		{
			numeros [i - 1] = (int)(Math.random()*99999); //Se introduce un n�mero aleatorio al array desde el 0 hasta el 99999.
			System.out.println(numeros [i-1] + " "); //Para comprobar que los datos son aleatorios, se muestra el contenido del array.
		}
	teclado.close();
	}

}
