package hasta250;

public class hasta250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Se crean dos variables donde n1 ser�n los n�meros hasta el 250
 y n2 la variable a la que se le ir�n sumando los n�meros*/
int n1 = 0;
int n2 = 0;
/* Se crea una condici�n donde se muestran 250 n�meros empezando desde 0 */
do
{	
	/* En la primera l�nea dentro del for se muestra el n�mero 
	 y en la segunda se produce la suma*/ 
	System.out.print(n1 + ",");
	n2 = n1 + n2;
	n1++;
}
while (n1 < 250);
/* al final se muestra el resultado de n2 tras sumar todos los n�meros*/
System.out.println();
System.out.println("La suma de los n�meros es: " + n2);
	}
}
