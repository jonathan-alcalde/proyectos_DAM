package array3dimensiones;

import java.util.Scanner;

public class array3dimensiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int columnas = 0;
		int filas = 0;
		int capas = 0;
		int [][][] array;
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("¿Cuantas columnas tendrá?");
		columnas = teclado.nextInt();
		
		System.out.println("¿Cuantas filas tendrá?");
		filas = teclado.nextInt();
		
		System.out.println("¿Cuantas capas tendrá?");
		capas = teclado.nextInt();
		
		array = new int [columnas][filas][capas];
		
		for(int i = 0; i < array[0][0].length ; i++) 
		{
			for(int j = 0; j < array[0].length ; j++)	
			{		
				for(int k = 0; k < array.length ; k++) 
				{
				array[i][j][k] = (int)(Math.random()*100+1);
				}
			}
		}
		for(int l = 0; l < array[0][0].length ; l++) {
			System.out.print("Capa" + (l+1));
			for(int m = 0; m < array[0].length ; m++)	{
				
				for(int n = 0; n < array.length ; n++) {
					System.out.print(array[l][m][n]);
				}
				System.out.println("");
			}
			System.out.println("");
			}
		
		teclado.close();
	}

}
