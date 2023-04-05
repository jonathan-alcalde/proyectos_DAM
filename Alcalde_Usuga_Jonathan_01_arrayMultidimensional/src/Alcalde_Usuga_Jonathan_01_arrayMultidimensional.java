import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_arrayMultidimensional {

	public static void main(String[] args) {
		int [][]array; //Declaración del array bidimensional
		Scanner teclado = new Scanner(System.in);
		int columnas = 0; //Indica el numero de columnas (eje X) que tendrá el array. 
		int filas = 0; //Indica el numero de filas (eje Y) que tendrá el array.
		
		System.out.println("¿Cuantas columnas tendrá el array?");
		do
		{
			columnas = teclado.nextInt();
			if (columnas <= 0)
			{
				System.out.println("El número que se ha introducido no es válido, por favor, prueba con un número distinto.");
			}
		}
		while(columnas <= 0 );
		System.out.println("¿Y cuantas filas tendrá?");
		do
		{
			filas = teclado.nextInt();
			if (filas <= 0)
			{
				System.out.println("El número que se ha introducido no es válido, por favor, prueba con un número distinto.");
			}
		}
		while(filas < 0 );
		array =	new int [columnas][filas]; //Creación del array bidimensional. 	
			 
		//Rellenar el array.
		System.out.println("Ahora, rellena el array.");
		for (int i = 0; i < array[0].length;i++) //Filas
			 {
		         for(int j = 0;j < array.length;j++) //Columnas
		         {
		        	 System.out.println("Rellena la columna " + (j+1) + " ,fila " + (i+1) + ".");
		        	 array[j][i] = teclado.nextInt();
		         }
			 }
		
		//Mostrar el array.
			 System.out.println("Resultado :");
			 for (int k = 0; k < array[0].length;k++) //Filas
			 {
		         for(int l = 0;l < array.length;l++) //Columnas
		         {
		        	
		          System.out.print(array[l][k] + " ");
		         }
		         System.out.println("");
			 }
			 
		teclado.close();

	}

}
