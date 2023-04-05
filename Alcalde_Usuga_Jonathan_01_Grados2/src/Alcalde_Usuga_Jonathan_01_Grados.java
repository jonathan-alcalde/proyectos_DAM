import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_Grados {

	double centigrados;
	double farenheit;
	double calculo;
	Scanner grados;
	grados = new Scanner (System.in);
	System.out.println("Escribe el número de grados que vas a convertir en farenheit");
	centigrados = grados.nextDouble();
	calculo = 9 / 5 * centigrados;
	farenheit = calculo + 32;
	System.out.println(centigrados + "grados centígrados son " + farenheit + " grados farenheit");
		
			
}
}