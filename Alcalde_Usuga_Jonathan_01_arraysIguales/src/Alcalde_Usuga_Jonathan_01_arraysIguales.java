import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_arraysIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variables
		int posiciones = 0; //Esta variable indica el numero de posiciones que tendrá el primer array.
		int posiciones2 = 0; //Esta variable indica el numero de posiciones que tendrá el segundo array.
		
		int comparacion = 0; //Esta variable se utilizará para comparar que en cada posición de los 2 arrays, los valores son iguales. 
		boolean arraysiguales = true; //Esta variable comprobará si los 2 arrays son iguales. 
		Scanner teclado = new Scanner(System.in);
		
		//Creación de los arrays
		System.out.println("Introduce el número de datos que tendrá el primer array");
		posiciones = teclado.nextInt(); //Se pide al usuario que introduzca el número de índices que tendrá el primer array.
		
		System.out.println("Introduce el número de datos que tendrá el segundo array");
		posiciones2 = teclado.nextInt(); //Se pide al usuario que introduzca el número de índices que tendrá el segundo array.
		
		int[] numeros = new int[posiciones];  //Declaración del array.
		int[] numeros2 = new int[posiciones2]; //Declaración del segundo array.
		
		//Rellenar el primer array de datos.
		for (int i = 0; i < posiciones ; i++) 
		{
			System.out.println("Introduce un número para la posición " + i + " del primer array");
			numeros[i] = teclado.nextInt();
			
		}
		
		//Rellenar el segundo array de datos.
		for (int j = 0; j < posiciones2 ; j++) 
		{
			System.out.println("Introduce un número para la posición " + j + " del segundo array");
			numeros2[j] = teclado.nextInt();
		}
		
		
		//Comparación de los 2 arrays.
		
			//Comprobar el tamaño de los 2 arrays.
				/*Primero se comprobará si los 2 arrays tienen el mismo número de posiciones,
				si tienen un valor diferente arraysiguales pasará a ser falso y se terminará el programa*/ 
				if(posiciones == posiciones2)
				{
					arraysiguales = true;
				}
				else
				{
					arraysiguales = false;
					System.out.println("Los arrays son diferentes");
				}
		
				do
				//El bucle se repetirá siempre que arraysiguales sea verdadero y comparacion menor que posiciones.
				{
					//Comparar los datos de los arrays.
						//En el momento en el que un dato no coincida arraysiguales será falso.
					if(numeros[comparacion] == numeros2[comparacion])
					{
						arraysiguales = true;
					}
					else
					{
						arraysiguales = false;
						System.out.println("Los arrays son diferentes");
					}
					comparacion++;
				}
				while(arraysiguales == true && comparacion > posiciones);
				
				/*Al salir del bucle do-while se comprobará si arraysiguales sigue siendo verdadera,
				si es cierto,se mostrará un mensaje*/
				if(arraysiguales == true)
				{
					System.out.println("Los arrays son iguales");
				}
	teclado.close();
	}

}
