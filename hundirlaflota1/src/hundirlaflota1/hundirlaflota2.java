package hundirlaflota1;

import java.util.Scanner;

public class hundirlaflota2 {

	public static void main(String[] args) {
		char [][] tablero = new char [20][20];
		Scanner teclado = new Scanner(System.in);
		int intentos = 5;
		int columna = 0;
		int fila = 0;
		int posicionx = 0;
		int posiciony = 0;
		int orientacion = 0;
		boolean barcovalido = false;
		boolean ganado = false;
		
		System.out.println("Bienvenido a Batalla Naval, ¿Conseguiras averiguar donde se encuentra cada barco enemigo?");
		//Rellnar tablero
		for (int i = 0; i < tablero.length ; i++)
		{
			for (int j = 0; j < tablero[0].length ; j++)
			{
				tablero[i][j] = 0;
			}
		}
		
		
		//Generar primera posicion del portaaviones;
		posiciony = (int)(Math.random()*19-0);
		boolean portaaviones = true;
		posicionx=(int)(Math.random()*19);
		posiciony=(int)(Math.random()*19);
		
		
		tablero[posicionx][posiciony] =  'P';
		
		while (!barcovalido)
		{
		orientacion = (int)(Math.random()*3);
		//orientacion 0 = horizontal hacia la derecha
		//orientacion 1 = vertical hacia arriba
		//orientacion 2 = horizontal hacia la izquieda
		//orientacion 3 = vertical hacia abajo
		if(orientacion == 0 && posicionx+4 < 20)
		{
			barcovalido = true;
			tablero [posicionx+1][posiciony] = 'P';
			tablero [posicionx+2][posiciony] = 'P';
			tablero [posicionx+3][posiciony] = 'P';
			tablero [posicionx+4][posiciony] = 'P';
		}
		else if(orientacion == 1 && posiciony+4 < 20)
		{
			barcovalido = true;
			tablero [posicionx][posiciony+1] = 'P';
			tablero [posicionx][posiciony+2] = 'P';
			tablero [posicionx][posiciony+3] = 'P';
			tablero [posicionx][posiciony+4] = 'P';
		}
		else if(orientacion == 2 && posicionx-4 > -1)
		{
			barcovalido = true;
			tablero [posicionx-1][posiciony] = 'P';
			tablero [posicionx-2][posiciony] = 'P';
			tablero [posicionx-3][posiciony] = 'P';
			tablero [posicionx-4][posiciony] = 'P';
		}
		else if(orientacion == 3 && posiciony-4 > -1)
		{
			barcovalido = true;
			tablero [posicionx][posiciony-1] = 'P';
			tablero [posicionx][posiciony-2] = 'P';
			tablero [posicionx][posiciony-3] = 'P';
			tablero [posicionx][posiciony-4] = 'P';
		}
		else
			{
			barcovalido = false;
			}
		}
		
			
		//reiniciar variable barcovalido
		barcovalido = false;
		
		//fragata
		boolean fragata = false;
		do
		{
			posicionx = (int)(Math.random()*19-0);
			posiciony = (int)(Math.random()*19-0);
			if (tablero[posicionx][posiciony] == 0)
			{
			barcovalido = true;
			tablero [posicionx][posiciony] = 'F';
			}
		}
		while (!barcovalido);
		do
			{
			orientacion = (int)(Math.random()*3);
			//orientacion 0 = horizontal hacia la derecha
			//orientacion 1 = vertical hacia arriba
			//orientacion 2 = horizontal hacia la izquieda
			//orientacion 3 = vertical hacia abajo
			if(orientacion == 0 && posicionx+3 < 20 && tablero [posicionx+1][posiciony] == 0 && tablero [posicionx+2][posiciony] == 0 && tablero [posicionx+3][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx+1][posiciony] = 'F';
				tablero [posicionx+2][posiciony] = 'F';
				tablero [posicionx+3][posiciony] = 'F';
			}
			else if(orientacion == 1 && posiciony+3 < 20 && tablero [posicionx][posiciony+1] == 0 && tablero [posicionx][posiciony+2] == 0 && tablero [posicionx][posiciony+3] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony+1] = 'F';
				tablero [posicionx][posiciony+2] = 'F';
				tablero [posicionx][posiciony+3] = 'F';
			}
			else if(orientacion == 2 && posicionx-3 > -1 && tablero [posicionx-1][posiciony] == 0 && tablero [posicionx-2][posiciony] == 0 && tablero [posicionx-3][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx-1][posiciony] = 'F';
				tablero [posicionx-2][posiciony] = 'F';
				tablero [posicionx-3][posiciony] = 'F';
			}
			else if(orientacion == 3 && posiciony-3 > -1 && tablero [posicionx][posiciony-1] == 0 && tablero [posicionx][posiciony-2] == 0 && tablero [posicionx][posiciony-3] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony-1] = 'F';
				tablero [posicionx][posiciony-2] = 'F';
				tablero [posicionx][posiciony-3] = 'F';
			}
			else
				{
				barcovalido = false;
				}
			}
		while(!barcovalido);
		
		//reiniciar variable barcovalido
		barcovalido = false;
		
		//fragata2
		boolean fragata2 = false;
		do
		{
			posicionx = (int)(Math.random()*19-0);
			posiciony = (int)(Math.random()*19-0);
			if (tablero[posicionx][posiciony] == 0)
			{
			barcovalido = true;
			tablero [posicionx][posiciony] = 'f';
			}
		}
		while (!barcovalido);
		do
			{
			orientacion = (int)(Math.random()*3);
			//orientacion 0 = horizontal hacia la derecha
			//orientacion 1 = vertical hacia arriba
			//orientacion 2 = horizontal hacia la izquieda
			//orientacion 3 = vertical hacia abajo
			if(orientacion == 0 && posicionx+3 < 20 && tablero [posicionx+1][posiciony] == 0 && tablero [posicionx+2][posiciony] == 0 && tablero [posicionx+3][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx+1][posiciony] = 'f';
				tablero [posicionx+2][posiciony] = 'f';
				tablero [posicionx+3][posiciony] = 'f';
			}
			else if(orientacion == 1 && posiciony+3 < 20 && tablero [posicionx][posiciony+1] == 0 && tablero [posicionx][posiciony+2] == 0 && tablero [posicionx][posiciony+3] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony+1] = 'f';
				tablero [posicionx][posiciony+2] = 'f';
				tablero [posicionx][posiciony+3] = 'f';
			}
			else if(orientacion == 2 && posicionx-3 > -1 && tablero [posicionx-1][posiciony] == 0 && tablero [posicionx-2][posiciony] == 0 && tablero [posicionx-3][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx-1][posiciony] = 'f';
				tablero [posicionx-2][posiciony] = 'f';
				tablero [posicionx-3][posiciony] = 'f';
			}
			else if(orientacion == 3 && posiciony-3 > -1 && tablero [posicionx][posiciony-1] == 0 && tablero [posicionx][posiciony-2] == 0 && tablero [posicionx][posiciony-3] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony-1] = 'f';
				tablero [posicionx][posiciony-2] = 'f';
				tablero [posicionx][posiciony-3] = 'f';
			}
			else
				{
				barcovalido = false;
				}
			}
		while(!barcovalido);
		
		//reiniciar variable barcovalido
		barcovalido = false;
		
		//submarino	
		boolean submarino = false;
			do
			{
				posicionx = (int)(Math.random()*19-0);
				posiciony = (int)(Math.random()*19-0);
				if (tablero[posicionx][posiciony] == 0)
				{
				barcovalido = true;
				tablero [posicionx][posiciony] = 'S';
				}
			}
			while (!barcovalido);
			do
				{
				orientacion = (int)(Math.random()*3);
				//orientacion 0 = horizontal hacia la derecha
				//orientacion 1 = vertical hacia arriba
				//orientacion 2 = horizontal hacia la izquieda
				//orientacion 3 = vertical hacia abajo
				if(orientacion == 0 && posicionx+2 < 20 && tablero [posicionx+1][posiciony] == 0 && tablero [posicionx+2][posiciony] == 0)
				{
					barcovalido = true;
					tablero [posicionx+1][posiciony] = 'S';
					tablero [posicionx+2][posiciony] = 'S';
				}
				else if(orientacion == 1 && posiciony+2 < 20 && tablero [posicionx][posiciony+1] == 0 && tablero [posicionx][posiciony+2] == 0)
				{
					barcovalido = true;
					tablero [posicionx][posiciony+1] = 'S';
					tablero [posicionx][posiciony+2] = 'S';
				}
				else if(orientacion == 2 && posicionx-2 > -1 && tablero [posicionx-1][posiciony] == 0 && tablero [posicionx-2][posiciony] == 0)
				{
					barcovalido = true;
					tablero [posicionx-1][posiciony] = 'S';
					tablero [posicionx-2][posiciony] = 'S';
				}
				else if(orientacion == 3 && posiciony-2 > -1 && tablero [posicionx][posiciony-2] == 0 && tablero [posicionx][posiciony-2] == 0)
				{
					barcovalido = true;
					tablero [posicionx][posiciony-1] = 'S';
					tablero [posicionx][posiciony-2] = 'S';
				}
				else
					{
					barcovalido = false;
					}
				}
			while(!barcovalido);
			
			//reiniciar variable barcovalido
			barcovalido = false;
			
		
		//submarino2
		boolean submarino2 = false;
		do
		{
			posicionx = (int)(Math.random()*19-0);
			posiciony = (int)(Math.random()*19-0);
			if (tablero[posicionx][posiciony] == 0)
			{
			barcovalido = true;
			tablero [posicionx][posiciony] = 's';
			}
		}
		while (!barcovalido);
		do
			{
			orientacion = (int)(Math.random()*3);
			//orientacion 0 = horizontal hacia la derecha
			//orientacion 1 = vertical hacia arriba
			//orientacion 2 = horizontal hacia la izquieda
			//orientacion 3 = vertical hacia abajo
			if(orientacion == 0 && posicionx+2 < 20 && tablero [posicionx+1][posiciony] == 0 && tablero [posicionx+2][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx+1][posiciony] = 's';
				tablero [posicionx+2][posiciony] = 's';
			}
			else if(orientacion == 1 && posiciony+2 < 20 && tablero [posicionx][posiciony+1] == 0 && tablero [posicionx][posiciony+2] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony+1] = 's';
				tablero [posicionx][posiciony+2] = 's';
			}
			else if(orientacion == 2 && posicionx-2 > -1  && tablero [posicionx-1][posiciony] == 0 && tablero [posicionx-2][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx-1][posiciony] = 's';
				tablero [posicionx-2][posiciony] = 's';
			}
			else if(orientacion == 3 && posiciony-2 > -1 && tablero [posicionx][posiciony-2] == 0 && tablero [posicionx][posiciony-2] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony-1] = 's';
				tablero [posicionx][posiciony-2] = 's';
			}
			else
				{
				barcovalido = false;
				}
			}
		while(!barcovalido);
		
		//reiniciar variable barcovalido
		barcovalido = false;
		
	
		
		//explorador
		boolean explorador = false;
		do
		{
			posicionx = (int)(Math.random()*19-0);
			posiciony = (int)(Math.random()*19-0);
			if (tablero[posicionx][posiciony] == 0)
			{
			barcovalido = true;
			tablero [posicionx][posiciony] = 'E';
			}
		}
		while (!barcovalido);
		do
			{
			orientacion = (int)(Math.random()*3);
			//orientacion 0 = horizontal hacia la derecha
			//orientacion 1 = vertical hacia arriba
			//orientacion 2 = horizontal hacia la izquieda
			//orientacion 3 = vertical hacia abajo
			if(orientacion == 0 && posicionx+1 < 20 && tablero [posicionx+1][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx+1][posiciony] = 'E';
			}
			else if(orientacion == 1 && posiciony+1 < 20 && tablero [posicionx][posiciony+1] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony+1] = 'E';
			}
			else if(orientacion == 2 && posicionx-1 > -1 && tablero [posicionx-1][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx-1][posiciony] = 'E';
			}
			else if(orientacion == 3 && posiciony-1 > -1 && tablero [posicionx][posiciony-1] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony-1] = 'E';
			}
			else
				{
				barcovalido = false;
				}
			}
		while(!barcovalido);
		
		//reiniciar variable barcovalido
		barcovalido = false;
		
		
		//explorador2
		boolean explorador2 = false;
		do
		{
			posicionx = (int)(Math.random()*19-0);
			posiciony = (int)(Math.random()*19-0);
			if (tablero[posicionx][posiciony] == 0)
			{
			barcovalido = true;
			tablero [posicionx][posiciony] = 'e';
			}
		}
		while (!barcovalido);
		do
			{
			orientacion = (int)(Math.random()*3);
			//orientacion 0 = horizontal hacia la derecha
			//orientacion 1 = vertical hacia arriba
			//orientacion 2 = horizontal hacia la izquieda
			//orientacion 3 = vertical hacia abajo
			if(orientacion == 0 && posicionx+1 < 20 && tablero [posicionx+1][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx+1][posiciony] = 'e';
			}
			else if(orientacion == 1 && posiciony+1 < 20 && tablero [posicionx][posiciony+1] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony+1] = 'e';
			}
			else if(orientacion == 2 && posicionx-1 > -1 && tablero [posicionx-1][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx-1][posiciony] = 'e';
			}
			else if(orientacion == 3 && posiciony-1 > -1 && tablero [posicionx][posiciony-1] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony-1] = 'e';
			}
			else
				{
				barcovalido = false;
				}
			}
		while(!barcovalido);
		
		//reiniciar variable barcovalido
		barcovalido = false;
		
		
		//explorador3
		boolean explorador3 = false;
		do
		{
			posicionx = (int)(Math.random()*19-0);
			posiciony = (int)(Math.random()*19-0);
			if (tablero[posicionx][posiciony] == 0)
			{
			barcovalido = true;
			tablero [posicionx][posiciony] = '3';
			}
		}
		while (!barcovalido);
		do
			{
			orientacion = (int)(Math.random()*3);
			//orientacion 0 = horizontal hacia la derecha
			//orientacion 1 = vertical hacia arriba
			//orientacion 2 = horizontal hacia la izquieda
			//orientacion 3 = vertical hacia abajo
			if(orientacion == 0 && posicionx+1 < 20 && tablero [posicionx+1][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx+1][posiciony] = '3';
			}
			else if(orientacion == 1 && posiciony+1 < 20 && tablero [posicionx][posiciony+1] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony+1] = '3';
			}
			else if(orientacion == 2 && posicionx-1 > -1 && tablero [posicionx-1][posiciony] == 0)
			{
				barcovalido = true;
				tablero [posicionx-1][posiciony] = '3';
			}
			else if(orientacion == 3 && posiciony-1 > -1 && tablero [posicionx][posiciony-1] == 0)
			{
				barcovalido = true;
				tablero [posicionx][posiciony-1] = '3';
			}
			else
				{
				barcovalido = false;
				}
			}
		while(!barcovalido);
		
		//reiniciar variable barcovalido
		barcovalido = false;
		
	
		
			
		//Mostrar tablero
		System.out.println("    0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19");
		System.out.println("    ------------------------------------------------------------");
			 for (int k = 0; k < tablero.length;k++) //Filas
			 {
				 if(k < 10)
				 {
				 System.out.print(k + " |");
				 }
				 else if(k >= 10)
				 {
					 System.out.print(k + "|");
				 }
		         for(int l = 0;l < tablero[0].length;l++) //Columnas
		         {
		        	
		          System.out.print(" " + tablero[l][k] + " ");
		         }
		         System.out.println("");
			 }
			 
		//Empieza el juego
		do
		{
			//Para saber que barcos se han hundido se reinicia la variable de cada barco y se mostrarán los que se han hundido tras cada disparo.
			portaaviones = false;
			fragata = false;
			fragata2 = false;
			submarino = false;
			submarino2 = false;
			explorador = false;
			explorador2 = false;
			explorador3 = false;
			System.out.println("Selecciona la columna que a la que vas a atacar");
			columna = teclado.nextInt();
		
			System.out.println("Selecciona la fila que a la que vas a atacar");
			fila = teclado.nextInt();
		
			//Si el disparo coindicide con la posición de un barco.
			if (tablero[columna][fila] != 0 )
			{
				System.out.println("¡¡¡TOCADO!!!");
				tablero[columna][fila] = 0;
					
			}
			else if (tablero[columna][fila] == 0)
			{
				System.out.println("¡¡¡AGUA!!!");
				intentos--;
				System.out.println("Te quedan " + intentos + " intentos.");
			}
			
			//Comprobar barcos
			for (int i = 0; i < tablero.length ; i++)
			{
				for (int j = 0; j < tablero[0].length ; j++)
				{
					if (tablero[i][j] == 'P')
					{
						portaaviones = true;
					}
					if (tablero[i][j] == 'S')
					{
						submarino = true;
					}
					if (tablero[i][j] == 's')
					{
						submarino2 = true;
					}
					if (tablero[i][j] == 'F')
					{
						fragata = true;
					}
					if (tablero[i][j] == 'f')
					{
						fragata2 = true;
					}
					if (tablero[i][j] == 'E')
					{
						explorador = true;
					}
					if (tablero[i][j] == 'e')
					{
						explorador2 = true;
					}
					if (tablero[i][j] == '3')
					{
						explorador3 = true;
					}
					
				}
			}
			
			if (portaaviones == false)
			{
				System.out.println("Portaaviones a pique");
			}
			if (submarino == false)
			{
				System.out.println("Submarino 1 a pique");
			}
			if (submarino2 == false)
			{
				System.out.println("Submarino 2 a pique");
			}
			if (fragata == false)
			{
				System.out.println("Fragata 1 a pique");
			}
			if (fragata2 == false)
			{
				System.out.println("Fragata 2 a pique");
			}
			if (explorador == false)
			{
				System.out.println("Explorador 1 a pique");
			}
			if (explorador2 == false)
			{
				System.out.println("Explorador 2 a pique");
			}
			if (explorador3 == false)
			{
				System.out.println("Explorador3 a pique");
			}

			
			ganado  = true;
			for (int i = 0; i < tablero.length ; i++)
			{
				for (int j = 0; j < tablero[0].length ; j++)
				{
					if (tablero[i][j] != 0)
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


