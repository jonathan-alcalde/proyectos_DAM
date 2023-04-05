package procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class procesosJonathanAlcalde {

	public static void main(String[] args) throws IOException, InterruptedException {
		String usuario;
		Scanner teclado = new Scanner(System.in);
		
		
		//Pedimos la información al usuario	
		System.out.println("Escribe el nombre del usuario");
		usuario = teclado.nextLine();
		System.out.println("Bienvenido " + usuario);
		
		
		//Variables de entorno ProcessBuilder		
		File salida = new File("scripts\\salida.txt");
        File error = new File("scripts\\error.txt");
        ProcessBuilder pb = new ProcessBuilder("cmd","/c","set");
        pb.redirectError(error);
        pb.redirectOutput(salida);
        pb.start();
        System.out.println("Las variables de entorno se han almacenado con éxito");
        
        
        
        //Variables de entorno Runtime
        Runtime r = Runtime.getRuntime();
        Map<String, String> entorno = pb.environment();
        r.exec("cmd /c");        
        entorno = System.getenv();
       	System.out.println("Lanzando las variables de entorno");
        System.out.println(entorno);
    
        System.out.println("Escribe una cadena de caracteres");
        String cadena = teclado.nextLine();
        ProcessBuilder pb2 = new ProcessBuilder("cmd","/c","FIND /C /I " + cadena);
 
        
        System.out.println("Elije la forma de almacenar la información");
        System.out.println("1-Mostrará la salida por consola");
        System.out.println("2-Se almacenará la información en un fichero");
        System.out.println("3-Se almacenará la información en un log");   
        int opcion = teclado.nextInt();
        switch(opcion) {
        	case 1:
        		Process process = pb2.start();

    			// blocked :(
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(process.getInputStream()));

                String line;
                while ((line = reader.readLine()) != null) {
                	System.out.println(line);
                }

                int exitCode = process.waitFor();
                System.out.println("\nExited with error code : " + exitCode);
                
        		break;
        	case 2:
        		File salida2 = new File("scripts\\salida2.txt");
        		pb2.redirectOutput(salida2);
        		pb2.start();
        		break;
        	case 3:
        		PropertyConfigurator.configure("maniobra\\log4j.properties");
                Logger logger = LogManager.getLogger("NAVEGACION");
                pb2.redirectErrorStream(true);
                Process process2 = pb2.start();
                /*Logger.readOutputOf(process2.getInputStream());
                Logger.getRootLogger().readErrorOf(process2.getErrorStream());*/
        		break;
        	default:
        		System.out.println("Se ha introducido un valor no válido");
        }
        
        
	}

}
