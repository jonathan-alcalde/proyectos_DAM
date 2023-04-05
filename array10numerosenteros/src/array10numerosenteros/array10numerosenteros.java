package array10numerosenteros;

import java.util.Scanner;

public class array10numerosenteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración del array y variables enteras
		int[] numeros = new int[10];
		int metodo = 0;
		int auxiliar = 0;
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		int contadorPares = 0;
		int contadorImpares = 0;
		int sieteunidadesdemillar = 0;
		Scanner teclado = new Scanner (System.in);
		
		//Forma de introducir los datos	
		do
		{
			System.out.println("Teclea 1 para que el array se llene de números aleatorios o escribe 2 para rellenar el array con tus propios números. ");	
			metodo = teclado.nextInt();	
		}
		while(metodo != 1 && metodo != 2);
		
		
		//Rellenar el array
		if(metodo == 1)
		{	
			System.out.println("El array se llenará con números aleatorios.");
			for(int i = 0; i<10; i++)
			{
				numeros[i] = (int)(Math.random()*99999)+0;
				System.out.println("La posición " + i + " contiene el número " + numeros[i] + ".");
			}	
		}
		else if(metodo  == 2)
		{
			for(int i = 0; i<10; i++)
			{
				System.out.println("Escribe el número que se encontrará en la posición " + i + " del array.");
				numeros[i] = teclado.nextInt();
			}
		}
		
		//Conteo del array
		
			//Positivo o negativo
			for(int j = 0; j<10; j++)
			{
				auxiliar = numeros[j];
				if (auxiliar >=0)
				{
					contadorPositivos++;
				}
				else if (auxiliar < 0)
				{
					contadorNegativos++;
				}
			}
			System.out.println("El array contiene " + contadorPositivos + " numeros positivos y " + contadorNegativos + " numeros negativos.");
			
			//Par o Impar
			for(int k = 0; k<10; k++)
			{
				
				auxiliar = numeros[k];
				
				if (auxiliar%2 == 0)
				{
					contadorPares++;
				}
				else if (auxiliar%2 != 0)
				{
					contadorImpares++;
				}							
			}
			System.out.println("El array contiene " + contadorPares + " numeros pares y " + contadorImpares + " numeros impares.");	
			
			//Cuantos tienen en la cifra de las unidades de millar un 7.
			for(int l = 0; l<10; l++)
			{
				auxiliar = numeros[l];
				if(auxiliar > 0)
				{
				/*El numero tiene 4 cifras*/
					if ( auxiliar > 6999 && auxiliar < 8000)
					{
						sieteunidadesdemillar++;
					}
				/*El numero tiene 5 cifras*/
					else if (auxiliar%10000 > 6999 && auxiliar%10000 < 8000)
					{
						sieteunidadesdemillar++;
					}	
				}
				else if(auxiliar < 0)
				{
					if ( auxiliar < -6999 && auxiliar > -8000)
					{
						sieteunidadesdemillar++;
					}
					/*El numero tiene 5 cifras*/
					else if (auxiliar%10000 < -6999 || auxiliar%10000 > -8000)
					{
						sieteunidadesdemillar++;
					}	
				}
			}
			System.out.println(sieteunidadesdemillar + " números tienen 7 en sus unidades de millar.");
			
			teclado.close();
		}
	}