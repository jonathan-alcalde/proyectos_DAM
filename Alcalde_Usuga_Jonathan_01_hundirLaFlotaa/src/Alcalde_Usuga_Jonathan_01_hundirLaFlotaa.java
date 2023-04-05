import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_hundirLaFlotaa {

	public static void main(String[] args) {
		boolean [][] tablero =  new boolean [20][20];
		Scanner teclado = new Scanner(System.in);
		int fila = 0;
		int columna = 0;
		char posicion = '0';
		/*
		boolean [] portaaviones = new boolean [5];
		boolean [] fragata1 = new boolean [4];
		boolean [] fragata2 = new boolean [4];
		boolean [] submarino1 = new boolean [3];
		boolean [] submarino2 = new boolean [3];
		boolean [] explorador1 = new boolean [2];
		boolean [] explorador2 = new boolean [2];
		boolean [] explorador3 = new boolean [2];
		*/
		System.out.println("Elije la fila del portaviones.");
		fila = teclado.nextInt();
		
		System.out.println("Elije la columna del portaaviones");
		columna = teclado.nextInt();		
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
			tablero [fila + 2][columna] = true;
			tablero [fila + 3][columna] = true;
			tablero [fila + 4][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
			tablero [fila][columna + 2] = true;
			tablero [fila][columna + 3] = true;
			tablero [fila][columna + 4] = true;
		}
		
		System.out.println("Elije la fila de la primera fragata.");
		fila = teclado.nextInt();
		
		System.out.println("Elije la columna de la primera fragata");
		columna = teclado.nextInt();		
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
			tablero [fila + 2][columna] = true;
			tablero [fila + 3][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
			tablero [fila][columna + 2] = true;
			tablero [fila][columna + 3] = true;
		}
		
		System.out.println("Elije la fila de la segunda fragata.");
		fila = teclado.nextInt();
		
		System.out.println("Elije la columna de la segunda fragata");
		columna = teclado.nextInt();		
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
			tablero [fila + 2][columna] = true;
			tablero [fila + 3][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
			tablero [fila][columna + 2] = true;
			tablero [fila][columna + 3] = true;
		}
		
		System.out.println("Elije la fila del primer submarino.");
		fila = teclado.nextInt();
		
		System.out.println("Elije la columna del primer submarino");
		columna = teclado.nextInt();		
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
			tablero [fila + 2][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
			tablero [fila][columna + 2] = true;
		}
		
		System.out.println("Elije la fila del segundo submarino.");
		fila = teclado.nextInt();
		
		System.out.println("Elije la columna del segundo submarino");
		columna = teclado.nextInt();		
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
			tablero [fila + 2][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
			tablero [fila][columna + 2] = true;
		}
		
		System.out.println("Elije la fila del primer explorador.");
		fila = teclado.nextInt();
		
		System.out.println("Elije la columna del primer explorador");
		columna = teclado.nextInt();		
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
		}
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
		}
		
		System.out.println("Elije la fila del segundo explorador.");
		fila = teclado.nextInt();
		
		System.out.println("Elije la columna del segundo explorador");
		columna = teclado.nextInt();		
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.nextInt();
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
		}
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
		}
		
		System.out.println("Elije la fila del tercer explorador.");
		fila = teclado.nextInt();
		
		System.out.println("Elije la columna del tercer explorador");
		columna = teclado.nextInt();		
		
		do 
		{
		System.out.println("Escribe 1 para ponerlo en vertical o 2 para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
		}
		
		do 
		{
		System.out.println("Escribe V para ponerlo en vertical o H para ponerlo en horizontal");
		posicion = teclado.next().charAt(0);
		}
		while(posicion < 1 && posicion > 2);
		
		if (posicion == 1)
		{
			tablero [fila][columna] = true; 
			tablero [fila + 1][columna] = true;
		}
		else if(posicion == 2)
		{
			tablero [fila][columna] = true;
			tablero [fila][columna + 1] = true;
		}
		
		
		teclado.close();
	}

}
