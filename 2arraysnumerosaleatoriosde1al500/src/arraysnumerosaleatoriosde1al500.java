import java.util.Scanner;

public class arraysnumerosaleatoriosde1al500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración de variables
		int posiciones = 0; //Esta variable indica el numero de posiciones que tendrá el array
		int digitos = 0; //Esta variable indica el numero de digitos de los numeros que se guardarán en el segundo array.
		int contador = 0; //Esta variable se va acumulando a medida que se guardan los números en el segundo array.
		Scanner teclado = new Scanner(System.in);
		
		//Creación de un array de números de un tamaño introducido por teclado.
		System.out.println("Introduce el número de datos que tendrá el array");
		posiciones = teclado.nextInt(); //Se pide al usuario que introduzca el número de índices que tendrá el array.
		int[] numeros = new int[posiciones]; // Declaración del array.
		int[] numerospedidos = new int[posiciones]; //Declaración del segundo array.
		
		//Rellenar el array de números aleatorios entre 1 y 500.
			//Este for recorre todo el primer array introduciendo un numero aleatorio en cada índice.
		for (int i = 1; i<=posiciones ; i++) 
		{
			numeros [i - 1] = (int)(Math.random()*500)+1;
			
		}
		//Mostrar aquellos números que acaben en un o dos dígitos y guardarlos en un nuevo array.
			//Solo se puede introducir  el número 1 o 2, si no , el bucle se repetirá.
		do
		{
		System.out.println("Introduce cuantos digitos tienen los números que quieres mostrar");
		digitos = teclado.nextInt();
		}
		while (digitos > 2 || digitos < 1);
		
		//Si digitos es igual a 1 se entrará en un bucle for.
		if(digitos == 1)	
		{
			//Este bucle for recorre todo el primer array.
			for (int j = 0; j<posiciones ; j++)
			{
				/*Cuando un índice contenga un número de un dígito, se mostrará y se guardará en el segundo array,
				también se sumará 1 a la variable contador para que siguiente número de 1 dígito
				se guarde en el siguiente índice del segundo array*/
				if(numeros [j] < 10)
				{		
					System.out.print(numeros[j] + " ");	
					numerospedidos[contador] = numeros[j];
					contador++;
				}
			}
		}
		//Si digitos es igual a 2 se entrará en un bucle for.
		if(digitos == 2)
		{
			//Este bucle for recorre todo el primer array.
			for (int j = 0; j<posiciones ; j++) 
			{
				/*Cuando un índice contenga un número de dos dígitos, se mostrará y se guardará en el segundo array,
				también se sumará 1 a la variable contador para que siguiente número de 2 dígitos
				se guarde en el siguiente índice del segundo array*/
				if(numeros [j] > 9 && numeros[j] < 100  )
				{							
					System.out.print(numeros[j] + " ");
					numerospedidos[contador] = numeros[j];
					contador++;				
				}
			}
		}
		System.out.println("");
		//Recorrer e imprimir por completo el nuevo array.
		System.out.println("Los numeros que se han guardado en el segundo array son : ");
		/*Este for recorre el segundo array y mostrará los números que se encuentran en este array.*/
		for (int k = 0; k < contador ; k++) 
		{
			System.out.print(numerospedidos [k] + " " );	
		}
	teclado.close();
	}
}
	


