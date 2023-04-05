package arraycadenadecaracteres;

import java.util.Scanner;

public class arraycadenadecaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion = 0;
		String caracteres = "";
		// Creación del array
		char [] letras  = new char[27];
		letras[0] = 'A';
		letras[1] = 'B';
		letras[2] = 'C';
		letras[3] = 'D';
		letras[4] = 'E';
		letras[5] = 'F';
		letras[6] = 'G';
		letras[7] = 'H';
		letras[8] = 'I';
		letras[9] = 'J';
		letras[10] = 'K';
		letras[11] = 'L';
		letras[12] = 'M';
		letras[13] = 'N';
		letras[14] = 'Ñ';
		letras[15] = 'O';
		letras[16] = 'P';
		letras[17] = 'Q';
		letras[18] = 'R';
		letras[19] = 'S';
		letras[20] = 'T';
		letras[21] = 'U';
		letras[22] = 'V';
		letras[23] = 'W';
		letras[24] = 'X';
		letras[25] = 'Y';
		letras[26] = 'Z';
		Scanner teclado = new Scanner(System.in);
		
		while(posicion != -1)
		{	
			//Pedir numero para la cadena
			do
			{
				System.out.println("Introduce un número del 1 al 27, cuando se escriba -1 se terminará el programa ");
				posicion = teclado.nextInt();
				if (posicion  >= 27 || posicion < -1 || posicion == 0)
				{
					System.out.println("El número introducido no es válido");
				}
			}
			while(posicion >= 27 || posicion < -1 || posicion == 0);
			
			//Añadir el caracter a la cadena
			if(posicion >= 27 || posicion > -1)
			{
				caracteres = caracteres + letras[posicion - 1];
			}			
		}
		//Mostrar la cadena
		System.out.println(caracteres);
		teclado.close();
	}

}
