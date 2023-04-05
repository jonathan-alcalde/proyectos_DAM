import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_fechas {

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
		/*El programa pedirá la fecha siempre que se introduzca como día un número mayor a 30
		 y como mes un número mayor a 12 */
		if (año<año2)
		{
			difaños = año2-año;
		}
		else
		{
			difaños = año -año2;
		}
		difaños = difaños*360;
		/*Después se guarda la diferencia que hay entre los dos meses y se multiplica por 30 para
		 saber los dias que máximo han podido pasar en esos meses */
		if (mes < mes2)
		{
			difmeses = mes2 - mes;
		}
		else
		{
			difmeses = mes - mes2;
		}
		difmeses = difmeses*30;
		/*Finalmente se guarda la diferencia entre los dos dias introducidos, después se resta
		 difaños, difmes y dias para saber los dias totales que han pasado */
			if(dia < dia2)
			{
				difdias = dia2 - dia;
			}
			else
			{
				difdias = dia - dia2;
			}
			dias = difaños - difmeses + difdias;
		

			if (dias < 0)
			{
				dias = dias * -1;
			}
		/*Si se introduce primero una fecha menor que la siguiente dias será un número negativo
		 para evitar que se muestre el número negativo se introduce en un que comprobará si el número
		 es negativo y si lo es se multiplicará por -1*/

System.out.println("Hay " + dias + " dias de diferencias.");
teclado.close();
	}

}
