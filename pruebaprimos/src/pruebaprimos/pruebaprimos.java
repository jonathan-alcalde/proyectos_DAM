package pruebaprimos;

import java.util.Scanner;

public class pruebaprimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero = 0; //la variable n�mero guardar� el n�mero que se introduzca por teclado. 
Scanner teclado = new Scanner(System.in); 
System.out.println("Teclea un n�mero: ");
numero = teclado.nextInt(); //Se introduce el n�mero.
System.out.print("Su descomposici�n en factores primos es: ");
/*Se crea un for que empieza desde 2 y se repetir� mientras que i sea menor o igual que numero 
y en cada repetici�n se sumar� 1 a i*/ 
for (int i = 2; i <= numero; i++)
	{
	 /*Si i entre n�mero da resto 0 */
    	if (numero % i == 0) 
    	{
    		numero = numero / i; //numero pasar� a ser la divisi�n entre n�mero e i
    		System.out.print( i + " "); // se mostrar� i
    		/*Y se restar� 1 a i para que se vuelva a dividir entre el mismo valor de i,
    		 por ejemplo en 45: para que 45 pueda dividirse 2 veces entre 3*/	
        i--; 
    	}
	}
teclado.close();
	}

}
