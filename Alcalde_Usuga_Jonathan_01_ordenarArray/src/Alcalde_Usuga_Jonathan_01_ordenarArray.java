import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_ordenarArray {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int [] fase1 = new int [8]; //Array en el que se introducirán los datos.
		int aux = 0; //Variable auxiliar
		int contador = 0; 
		int contador1 = 0;
		int contador2 = 0;
		
		
		//Rellenar el array con números
		System.out.println("Fase 1 : Introduce los datos en el array");
		for(int i = 0 ; i < 8; i++)
		{
			fase1 [i] = teclado.nextInt();
		}
		
		//Dvidir el primer array en bloques de 2 y comparar los datos que hay en su interior.
		System.out.println("Fase 2 : Separar el array en arrays de 2 posiciones.");
		
		//Primer bloque
		int [] fase2a = new int [2];
		fase2a[0] = fase1[0];
		fase2a[1] = fase1[1];
		System.out.println("Array 1 :" + fase2a[0] +" "+ fase2a[1]);
		
		//Ordenar el array
		if (fase2a[0] > fase2a[1])
		{
			aux = fase2a[0];
			fase2a[0] = fase2a[1];
			fase2a[1] = aux;
		}
		
		//Segundo bloque
		int [] fase2b = new int [2];
		fase2b[0] = fase1[2];
		fase2b[1] = fase1[3];
		System.out.println("Array 2 :" + fase2b[0] +" "+ fase2b[1]);
		
		//Ordenar el array
		if (fase2b[0] > fase2b[1])
		{
			aux = fase2b[0];
			fase2b[0] = fase2b[1];
			fase2b[1] = aux;
		}
		
		//Tercer bloque
		int [] fase2c = new int [2];
		fase2c[0] = fase1[4];
		fase2c[1] = fase1[5];
		System.out.println("Array 3 :" + fase2c[0] +" "+ fase2c[1]);
		
		//Ordenar el array
		if (fase2c[0] > fase2c[1])
		{
			aux = fase2c[0];
			fase2c[0] = fase2c[1];
			fase2c[1] = aux;
		}
		
		//Cuarto bloque
		int [] fase2d = new int [2];
		fase2d[0] = fase1[6];
		fase2d[1] = fase1[7];
		System.out.println("Array 4 :" + fase2d[0] +" " + fase2d[1]);
		
		//Ordenar el array
		if (fase2d[0] > fase2d[1])
		{
			aux = fase2d[0];
			fase2d[0] = fase2d[1];
			fase2d[1] = aux;
		}
		
		//Juntar los array anteriores formando 2 arrays
		System.out.println("Fase 3 : Juntar los 4 arrays de 2 posiciones en un array de 4 posiciones.");
		int [] fase3a = new int [4];
		fase3a [0] = fase2a [0];
		fase3a [1] = fase2a [1];
		fase3a [2] = fase2b [0];
		fase3a [3] = fase2b [1];
        
		//Ordenar el array
        for (int j = 0; j < fase3a.length - 1; j++) {
            for (int k = 0; k < fase3a.length - j - 1; k++) {
                if (fase3a[k + 1] < fase3a[k]) {
                    aux = fase3a[k + 1];
                    fase3a[k + 1] = fase3a[k];
                    fase3a[k] = aux;
                }
            }
        }
		
		
		System.out.println("Array 1 :" + fase3a [0] +" "+fase3a[1] +" "+ fase3a [2]+" "+fase3a [3] );
		int [] fase3b = new int [4];
		fase3b [0] = fase2c [0];
		fase3b [1] = fase2c [1];
		fase3b [2] = fase2d [0];
		fase3b [3] = fase2d [1];
        
		//Ordenar el array
		for (int l = 0; l < fase3b.length - 1; l++) {
            for (int m = 0; m < fase3b.length - l - 1; m++) {
                if (fase3b[m + 1] < fase3b[m]) {
                    aux = fase3b[m + 1];
                    fase3b[m + 1] = fase3b[m];
                    fase3b[m] = aux;
                }
            }
        }
		System.out.println("Array 2 :" + fase3b [0] +" "+fase3b[1] +" "+ fase3b[2]+" "+fase3b[3]);
		
		//Crear el array que contendrá los datos ordenados.
		System.out.println("Fase 4 : Guardar los número ordenados de menor a mayor.");
		int [] arrayordenado  = new int [9];
		
		//Juntar los datos de los dos array y ordenarlos mientras se unen al array,
		while(contador < 8)
		 {
			/**Mientras que ningún contador llegué a 4 se irán comparando los datos de los 2 array, en el momento en el que uno de  los contadores llegue a 4 
			significara que el array con ese contador se "ha vaciado", entonces los datos del array que aún no esta "vacío" se introducen directamente en el array de 8 posiciones.*/ 
			 if (contador1 < 4 && contador2 < 4)
			 {
				if(fase3a[contador1] > fase3b[contador2])
				{
					arrayordenado[contador] = fase3b[contador2];
					contador++;
					contador2++;
				}
				else if (fase3a[contador1] < fase3b[contador2] );
				{
					arrayordenado[contador] = fase3a[contador1];
					contador++;
					contador1++;
				}
				
			 }
		
			 else if (contador2 < 4)
				{
					arrayordenado[contador] = fase3b[contador2];
					contador2++;
					contador++;		
				}
			 else if (contador1 < 4)
				{
					arrayordenado[contador] = fase3a[contador1];
					contador1++;
					contador++;	
				}
		 }
		 
		//Mostrar el contenido del array
		 for(int n = 0 ; n < 8 ; n++)
		 {
			 System.out.print (arrayordenado[n] + " " );
		 }
		teclado.close();
	}

}
