import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_descoPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0; //la variable número guardará el número que se introduzca por teclado. 
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Teclea un número: ");
		numero = teclado.nextInt(); //Se introduce el número.
		System.out.print("Su descomposición en factores primos es: ");
		/*Se crea un for que empieza desde 2(ya que es el primer número primo), 
		 se repetirá mientras que i sea menor o igual que numero y en cada repetición se sumará 1 a i*/ 
		for (int i = 2; i <= numero; i++)
			{
			 /*Si i entre número da resto 0 */
		    	if (numero % i == 0) 
		    	{
		    		numero = numero / i; //numero pasará a ser la división entre número e i
		    		System.out.print( i + " "); // se mostrará i ya que es un factor de número
		    		/*Y se restará 1 a i para comprobar si número puede volver a ser divido entre entre el mismo valor de i
		    		 por ejemplo, en el caso de 45 puede ser dividido 2 veces entre 3*/
		    		i--; 
		    	}
			}
		teclado.close();
	}
}	


