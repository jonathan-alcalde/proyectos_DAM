import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_numeroCifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*En la variable n�mero se guardar� el n�mero que se escriba por teclado*/
int numero = 0;
/*En la variable m�meroaux se guardar� el n�mero que se encuentra en la varible numero
 y ser� la variable que se utilizar� para contar las cifras ya que se utilizar� la varible n�mero
 para mostrar el mensaje al finalizar el programa */
int numeroaux = 0;
/*La variable cifras guardr� el n�mero de cifras que tiene el numero que se ha introducido */
int cifras = 0;
Scanner teclado = new Scanner (System.in);
System.out.println("Escribe un n�mero");
numero = teclado.nextInt();
numeroaux = numero;
/*El bucle do/while se repetira siempre que numeroaux no sea igual a 0 */
do
{
	/*Para saber las cifras que tiene el n�mero introducido, numeroaux se dividira entre 10, 
	ahora numeroaux ser� un n�mero con "una cifra menos" y se repetir� hasta que numeroaux 
	 sea un n�mero decimal entre 0 y 1 ,por ejemplo 0,15 que al ser una variable que solo 
	 guarda numeros enteros, numeroaux ser� 0 y el bucle do/while se frenar�a mostrando el n�mero 
	 de cifras que tiene el n�mero  ya que, cada vez que se repite se suma 1 a la variable cifras*/
	numeroaux = numeroaux/10; 
	cifras++;
}
while (numeroaux != 0);
System.out.println("El n�mero " + numero + " tiene " + cifras + " cifras");
teclado.close();
	}

}
