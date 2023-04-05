import java.util.Scanner;

public class calculadora2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Declaramos las variables
	double n1;
	double n2;
	double resultado;
	double resto;
	int operacion;
	//Importamos java.util.Scanner
	Scanner escanercalculadora;
	// Iniciamos las variables asignandolas un valor
	n1 = 0;
	n2 = 0;
	resultado = 0;
	operacion = 0;
	resto = 0;
	escanercalculadora = new Scanner (System.in);
	System.out.println("Dame un numero: ");
	n1 = escanercalculadora.nextDouble();
	System.out.println("Dame otro numero: ");
	n2 = escanercalculadora.nextDouble();
	System.out.println("Indica la operacion que vas a hacer: ");
	operacion = escanercalculadora.nextInt();
	if (operacion == 1)
		{
			resultado = n1 + n2;
			System.out.println ("El total es "+ resultado);
		}
	else
		{
			if(operacion == 2)
			{
				resultado = n1-n2;
				System.out.println ("La diferencia es "+ resultado);
			}
			else
			{
				if(operacion == 3)
				{
					resultado = n1*n2;
					System.out.println ("El producto es "+ resultado);
				}
				else
				{
					resultado = n1/n2;
					resto = n1%n2;
					System.out.println ("El cociente es "+ resultado);
					System.out.println (" resto es "+ resto);
				}
			}
		}
	escanercalculadora.close();
}
	
}

