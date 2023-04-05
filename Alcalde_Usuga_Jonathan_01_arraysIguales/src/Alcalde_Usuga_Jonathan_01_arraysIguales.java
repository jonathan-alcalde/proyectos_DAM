import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_arraysIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaraci�n de variables
		int posiciones = 0; //Esta variable indica el numero de posiciones que tendr� el primer array.
		int posiciones2 = 0; //Esta variable indica el numero de posiciones que tendr� el segundo array.
		
		int comparacion = 0; //Esta variable se utilizar� para comparar que en cada posici�n de los 2 arrays, los valores son iguales. 
		boolean arraysiguales = true; //Esta variable comprobar� si los 2 arrays son iguales. 
		Scanner teclado = new Scanner(System.in);
		
		//Creaci�n de los arrays
		System.out.println("Introduce el n�mero de datos que tendr� el primer array");
		posiciones = teclado.nextInt(); //Se pide al usuario que introduzca el n�mero de �ndices que tendr� el primer array.
		
		System.out.println("Introduce el n�mero de datos que tendr� el segundo array");
		posiciones2 = teclado.nextInt(); //Se pide al usuario que introduzca el n�mero de �ndices que tendr� el segundo array.
		
		int[] numeros = new int[posiciones];  //Declaraci�n del array.
		int[] numeros2 = new int[posiciones2]; //Declaraci�n del segundo array.
		
		//Rellenar el primer array de datos.
		for (int i = 0; i < posiciones ; i++) 
		{
			System.out.println("Introduce un n�mero para la posici�n " + i + " del primer array");
			numeros[i] = teclado.nextInt();
			
		}
		
		//Rellenar el segundo array de datos.
		for (int j = 0; j < posiciones2 ; j++) 
		{
			System.out.println("Introduce un n�mero para la posici�n " + j + " del segundo array");
			numeros2[j] = teclado.nextInt();
		}
		
		
		//Comparaci�n de los 2 arrays.
		
			//Comprobar el tama�o de los 2 arrays.
				/*Primero se comprobar� si los 2 arrays tienen el mismo n�mero de posiciones,
				si tienen un valor diferente arraysiguales pasar� a ser falso y se terminar� el programa*/ 
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
				//El bucle se repetir� siempre que arraysiguales sea verdadero y comparacion menor que posiciones.
				{
					//Comparar los datos de los arrays.
						//En el momento en el que un dato no coincida arraysiguales ser� falso.
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
				
				/*Al salir del bucle do-while se comprobar� si arraysiguales sigue siendo verdadera,
				si es cierto,se mostrar� un mensaje*/
				if(arraysiguales == true)
				{
					System.out.println("Los arrays son iguales");
				}
	teclado.close();
	}

}
