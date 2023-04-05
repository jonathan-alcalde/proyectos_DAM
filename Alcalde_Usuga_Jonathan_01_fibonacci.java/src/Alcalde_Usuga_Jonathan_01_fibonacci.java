import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f = 0;
		int	n1 = 0;
		int n2 = 1;
		int n3 = 0;
		Scanner posicion = new Scanner (System.in);
		System.out.println("Escribe hasta que punto de la sucesión quieres llegar" + " (el programa solo funciona con números positivos)");
		f = posicion.nextInt();
		/*si f es igual a 0 se mostrará el primer número de la sucesión que es 0*/ 
		if (f>=0)
		{
			if (f == 0)
				{
				/*si f es igual a 1 se mostrarán los 2 primeros números de la sucesión que son el 1 y el 0 */
				System.out.println("f0 = " + n1 );
				}
			else
					{
					if (f == 1)
						{
						System.out.println("f0 = " + 0);
						System.out.println("f1 = " + 1);
						}
					else
						{
						System.out.println("f0 = " + 0);
						System.out.println("f1 = " + 1);
						/*Como ya se han mostrado los primeros 2 números de la sucesión
						 la variable repetición empezará con un valor de 2.
						 Ahora ya se puede aplicar el algoritmo de la sucesión de fibonacci que consiste en que cada
						 posición es la suma de sus 2 anteriores. Para ello el valor que queremos calcular será n3
						 el número anterior será n2 y el número dos posiciones atrás será n1, cuando se realice el 
						 cálculo n2 pasará a ser n1 ya que será el número 2 posiciones atras del siguien y también
						 n3 se guardará en n2 porque será el número de la posición anterior */
						for (int repeticion = 2; repeticion <= f; repeticion++)
							{
								n3 = n2 + n1;	
								System.out.println("f" + repeticion + " = " + n3);
								n1 = n2;
								n2 = n3;
								}
							}	
						}
					}

		posicion.close();
	}

}
