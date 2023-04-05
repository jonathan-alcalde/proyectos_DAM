package hasta250;

public class hasta250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Se crean dos variables donde n1 serán los números hasta el 250
 y n2 la variable a la que se le irán sumando los números*/
int n1 = 0;
int n2 = 0;
/* Se crea una condición donde se muestran 250 números empezando desde 0 */
do
{	
	/* En la primera línea dentro del for se muestra el número 
	 y en la segunda se produce la suma*/ 
	System.out.print(n1 + ",");
	n2 = n1 + n2;
	n1++;
}
while (n1 < 250);
/* al final se muestra el resultado de n2 tras sumar todos los números*/
System.out.println();
System.out.println("La suma de los números es: " + n2);
	}
}
