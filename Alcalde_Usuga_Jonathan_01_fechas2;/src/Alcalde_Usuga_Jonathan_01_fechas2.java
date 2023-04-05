import java.util.Scanner;

class Alcalde_Usuga_Jonathan_01_fechas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia = 0; // la variable dia guardará el dia de la primera fecha
		int mes = 0; // la variable mes guardará el mes de la primera fecha
		int año = 0; // la variable año guardará el año de la primera fecha
		int dia2 = 0; // la variable dia guardará el dia de la segunda fecha
		int mes2 = 0; // la variable mes guardará el mes de la segunda fecha
		int año2 = 0; // la variable año guardará el año de la segunda fecha
		int difaños = 0; 
		int difmeses = 0;
		int difdias = 0;
		int dias;
		Scanner teclado = new Scanner(System.in);
		/*El programa pedirá la fecha siempre que se introduzca como día un número mayor a 30
		 y como mes un número mayor a 12 */
		do
		{
			System.out.println("Introduce una fecha, introduce primero el día, después el mes y finalmente el año");
			dia = teclado.nextInt();
			mes = teclado.nextInt();
			año = teclado.nextInt();
		}
		while(dia>30 || mes>12);
		System.out.println("Introduce la segunda fecha, introduce primero el día, después el mes y finalmente el año");
		do
		{
			dia2 = teclado.nextInt();
			mes2 = teclado.nextInt();
			año2 = teclado.nextInt();
		}
		while(dia2>30 || mes2>12);
difaños = año-año2;
difaños = difaños*360;
difmeses = mes-mes2;
difmeses=mes*30;
difdias = dia - dia2;
dias = difaños-difmeses-difdias;
if(dias < 0)
{
	difaños = año2-año;
	difaños = difaños*360;
	difmeses = mes2-mes;
	difmeses=mes*30;
	difdias = dia2 - dia;
	dias = difaños-difmeses-difdias;
}
System.out.println("Hay " + dias + " dias de diferencias.");
teclado.close();
	}

}
