import java.util.Scanner;

class Alcalde_Usuga_Jonathan_01_fechas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia = 0; // la variable dia guardar� el dia de la primera fecha
		int mes = 0; // la variable mes guardar� el mes de la primera fecha
		int a�o = 0; // la variable a�o guardar� el a�o de la primera fecha
		int dia2 = 0; // la variable dia guardar� el dia de la segunda fecha
		int mes2 = 0; // la variable mes guardar� el mes de la segunda fecha
		int a�o2 = 0; // la variable a�o guardar� el a�o de la segunda fecha
		int difa�os = 0; 
		int difmeses = 0;
		int difdias = 0;
		int dias;
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
difa�os = a�o-a�o2;
difa�os = difa�os*360;
difmeses = mes-mes2;
difmeses=mes*30;
difdias = dia - dia2;
dias = difa�os-difmeses-difdias;
if(dias < 0)
{
	difa�os = a�o2-a�o;
	difa�os = difa�os*360;
	difmeses = mes2-mes;
	difmeses=mes*30;
	difdias = dia2 - dia;
	dias = difa�os-difmeses-difdias;
}
System.out.println("Hay " + dias + " dias de diferencias.");
teclado.close();
	}

}
