import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_descoPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0; //la variable n�mero guardar� el n�mero que se introduzca por teclado. 
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Teclea un n�mero: ");
		numero = teclado.nextInt(); //Se introduce el n�mero.
		System.out.print("Su descomposici�n en factores primos es: ");
		/*Se crea un for que empieza desde 2(ya que es el primer n�mero primo), 
		 se repetir� mientras que i sea menor o igual que numero y en cada repetici�n se sumar� 1 a i*/ 
		for (int i = 2; i <= numero; i++)
			{
			 /*Si i entre n�mero da resto 0 */
		    	if (numero % i == 0) 
		    	{
		    		numero = numero / i; //numero pasar� a ser la divisi�n entre n�mero e i
		    		System.out.print( i + " "); // se mostrar� i ya que es un factor de n�mero
		    		/*Y se restar� 1 a i para comprobar si n�mero puede volver a ser divido entre entre el mismo valor de i
		    		 por ejemplo, en el caso de 45 puede ser dividido 2 veces entre 3*/
		    		i--; 
		    	}
			}
		teclado.close();
	}
}	


