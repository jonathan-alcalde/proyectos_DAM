package array100;

public class array100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[100]; // Declaraci�n del array.
		int suma = 0; //Declaraci�n de la variable suma, que guardar� la suma de todos lo n�meros del array.
		double sumamedia; /*Declaraci�n de la variable sumamedia. Esta variable guardar� 
		el valor de suma, para que a la hora de hacer la media el resultado sea un n�mero real*/
		double media = 0; // Declaraci�n del array.
	
	
	// Introducir datos al array. 
		
		/*Para introducir los n�meros del 1 al 100, en el for se le da a la variable i el valor de 1
		 pero para que se vayan introduciendo desde el primer �ndice pedimos que se guarde en el indice i-1 */
		for (int i = 1; i<=100 ; i++)
		{
			numeros [i - 1] = i;
		}
	
	//Suma
		/*Para sumar todos los valores del array se crea un for que pase por todos los indices y que
		 en cada repetici�n se sume el valor del indice en la variable suma*/
		for (int j = 0; j<100 ; j++)
		{
			suma = suma + numeros[j];
		}
		System.out.println("La suma es " + suma);
	
	//Media
	/*La media puede ser un n�mero real por eso se guarda la suma en una variable real, despu�s
	 para hacer la media se divide la suma entre el n�mero de indices */
		sumamedia = suma;
		media = sumamedia / 100;
		System.out.println("La media es " + media);
	}

}
