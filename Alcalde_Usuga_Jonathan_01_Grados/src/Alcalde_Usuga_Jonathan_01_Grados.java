import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_Grados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** declaramos las variables centigrados y farenheit,
		 */
		double centigrados;
		double farenheit;
		/** después creamos el objeto Scanner que guardará el valor en la variable centígrados */
		Scanner grados;
		grados = new Scanner (System.in);
		System.out.println("Escribe el número de grados que vas a convertir en farenheit");
		centigrados = grados.nextDouble();
	/** una vez que la variable centígrados tenga el valor que hayamos insertado con el teclado aplicamos la fórmula para pasar de grados centígrados a farenheit */
		farenheit = centigrados * 9 / 5 + 32;
		System.out.println(centigrados + " grados centígrados son " + farenheit + " grados farenheit");
			grados.close();
	}

}
