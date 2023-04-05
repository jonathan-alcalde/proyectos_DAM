package Alcalde_Usuga_Jonathan_01_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Servidor implements Runnable {
	
	private ArrayList<ManejadorDeConexiones> conexiones;
	private ServerSocket servidor;
	private boolean apagado;
	private ExecutorService grupo;
	
	public Servidor() {
		conexiones = new ArrayList<>();
		apagado = false;
		
	}
	
	@Override
	public void run() {

		try {

			servidor = new ServerSocket(9999);
			grupo = Executors.newCachedThreadPool();
			while(!apagado) {
				Socket cliente = servidor.accept();
				ManejadorDeConexiones manejador = new ManejadorDeConexiones(cliente);
				conexiones.add(manejador);
				grupo.execute(manejador);
			}
		}
		catch(IOException e){
			
		}
		
	}
	public void difusion(String mensaje) {
		for(ManejadorDeConexiones dif: conexiones) {
			if(dif != null) {
				dif.enviarMensaje(mensaje);
			}
		}
	}
	
	public void apagar() {
		try {	
			apagado = true;
			grupo.shutdown();
			if(!servidor.isClosed()) {
				servidor.close();
			}
			
			for(ManejadorDeConexiones dif: conexiones) {
				dif.cerrarConexion();
			}
			
			
		}catch(IOException e) {
			//Se ignora la excepcion
		}
	}
	
	
	class ManejadorDeConexiones implements Runnable {
		
		private Socket cliente;
		private BufferedReader in;
		private PrintWriter out;
		private String usuario;
		
		public ManejadorDeConexiones(Socket cliente) {
			this.cliente = cliente;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				out = new PrintWriter(cliente.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				out.println("Introduce un nombre de usuario");
				usuario = in.readLine();
				System.out.println(usuario + " se ha conectado");
				difusion(usuario + " se ha unido a la conversación");
				String mensaje;
				while((mensaje = in.readLine()) != null) {
					if(mensaje.startsWith("/nick")) {
						String[] mensajeSplit = mensaje.split(" ", 2);
						 if(mensajeSplit.length == 2) {
							 difusion(usuario + " se ha cambiado el nombre a " + mensajeSplit[1]);
							 System.out.println(usuario + " se ha cambiado el nombre a " + mensajeSplit[1]);
							 usuario  = mensajeSplit[1];
							 out.println("Se ha cambaido el nombre de usuario  a " + usuario + " con exito" );
						 }
					} else if(mensaje.startsWith("/quit")) {
						difusion(usuario + " ha salido de la conversación");
						cerrarConexion();
					}else {
						difusion(usuario + ": " + mensaje);
					}
				}
			} catch(IOException e) {
				cerrarConexion();
			}
			
		}
		
		public void enviarMensaje(String mensaje) {
			out.println(mensaje);
		}
		
		public void cerrarConexion() {
			try {
				in.close();
				out.close();
				if(!cliente.isClosed()) {
					cliente.close();
				}
			} catch(IOException e) {
				//Se ignora la excepcion
			}
			
		}
		
	}
	public static void main(String[] args) {
		Servidor servidor = new Servidor();
		servidor.run();
	}
    
}
