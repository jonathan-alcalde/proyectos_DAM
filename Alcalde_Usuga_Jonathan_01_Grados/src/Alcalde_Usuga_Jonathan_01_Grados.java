import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_Grados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** declaramos las variables centigrados y farenheit,
		 */
		double centigrados;
		double farenheit;
		/** despu�s creamos el objeto Scanner que guardar� el valor en la variable cent�grados */
		Scanner grados;
		grados = new Scanner (System.in);
		System.out.println("Escribe el n�mero de grados que vas a convertir en farenheit");
		centigrados = grados.nextDouble();
	/** una vez que la variable cent�grados tenga el valor que hayamos insertado con el teclado aplicamos la f�rmula para pasar de grados cent�grados a farenheit */
		farenheit = centigrados * 9 / 5 + 32;
		System.out.println(centigrados + " grados cent�grados son " + farenheit + " grados farenheit");
			grados.close();
	}

}
