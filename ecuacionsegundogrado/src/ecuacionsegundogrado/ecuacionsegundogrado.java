package ecuacionsegundogrado;

import java.util.Scanner;


public class ecuacionsegundogrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Se crean 6 variables reales, 3 cuyo valor tendrá que ser introducido por teclado; otras 2 que
 servirán para guardar las posibles soluciones de la ecuación y raizcuadrada, que guardará el
 valor de la solución  */		
double a = 0;
double b = 0;
double c = 0;
double x1 = 0;
double x2 = 0;
double raizcuadrada = 0;
/* Se crea un objeto Scanner que pidá el valor de los datos de la ecuación */
Scanner valor = new Scanner (System.in);
System.out.println("Introduce el valor de a");
a = valor.nextDouble();
System.out.println("Introduce el valor de b");
b = valor.nextDouble();
System.out.println("Introduce el valor de c");
c = valor.nextDouble();

/*la form*/
raizcuadrada = (b * b) - (4 * a * c);
if(raizcuadrada > 0)
	{	
	/*Si raizcuadrada es mayor que 0 significará que la ecuación tiene dos soluciones,
	 una en la que el resultado de la raiz cuadrada es positivo y otro en el que la solución de la
	 raíz cuadrada es negativo  */
		x1 = (-b + Math.sqrt(raizcuadrada)) / (2 * a);
		x2 = (-b - Math.sqrt(raizcuadrada)) / (2 * a);
		System.out.println("Los valores de x son: " + x1 + " y " + x2);
	}
	else
		{
		/*Si raizcuadrada es igual a 0 significa que solo tiene una solución */
			if (raizcuadrada == 0)
				{
					x1 = -b / (2 * a);
					System.out.println("El valor de x son: " + x1);
				}
			/*Si no, la ecuación no tiene solución real */
				else
					{
						System.out.println("No hay solución");
					}
		}
	

	}
}
