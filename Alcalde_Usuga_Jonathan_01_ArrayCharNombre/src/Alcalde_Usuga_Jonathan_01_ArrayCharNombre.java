import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_ArrayCharNombre {

	public static void main(String[] args) {
	 int numeroletras = 0; //variable entera que servirá para determinar el tamaño del array.
	 char [] nombre; // Array de caracteres.
	 Scanner teclado = new Scanner(System.in);
	 
	 //Ahora se piden al usuario que introduzca un número, este número definira el tamaño del array.
	 System.out.println("Escribe el número de letras que contiene tu nombre.");
	 numeroletras = teclado.nextInt();
	 nombre = new char [numeroletras];
	 
	 //Se crea un bucle for para ir rellenando las posiciones del array con las letras del nombre.
	 System.out.println("Ahora , escribe tu nobre letras a letra.");
	 for(int i = 0; i < numeroletras ; i++)
	 {
		nombre[i] = teclado.next().charAt(0);
	 }
	
	 //Al final se repasa todo el array mostrando el nombre completo.
	 for(int j = 0; j < numeroletras ; j++)
	 {
		System.out.print(nombre[j]);
	 }
	 teclado.close();
	}

}
