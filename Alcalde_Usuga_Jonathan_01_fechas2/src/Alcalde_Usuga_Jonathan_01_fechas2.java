import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_fechas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub		
		int dia = 0; // la variable dia guardar� el dia de la primera fecha
		int mes = 0; // la variable mes guardar� el mes de la primera fecha
		int a�o = 0; // la variable a�o guardar� el a�o de la primera fecha
		int dia2 = 0; // la variable dia guardar� el dia de la segunda fecha
		int mes2 = 0; // la variable mes guardar� el mes de la segunda fecha
		int a�o2 = 0; // la variable a�o guardar� el a�o de la segunda fecha
		int difa�os = 0; // la variable difa�os guardar� el n�mero de dias que hay comprendidos entre los 2 a�os
		int difmeses = 0; // la variable difmeses guardar� el n�mero de dias que hay comprendidos entre los 2 meses
		int difdias = 0; // la variable difdias guardar� el n�mero de dias que hay comprendidos entre los 2 dias
		int dias; //la variable dias guardar� �l n�mero de dias que hay de diferencia entre las 2 fechas
		Scanner teclado = new Scanner(System.in);
		/*El programa pedir� la fecha siempre que se introduzca como d�a un n�mero mayor a 30
		 y como mes un n�mero mayor a 12 */
		do
		{
			System.out.println("Introduce una fecha, introduce primero el d�a, despu�s el mes y finalmente el a�o");
			dia = teclado.nextInt();
			mes = teclado.nextInt();
			a�o = teclado.nextInt();
		}
		while(dia>30 || mes>12);
		System.out.println("Introduce la segunda fecha, introduce primero el d�a, despu�s el mes y finalmente el a�o");
		do
		{
			dia2 = teclado.nextInt();
			mes2 = teclado.nextInt();
			a�o2 = teclado.nextInt();
		}
		while(dia2>30 || mes2>12);
		/*El programa pedir� la fecha siempre que se introduzca como d�a un n�mero mayor a 30
		 y como mes un n�mero mayor a 12 */

		/* Para saber los d�as que puede haber como m�ximo comprendidos entre las 2 fechas, primero se restan los 2 a�os y la diferencia
		 se multiplica por 360 para saber los dias que puede haber como m�ximo*/
		difa�os=a�o-a�o2;
		difa�os=difa�os*360;

		//*Despu�s se restan los 2 meses y se multiplica la diferencia por 30 para saber los dias que hay entre esos dos meses *//
		difmeses=mes-mes2;
		difmeses=difmeses*30;

		//* Lo siguiente es restar los d�as*//
		difdias=dia-dia2;
		
		/*Finalmente se los dias que hay en total ser� la resta entre difa�os, difmeses y difdias */
		dias=difa�os-difmeses-difdias;
		
		/*Si dias es un n�mero negativo se repetir�n las operaciones pero se intercambiar�n la posicion de los operandos restandose los
		siendo los valores de la segunda fecha el minuendo y los de la primera fecha el sustraendo */
		if(dias<0)
		{
			difa�os=a�o2-a�o;
			difa�os=difa�os*360;
			
			difmeses=mes2-mes;
			difmeses=difmeses*30;
			
			difdias=dia2-dia;
			dias=difa�os-difmeses-difdias;
		}
		
System.out.println("Hay " + dias + " dias de diferencias.");
teclado.close();
	}

}
