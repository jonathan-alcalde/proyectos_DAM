import java.util.Scanner;

public class numerosordenados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Se crean 6 variables enteras 5 que guardar�n los n�meros pedidos por teclado y una sexta para que en
 en caso de que no se cumpla la condici�n de while intercambie los valores de los n�mero que no est�n
 en el orden correcto */		
int n1 = 0;
int n2 = 0;
int n3 = 0;
int n4 = 0;
int n5 = 0;
int aux = 0;
char repetir = 'S';
Scanner teclado = new Scanner(System.in);
do
{
	System.out.println("Introduce 5 n�meros (no pueden superar la 9 cifras)");
	n1 = teclado.nextInt();
	n2 = teclado.nextInt();
	n3 = teclado.nextInt();
	n4 = teclado.nextInt();
	n5 = teclado.nextInt();
	/*Este bucle se repetir� siempre y cuando n1 sea menor que n2 , n2 menor que n3, n3 menor que n4
 	o n4 menor que n5 */
	while (n1 < n2 || n2 < n3 || n3 < n4 || n4 < n5)
	{
		/*Si n1 es menor que n2 se guardar� el valor de n1 en la variable auxiliar, el valor de n1
	 	pasar� a ser el de n2 y n2 guardar� el valor de n1 que estaba en la variable auxiliar */
		if(n1 < n2)
		{
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		else
		{
			/*Si se cumple la condici�n anterior, se comprobar� si n2 es menor que n3, si resulta ser as�
		 	se repetir� el mismo proceso que en el if anterior pero con la varible n2 y n3 */
			if(n2 < n3)
			{
				aux = n2;
				n2 = n3;
				n3 = aux;
			}
			else
			{
				if(n3 < n4)	
				{
					aux = n3;
					n3 = n4;
					n4 = aux;
				}
				else
				{
					if (n4 < n5)
					{
						aux = n4;
						n4 = n5;
						n5 = aux;
					}
				}
			}
		}
	}
	
	/* Una vez que se han ordenado los datos y por ende, ya incumplen la condici�n para que se repita el
	 bucle while, n1 tendr� el valor m�s alto, n2 el segundo m�s alto y as� sucesivamente*/
	System.out.println(n1  + " " + n2 + " " + n3 + " " + n4 + " " + n5);	
	System.out.println("�Quieres repetir?");
	repetir = teclado.next().charAt(0);
}
while(repetir == 'S' || repetir == 's');
teclado.close();
}
}
