import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Se crean 9 variables, numero y aux que guardar�n el n�mero que se instroduce por teclado
		 n1, n2, n3, n4 y n5 que guardar�n las cifras que componen el n�mero para luego invertirlas
		 y comprobar que el n�mero inverso es igual al n�mero que se ha introducido y 
		 2 strings numero2 guardar�  el n�mero original como un string y aux2 que guardar�  el 
		 n�mero inverso como String */
		int numero = 0;
		int aux = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		String numero2 = "0";
		String aux2 = "0";
		Scanner teclado = new Scanner (System.in);
		/*El programa solo admitir� n�meros menores de 6 cifras*/
		do
		{
		System.out.println("Introduce un n�mero que tenga menos de 6 cifras.");
		numero = teclado.nextInt();
		}
		while(numero>=100000);
		aux = numero;	
		if(aux >9999 && aux <100000)
		{
			/*para que se guarde solo la �ltima cifra del n�mero se divide el n�mero entre 10 y se guarda el resto*/ 
			n5 = numero%10;
			/*despu�s se avanza a la siguiente cifra diviendiendo entre 10 */
			numero = numero/10;
			/*Se vuelve a sacar el resto de n�mero entre 10 y se guarda el resto en n4  */
			n4 = numero%10;
			/*Se vuelve a divir n�mero entre 10 para "desplazar" una cifra */
			numero = numero/10;
			/*Se guarda la �ltima cifra en n3 */
			n3 = numero%10;
			/*Se "desplaza" una cifra del n�mero */
			numero = numero/10;
			/*Se guarda la �ltima cifra en n2 */
			n2 = numero%10;
			numero = numero/10;
			/*Se guarda la �ltima cifra en n1*/
			n1 = numero%10;
			/*Se guarda el n�mero inverso en el String aux2*/
			aux2 = n5 + "" + n4 + "" + n3 + "" + n2 + "" + n1;
			/*Se guarda el n�mero con el orden que se ha instroducido en numero2*/
			numero2 = n1 + "" + n2 + "" + n3 + "" + n4 + "" + n5;
			/*No se pueden comparar Strings igual que los int, doubles, etc por lo que se utiliza
			 .equals para comparar numero2 y aux2, si son iguales se mostrar� el  mensaje de que son
			 capicuas sino dir� que no son capicuas*/
			if (numero2.equals(aux2))
			{
				System.out.println("El n�mero es capicua.");
			}
			else
			{
				System.out.println("El n�mero no es capicua.");
			}
		}
		/*En este if solo entrar�n los n�mero que se encuentren entre el 10000 y el 1000 */
		if(aux>999 && aux <10000)
		{
			/*Se guarda la �ltima cifra en n4 */
			n4 = numero%10;
			/*Se "desplaza" el n�mero una cifra */
			numero = numero/10;
			/*Se guarda la �ltima cifra en n3*/
			n3 = numero%10;
			/*Se "desplaza" el n�mero una cifra */
			numero = numero/10;
			/*Se guarda la �ltima cifra en n2 */
			n2 = numero%10;
			/*Se "desplaza" el n�mero una cifra*/
			numero = numero/10;
			/*Se guarda la �ltima cifra en n1*/
			n1 = numero%10;
			/*Se guarda el n�mero inverso en el String aux2*/
			aux2 =n4 + "" + n3 + "" + n2 + "" + n1;
			/*Se guarda el n�mero con el orden que se ha instroducido en numero2*/
			numero2 = n1 + "" + n2 + "" + n3 + "" + n4;
			/*No se pueden comparar Strings igual que los int, doubles, etc por lo que se utiliza
			 .equals para comparar numero2 y aux2, si son iguales se mostrar� el  mensaje de que son
			 capicuas sino dir� que no son capicuas*/
			if (numero2.equals(aux2))
			{
				System.out.println("El n�mero es capicua.");
			}
			else
			{
				System.out.println("El n�mero no es capicua.");
			}
		}
		/*En este if entrar�n los n�meros entre 999 y 100 */
		if(aux > 99 && aux <1000)
		{	
			/*Se guarda la �ltima cifra en n3*/
			n3 = numero%10;
			/*Se "desplaza" el n�mero una cifra */
			numero = numero/10;
			/*Se guarda la �ltima cifra en n2*/
			n2 = numero%10;
			/*Se "desplaza" el n�mero una cifra */
			numero = numero/10;
			/*Se guarda la �ltima cifra en n1*/
			n1 = numero%10;
			/*Se guarda el n�mero inverso en aux2*/
			aux2 =n3 + "" + n2 + "" + n1;
			/*Se guarda el n�mero con el orden que se ha instroducido en numero2*/
			numero2 =n1 + "" + n2 + "" + n3;
			/*No se pueden comparar Strings igual que los int, doubles, etc por lo que se utiliza
			 .equals para comparar numero2 y aux2, si son iguales se mostrar� el  mensaje de que son
			 capicuas sino dir� que no son capicuas*/
			if (numero2.equals(aux2))
			{
				System.out.println("El n�mero es capicua.");
			}
			else
			{
				System.out.println("El n�mero no es capicua.");
			}
		}
		/*En este if entrar�n los n�meros entre 99 y 10*/
		if(aux>9 && aux<100)
		{	
			/*Se guarda la �ltima cifra en n2*/
			n2 = numero%10;
			/*Se "desplaza" el n�mero una cifra */
			numero = numero/10;
			/*Se guarda la �ltima cifra en n1*/
			n1 = numero%10;
			/*Se guarda el n�mero inverso en aux2*/
			aux2 =n2 + "" + n1;
			/*Se guarda el n�mero con el orden que se ha instroducido en numero2*/
			numero2 =n1 + "" + n2;
			/*No se pueden comparar Strings igual que los int, doubles, etc por lo que se utiliza
			 .equals para comparar numero2 y aux2, si son iguales se mostrar� el  mensaje de que son
			 capicuas sino dir� que no son capicuas*/
			if (numero2.equals(aux2))
			{
				System.out.println("El n�mero es capicua.");
			}
			else
			{
				System.out.println("El n�mero no es capicua.");
			}
		}
		if(aux >=0 && aux <10)
		{
		/*Si no se cumple ning�n if significa que el n�mero solo tiene un a cifra. */
		System.out.println("El n�mero solo tiene una cifra por lo que siempre es capicua.");
		}
teclado.close();
	}
}