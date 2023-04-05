import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_fechas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub		
		int dia = 0; // la variable dia guardará el dia de la primera fecha
		int mes = 0; // la variable mes guardará el mes de la primera fecha
		int año = 0; // la variable año guardará el año de la primera fecha
		int dia2 = 0; // la variable dia guardará el dia de la segunda fecha
		int mes2 = 0; // la variable mes guardará el mes de la segunda fecha
		int año2 = 0; // la variable año guardará el año de la segunda fecha
		int difaños = 0; // la variable difaños guardará el número de dias que hay comprendidos entre los 2 años
		int difmeses = 0; // la variable difmeses guardará el número de dias que hay comprendidos entre los 2 meses
		int difdias = 0; // la variable difdias guardará el número de dias que hay comprendidos entre los 2 dias
		int dias; //la variable dias guardará él número de dias que hay de diferencia entre las 2 fechas
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

		/* Para saber los días que puede haber como máximo comprendidos entre las 2 fechas, primero se restan los 2 años y la diferencia
		 se multiplica por 360 para saber los dias que puede haber como máximo*/
		difaños=año-año2;
		difaños=difaños*360;

		//*Después se restan los 2 meses y se multiplica la diferencia por 30 para saber los dias que hay entre esos dos meses *//
		difmeses=mes-mes2;
		difmeses=difmeses*30;

		//* Lo siguiente es restar los días*//
		difdias=dia-dia2;
		
		/*Finalmente se los dias que hay en total será la resta entre difaños, difmeses y difdias */
		dias=difaños-difmeses-difdias;
		
		/*Si dias es un número negativo se repetirán las operaciones pero se intercambiarán la posicion de los operandos restandose los
		siendo los valores de la segunda fecha el minuendo y los de la primera fecha el sustraendo */
		if(dias<0)
		{
			difaños=año2-año;
			difaños=difaños*360;
			
			difmeses=mes2-mes;
			difmeses=difmeses*30;
			
			difdias=dia2-dia;
			dias=difaños-difmeses-difdias;
		}
		
System.out.println("Hay " + dias + " dias de diferencias.");
teclado.close();
	}

}
