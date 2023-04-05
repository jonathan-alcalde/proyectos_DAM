import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_numeroCifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*En la variable número se guardará el número que se escriba por teclado*/
int numero = 0;
/*En la variable múmeroaux se guardará el número que se encuentra en la varible numero
 y será la variable que se utilizará para contar las cifras ya que se utilizará la varible número
 para mostrar el mensaje al finalizar el programa */
int numeroaux = 0;
/*La variable cifras guardrá el número de cifras que tiene el numero que se ha introducido */
int cifras = 0;
Scanner teclado = new Scanner (System.in);
System.out.println("Escribe un número");
numero = teclado.nextInt();
numeroaux = numero;
/*El bucle do/while se repetira siempre que numeroaux no sea igual a 0 */
do
{
	/*Para saber las cifras que tiene el número introducido, numeroaux se dividira entre 10, 
	ahora numeroaux será un número con "una cifra menos" y se repetirá hasta que numeroaux 
	 sea un número decimal entre 0 y 1 ,por ejemplo 0,15 que al ser una variable que solo 
	 guarda numeros enteros, numeroaux será 0 y el bucle do/while se frenaría mostrando el número 
	 de cifras que tiene el número  ya que, cada vez que se repite se suma 1 a la variable cifras*/
	numeroaux = numeroaux/10; 
	cifras++;
}
while (numeroaux != 0);
System.out.println("El número " + numero + " tiene " + cifras + " cifras");
teclado.close();
	}

}
