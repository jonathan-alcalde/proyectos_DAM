package pruebaprimos;

import java.util.Scanner;

public class pruebaprimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero = 0; //la variable número guardará el número que se introduzca por teclado. 
Scanner teclado = new Scanner(System.in); 
System.out.println("Teclea un número: ");
numero = teclado.nextInt(); //Se introduce el número.
System.out.print("Su descomposición en factores primos es: ");
/*Se crea un for que empieza desde 2 y se repetirá mientras que i sea menor o igual que numero 
y en cada repetición se sumará 1 a i*/ 
for (int i = 2; i <= numero; i++)
	{
	 /*Si i entre número da resto 0 */
    	if (numero % i == 0) 
    	{
    		numero = numero / i; //numero pasará a ser la división entre número e i
    		System.out.print( i + " "); // se mostrará i
    		/*Y se restará 1 a i para que se vuelva a dividir entre el mismo valor de i,
    		 por ejemplo en 45: para que 45 pueda dividirse 2 veces entre 3*/	
        i--; 
    	}
	}
teclado.close();
	}

}
