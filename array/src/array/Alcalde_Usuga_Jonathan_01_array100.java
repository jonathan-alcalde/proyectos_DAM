package array;

import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_array100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int posiciones = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número de datos que tendrá el array");
		posiciones = teclado.nextInt();
		
		int[] numeros = new int[posiciones]; // Declaración del array.
		
		int suma = 0; //Declaración de la variable suma, que guardará la suma de todos lo números del array.
		
		double sumamedia; /*Declaración de la variable sumamedia. Esta variable guardará 
		el valor de suma, para que a la hora de hacer la media el resultado sea un número real*/
		double media = 0; // Declaración del array.
	
	
	// Introducir datos al array. 
		
		/*Para introducir los números del 1 al 100, en el for se le da a la variable i el valor de 1
		 pero para que se vayan introduciendo desde el primer índice pedimos que se guarde en el indice i-1 */
		for (int i = 1; i<=posiciones ; i++)
		{
			numeros [i - 1] = i;
		}
	
	//Suma
		/*Para sumar todos los valores del array se crea un for que pase por todos los indices y que
		 en cada repetición se sume el valor del indice en la variable suma*/
		for (int j = 0; j<posiciones ; j++)
		{
			suma = suma + numeros[j];
		}
		System.out.println("La suma es " + suma);
	
	//Media
	/*La media puede ser un número real por eso se guarda la suma en un variable real, después
	 para hacer la media se divide la suma entre el número de indices */
		sumamedia = suma;
		media = sumamedia / posiciones;
		System.out.println("La media es " + media);
	teclado.close();
	}	

}
