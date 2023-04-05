package hundirlaflota1;

import java.util.Scanner;

public class hunidrlaflota1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][] tablero = new boolean [20][20];
		Scanner teclado = new Scanner(System.in);
		int intentos = 5;
		int columna = 0;
		int fila = 0;
		int posicionx = 0;
		int posiciony = 0;
		int posicionz = 0;
		boolean ganado = false;
		
		//portaaviones
		do
		{
			posicionx = (int)(Math.random()*19-0);
		}
		while(posicionx + 5 == 20);
		do
		{
			posiciony = (int)(Math.random()*19-0);
		}
		while(posiciony + 5 == 20);
		posiciony = (int)(Math.random()*19-0);
			tablero [0][0] = true;
			tablero [1][0] = true;
			tablero [2][0] = true;
			tablero [3][0] = true;
			tablero [4][0] = true;
		
		//fragata
		posicionx = (int)(Math.random()*19-0);
		posiciony = (int)(Math.random()*19-0);
			tablero [5][0] = true;
			tablero [6][0] = true;
			tablero [7][0] = true;
			tablero [8][0] = true;
		
		//fragata2
		posicionx = (int)(Math.random()*19-0);
		posiciony = (int)(Math.random()*19-0);
			tablero [9][0] = true;
			tablero [10][0] = true;
			tablero [11][0] = true;
			tablero [12][0] = true;
		
		//submarino
		posicionx = (int)(Math.random()*19-0);
		posiciony = (int)(Math.random()*19-0);	
			tablero [13][0] = true;
			tablero [14][0] = true;
			tablero [15][0] = true;
		
		//submarino
		posicionx = (int)(Math.random()*19-0);
		posiciony = (int)(Math.random()*19-0);
			tablero [16][0] = true;
			tablero [17][0] = true;
			tablero [18][0] = true;
		
		//explorador
		posicionx = (int)(Math.random()*19-0);
		posiciony = (int)(Math.random()*19-0);
			tablero [17][3] = true;
			tablero [17][4] = true;
		
		//explorador2
		posicionx = (int)(Math.random()*19-0);
		posiciony = (int)(Math.random()*19-0);
			tablero [0][1] = true;
			tablero [0][2] = true;
		
		//explorador3
		posicionx = (int)(Math.random()*19-0);
		posiciony = (int)(Math.random()*19-0);
			tablero [0][3] = true;
			tablero [0][4] = true;
	
		
		//Empieza el juego
		do
		{
			System.out.println("Selecciona la columna que a la que vas a atacar");
			columna = teclado.nextInt();
		
			System.out.println("Selecciona la fila que a la que vas a atacar");
			fila = teclado.nextInt();
		
			if (tablero[columna][fila] == true)
			{
				System.out.println("¡¡¡TOCADO!!!");
				tablero[columna][fila] = false;
			}
			else if (tablero[columna][fila] == false)
			{
				System.out.println("¡¡¡AGUA!!!");
				intentos--;
				System.out.println("Te quedan " + intentos + " intentos.");
			}
			
			ganado  = true;
			for (int i = 0; i < tablero.length ; i++)
			{
				for (int j = 0; j < tablero[0].length ; j++)
				{
					if (tablero[i][j] == true)
					{
						ganado = false;
					}
				}
			}
		}
		while(intentos > 0 && !ganado);
		
		if (intentos == 0)
		{
			System.out.println("Has perdido.");
		}
		else if (ganado)
			System.out.println("Felicidades, has ganado.");
		
		teclado.close();
	}

}
