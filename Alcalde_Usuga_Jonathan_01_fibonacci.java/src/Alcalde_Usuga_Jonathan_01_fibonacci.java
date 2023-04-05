import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f = 0;
		int	n1 = 0;
		int n2 = 1;
		int n3 = 0;
		Scanner posicion = new Scanner (System.in);
		System.out.println("Escribe hasta que punto de la sucesi�n quieres llegar" + " (el programa solo funciona con n�meros positivos)");
		f = posicion.nextInt();
		/*si f es igual a 0 se mostrar� el primer n�mero de la sucesi�n que es 0*/ 
		if (f>=0)
		{
			if (f == 0)
				{
				/*si f es igual a 1 se mostrar�n los 2 primeros n�meros de la sucesi�n que son el 1 y el 0 */
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
						/*Como ya se han mostrado los primeros 2 n�meros de la sucesi�n
						 la variable repetici�n empezar� con un valor de 2.
						 Ahora ya se puede aplicar el algoritmo de la sucesi�n de fibonacci que consiste en que cada
						 posici�n es la suma de sus 2 anteriores. Para ello el valor que queremos calcular ser� n3
						 el n�mero anterior ser� n2 y el n�mero dos posiciones atr�s ser� n1, cuando se realice el 
						 c�lculo n2 pasar� a ser n1 ya que ser� el n�mero 2 posiciones atras del siguien y tambi�n
						 n3 se guardar� en n2 porque ser� el n�mero de la posici�n anterior */
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
