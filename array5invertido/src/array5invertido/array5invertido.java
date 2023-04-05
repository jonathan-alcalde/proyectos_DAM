package array5invertido;

public class array5invertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Declaracion de variables y arrays
		
		int tamanho = 5;
		int numeros[] = new int [tamanho];	
		int numerosinversos[] = new int [tamanho];
		int auxiliar = 0;
		int indice = 0;
		
		//Rellenar el primer array
		System.out.println("Datos del primer array");
			for (int i= 0; i < tamanho; i++)
			{
				numeros[i] = i+1;

				System.out.println("Indice " + indice + " del primer array, contiene el número: " + numeros[i]);
				indice++;
			}
		
		//Rellenar el segundo array
			//Auxiliar es igual a numero maximo en este caso 5
			auxiliar = tamanho;
			indice = 0;
			//Se crea un bucle for donde se crea una variable j 
		System.out.println("Datos del segundo array");
			for (int j= 0; j < tamanho; j++)
			{
				numerosinversos[j] = numeros[auxiliar-1];
				System.out.println("Indice " + indice +" del segundo array, contiene el número:" + numerosinversos[j]);
				auxiliar--;
				indice++;
			}
		
		
	}

}
