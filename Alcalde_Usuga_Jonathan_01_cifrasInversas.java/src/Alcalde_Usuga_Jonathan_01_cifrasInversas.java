import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_cifrasInversas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Se crean 7 variables, numero que guardar� el n�mero que dividiremos;n1,n2,n3,n4 y n5 que se usar�n para almacenar el numero en unidades y
as� poder mostrar el n�mero al rev�s y aux que guardar� el n�mero y se usar� para que se compare la condici�n en los if*/
int numero = 0;
int aux = 0;
int n1 = 0;
int n2 = 0;
int n3 = 0;
int n4 = 0;
int n5 = 0;
Scanner teclado = new Scanner (System.in);
System.out.println("Introduce un n�mero");
numero = teclado.nextInt();
aux = numero;
/*Para que no se muestren 0 a la derecha en n�meros menores de 10000 se dividirla el porgrama en 5 if*/
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
			/*Se muestra el n�mero inverso*/
			System.out.println(n5 + "" + n4 + "" + n3 + "" + n2 + "" + n1);
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
			/*Se muestra el n�mero inverso */
			System.out.println(n4 + "" + n3 + "" + n2 + "" + n1);
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
			/*Se muestra el n�mero inverso */
			System.out.println(n3 + "" + n2 + "" + n1);
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
			/*Se muestra el n�mero inverso */
			System.out.println(n2 + "" + n1);
		}
		if(aux >=0 && aux <10)
		{
		/*Si no se cumple ning�n if significa que el n�mero solo tiene un a cifra.  */
		System.out.println(numero);
		}
teclado.close();
	}

}
