import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_arrayAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		int posiciones = 0; //Esta variable indica el numero de posiciones que tendrá el array
		Scanner teclado = new Scanner(System.in);
		
		//Creación del array
		System.out.println("Introduce el número de datos que tendrá el array");
		posiciones = teclado.nextInt(); //Se pide al usuario que introduzca el número de índices que tendrá el array.
		int[] numeros = new int[posiciones]; // Declaración del array.
		
		//Rellenar el array de datos.
		for (int i = 1; i<=posiciones ; i++) 
		{
			numeros [i - 1] = (int)(Math.random()*99999); //Se introduce un número aleatorio al array desde el 0 hasta el 99999.
			System.out.println(numeros [i-1] + " "); //Para comprobar que los datos son aleatorios, se muestra el contenido del array.
		}
	teclado.close();
	}

}
