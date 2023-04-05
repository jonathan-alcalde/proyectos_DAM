import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class procesos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder pb = new ProcessBuilder("set");
        File salida = new File("c:\\scripts\\salida.txt");
        File error = new File("c:\\scripts\\error.txt");
       
        /* pb.redirectError(error);
        pb.redirectOutput(salida);
        try {
            pb.start();
            pb.redirectError(error);
            pb.redirectOutput(salida);
        } catch (IOException ex) {
        	System.out.println("Error " + ex);
        }
        
        Runtime r = Runtime.getRuntime();
        String comando1 = "set";
        Process proceso;
        try {
        	proceso = r.exec(comando1);
        }catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Escribe una palabra");
        cadena = teclado.nextLine();
        
        Process process = Runtime.getRuntime().exec("find /c " + cadena);
        try {
                BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream()){
            String buff = null;
            while ((buff = br.readLine()) != null){
                	System.out.println(buff);
            		}
                }
        }
        catch (IOException ex){
        	System.out.println("Error" + ex);
        }
		*/
	}

}
