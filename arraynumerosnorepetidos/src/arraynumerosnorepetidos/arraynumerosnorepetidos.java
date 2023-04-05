package arraynumerosnorepetidos;

public class arraynumerosnorepetidos {

	public static void main(String[] args) {
		int [] array = new int [50]; //Se crea el array
	
		//Introducción de datos al array.
		for (int i = 0; i < 50 ; i++) 
		{
			array [i] = (int) (Math.random()*100);
			//Dentro del primer for se incluye otro que repase el array por cada ciclo de la variable i.
			for (int j = 0; j < 50 ; j++)
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
		//Se muestra el contenido del array.
		for (int k = 0; k < 50; k++)
		{
			System.out.print(array[k] +  " ");
		}
	}

}
