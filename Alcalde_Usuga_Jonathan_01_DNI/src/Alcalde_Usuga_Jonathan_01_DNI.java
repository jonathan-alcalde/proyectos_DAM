import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creación de variables y de objeto Scanner.
		int numerodni = 0;
		int numeroletras = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Creación e introducción de datos en el array.
		char [] letras = new char [23];
		letras [0] = 'T';
		letras [1] = 'R';
		letras [2] = 'W';
		letras [3] = 'A';
		letras [4] = 'G';
		letras [5] = 'M';
		letras [6] = 'Y';
		letras [7] = 'F';
		letras [8] = 'P';
		letras [9] = 'D';
		letras [10] = 'X';
		letras [11] = 'B';
		letras [12] = 'N';
		letras [13] = 'J';
		letras [14] = 'Z';
		letras [15] = 'S';
		letras [16] = 'Q';
		letras [17] = 'V';
		letras [18] = 'H';
		letras [19] = 'L';
		letras [20] = 'C';
		letras [21] = 'K';
		letras [22] = 'E';

		
		
		System.out.println("Este programa sirve para calcular la letra que tendrá su DNI.");
		System.out.println("Por favor, introduzca su número de DNI.(Sin letra.)");
		
		do
		{
			numerodni = teclado.nextInt();
				if (numerodni < 10000000 || numerodni > 99999999)
				{
					System.out.println("DNI no válido, por introduzca otro.");
				}
		}
		while(numerodni < 10000000 || numerodni > 99999999);
		numeroletras = numerodni % 23;
		System.out.println ("Su letras es : " + letras[numeroletras]);
		System.out.println ("Por lo que su DNI es : " + numerodni + letras[numeroletras]);
		
		teclado.close();
	}

}
