package arraynumerosnorepetidoyordenados;

import java.util.Scanner;

public class arraynumerosnorepetidoyordenados {

	public static void main(String[] args) {
		int [] array = new int [10]; //Se crea el array
		int aux = 0;
		int pedirnumero = 0;
		boolean esta = false;
		Scanner teclado = new Scanner (System.in);
		for (int i = 0; i < 10 ; i++) 
		{
			array [i] = (int) (Math.random()*100);
			//Dentro del primer for se incluye otro que repase el array por cada ciclo de la variable i.
			for (int j = 0; j < 10 ; j++)
			{
				/**Si i y j tienen un valor diferente pero contienen en sus respectivas celdas el mismo número 
			 	se asignará otro valor a la celda i y se restará 1 a i para volver a comprobar el nuevo número.
				*/
				if(array[i] == array[j] && i != j) 
				{
					array[i] = (int) (Math.random()*100+1);
					i--;
				}
		
			}	
		}
		
		//Ordenar contenido del array de mayor a menor
		/*
		for (int l = 0; l < array.length - 1; l++) {
            for (int m = 0; m < array.length - l - 1; m++) {
                if (array[m + 1] > array[m]) {
                    aux = array[m + 1];
                    array[m + 1] = array[m];
                    array[m] = aux;
                }
            }
        }
        */
		for (int i = 100; i > 0; i--)
		{
			for (int j = 0; j < 10 ; j++)
			{	
				if (i == array[j])
				{
					System.out.print(array[j] + " ");
				}
			}
		}
		
		//Se muestra el contenido del array.
		/*
		for (int k = 0; k < 10; k++)
		{
			System.out.print(array[k] +  " ");
		}
		*/
		System.out.println("Introduce un número que aparezca en el array");
		do
		{
		pedirnumero = teclado.nextInt();
		
		
		for (int j = 0; j < 10 ; j++)
		{	
			if (pedirnumero == array[j])
			{
				System.out.println("El índice que contiene ese número es el " + j);
				esta = true;
				if(j != 0)
				{
					System.out.println("El índice anterior es " + (j-1) + " y contiene el número " + array[j-1]);
				}
				if(j != 9)
				{
					System.out.println("El índice posterior es " + (j+1) + " y contiene el número " + array[j+1]);
				}
			}
		}
		if (esta == false)
		{
			System.out.println("El número que ha introducido no se encuentra en el array, introduzca otro número y asegurese de que ese número se encuentra en el array.");
		}
		}
		while(esta == false);
		teclado.close();
	}

}
