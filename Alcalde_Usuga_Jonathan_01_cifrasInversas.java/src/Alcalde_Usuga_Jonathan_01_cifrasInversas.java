import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_cifrasInversas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Se crean 7 variables, numero que guardará el número que dividiremos;n1,n2,n3,n4 y n5 que se usarán para almacenar el numero en unidades y
así poder mostrar el número al revés y aux que guardará el número y se usará para que se compare la condición en los if*/
int numero = 0;
int aux = 0;
int n1 = 0;
int n2 = 0;
int n3 = 0;
int n4 = 0;
int n5 = 0;
Scanner teclado = new Scanner (System.in);
System.out.println("Introduce un número");
numero = teclado.nextInt();
aux = numero;
/*Para que no se muestren 0 a la derecha en números menores de 10000 se dividirla el porgrama en 5 if*/
		if(aux >9999 && aux <100000)
		{
			/*para que se guarde solo la última cifra del número se divide el número entre 10 y se guarda el resto*/ 
			n5 = numero%10;
			/*después se avanza a la siguiente cifra diviendiendo entre 10 */
			numero = numero/10;
			/*Se vuelve a sacar el resto de número entre 10 y se guarda el resto en n4  */
			n4 = numero%10;
			/*Se vuelve a divir número entre 10 para "desplazar" una cifra */
			numero = numero/10;
			/*Se guarda la última cifra en n3 */
			n3 = numero%10;
			/*Se "desplaza" una cifra del número */
			numero = numero/10;
			/*Se guarda la última cifra en n2 */
			n2 = numero%10;
			numero = numero/10;
			/*Se guarda la última cifra en n1*/
			n1 = numero%10;
			/*Se muestra el número inverso*/
			System.out.println(n5 + "" + n4 + "" + n3 + "" + n2 + "" + n1);
		}
		/*En este if solo entrarán los número que se encuentren entre el 10000 y el 1000 */
		if(aux>999 && aux <10000)
		{
			/*Se guarda la última cifra en n4 */
			n4 = numero%10;
			/*Se "desplaza" el número una cifra */
			numero = numero/10;
			/*Se guarda la última cifra en n3*/
			n3 = numero%10;
			/*Se "desplaza" el número una cifra */
			numero = numero/10;
			/*Se guarda la última cifra en n2 */
			n2 = numero%10;
			/*Se "desplaza" el número una cifra*/
			numero = numero/10;
			/*Se guarda la última cifra en n1*/
			n1 = numero%10;
			/*Se muestra el número inverso */
			System.out.println(n4 + "" + n3 + "" + n2 + "" + n1);
		}
		/*En este if entrarán los números entre 999 y 100 */
		if(aux > 99 && aux <1000)
		{	
			/*Se guarda la última cifra en n3*/
			n3 = numero%10;
			/*Se "desplaza" el número una cifra */
			numero = numero/10;
			/*Se guarda la última cifra en n2*/
			n2 = numero%10;
			/*Se "desplaza" el número una cifra */
			numero = numero/10;
			/*Se guarda la última cifra en n1*/
			n1 = numero%10;
			/*Se muestra el número inverso */
			System.out.println(n3 + "" + n2 + "" + n1);
		}
		/*En este if entrarán los números entre 99 y 10*/
		if(aux>9 && aux<100)
		{	
			/*Se guarda la última cifra en n2*/
			n2 = numero%10;
			/*Se "desplaza" el número una cifra */
			numero = numero/10;
			/*Se guarda la última cifra en n1*/
			n1 = numero%10;
			/*Se muestra el número inverso */
			System.out.println(n2 + "" + n1);
		}
		if(aux >=0 && aux <10)
		{
		/*Si no se cumple ningún if significa que el número solo tiene un a cifra.  */
		System.out.println(numero);
		}
teclado.close();
	}

}
