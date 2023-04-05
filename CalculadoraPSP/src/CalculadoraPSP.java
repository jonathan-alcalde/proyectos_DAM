import java.util.Scanner;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class CalculadoraPSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Declaramos e iniciamos las variables, se declaran 4 variables reales, "n1" y "n2" serán 
		 los operandos, "resultado" será el resultado de la operación indicada y "resto" para en caso
		 de hacerse una división que muestre también el resto, se crean dos variables enteras
		 "operación" donde se guardara el número que esta asociado a una operación y "continuar"
		 que almacenará un número que se pide al finalizar el programa */
		String numero;
		double n1 = 0;
		double n2 = 0;
		double resultado = 0;
		int operacion = 0;
		PropertyConfigurator.configure("maniobra\\log4j.properties");
        Logger logger = LogManager.getLogger("NAVEGACION");
		
		//Importamos java.util.Scanner para crear un objeto Scanner y asi poder introducir los datos que se pidan por teclado
		Scanner escanercalculadora;
		escanercalculadora = new Scanner (System.in);
		
		/*Creamos un bucle while que se repetirá hasta que el usuario escoja la opción de salida/
		do 
		{
		/*Ahora pedimos al usuario que introduzca los operandos y después que escriba un número que se
		 correspondrá con una operación */	
		
		System.out.println("Escribe 1 para hacer una suma");
		System.out.println("Escribe 2 para hacer una resta");
		System.out.println("Escribe 3 para hacer una multiplicación");
		System.out.println("Escribe 4 para hacer una división");
		System.out.println("Escribe 5 para mostrar un resto");
		System.out.println("Escribe 6 para salir");
		numero = escanercalculadora.next();
		try{
			operacion = Integer.parseInt(numero);
		}catch(NumberFormatException ex){
        	System.out.println(ex + " Solo se pueden introducir números");
        	return;
    	}
		
		do
		{
			System.out.println("Dame un numero: ");
			numero = escanercalculadora.next();
			try{
				n1 = Integer.parseInt(numero);
			}catch(NumberFormatException ex){
	        	System.out.println(ex + " Solo se pueden introducir números");
	        	return;
	    	}
			System.out.println("Dame otro numero: ");
			numero = escanercalculadora.next();
			try{
				n2 = Integer.parseInt(numero);
			}catch(NumberFormatException ex){
	        	System.out.println(ex + " Solo se pueden introducir números");
	        	return;
	    	}
		/*Ahora con un switch comprobamos el valor de la variable operacion para realizar
		 la operación que quiera el usuario si el número no coincide con ninguna se le
		 pedirá que introduzca otro número*/
		switch (operacion)
			{
		case 1: 
				resultado = n1 + n2;
				if(Integer.MIN_VALUE >= resultado || Integer.MAX_VALUE <= resultado)
		        {
					logger.info(n1 + " + " + n2 + " Resultado no valido ");
					throw new RuntimeException("Resultado no válido");          
		        }
				System.out.println ("El total es "+ resultado);
				logger.info(n1 + " + " + n2 + " el total es " + resultado);
				break;
		case 2:		
				resultado = n1-n2;
				if(Integer.MIN_VALUE >= resultado || Integer.MAX_VALUE <= resultado)
		        {
					logger.info(n1 + " + " + n2 + " Resultado no valido ");
					throw new RuntimeException("Resultado no válido");          
		        }
				System.out.println ("La diferencia es "+ resultado);
				logger.info(n1 + " - " + n2 + " la diferencia es " + resultado);
				break;
		case 3:
				resultado = n1*n2;
				if(Integer.MIN_VALUE >= resultado || Integer.MAX_VALUE <= resultado)
		        {
					logger.info(n1 + " + " + n2 + " Resultado no valido ");
					throw new RuntimeException("Resultado no válido");          
		        }
				System.out.println ("El producto es "+ resultado);
				logger.info(n1 + " x " + n2 + " el producto es " + resultado);
				break;
		case 4:
				if (n2 == 0) throw new ExcepcionNoVerificada("No se puede dividir entre 0");			
				resultado = n1/n2;
				if(Integer.MIN_VALUE >= resultado || Integer.MAX_VALUE <= resultado)
		        {
					logger.info(n1 + " + " + n2 + " Resultado no valido ");
					throw new RuntimeException("Resultado no válido");          
		        }
				System.out.println ("El cociente es "+ resultado);
				logger.info( n1 + " / " + n2 + "El cociente es " + resultado); 
				break;
		case 5:
			  if (n2 == 0) throw new ExcepcionNoVerificada("No se puede dividir entre 0");
		        resultado = n1 * n2;
		        if(Integer.MIN_VALUE >= resultado || Integer.MAX_VALUE <= resultado)
		        {
		        	logger.info(n1 + " + " + n2 + " Resultado no valido ");
		        	throw new RuntimeException("Resultado no válido");
		        }
				System.out.println("El resto es " + resultado);
				logger.info( n1 + " / " + n2 + "el resto es " + resultado); 
				break;
		case 6: 
			System.out.println("Se termina la ejecución del programa");
		default:
			System.out.println("Escribe otro número");
			break;
							}
									
		} while (operacion != 6) ;
		escanercalculadora.close();
		System.exit(0);
	}

}
