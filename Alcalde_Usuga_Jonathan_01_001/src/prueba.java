
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instituto ins1 = new Instituto();
		ins1.setID("00000000A");
		ins1.setNombre("UwU");
		ins1.setCapacidadActual(45);
		ins1.setCapacidadMaxima(50);
		ins1.setLocalidad ("OwO");
		ins1.setCalleNumero("EwE");
		ins1.setSecundaria(false);
		ins1.setBachillerato(false);
		ins1.setFp(false);
		System.out.println(ins1.ListarDireccionCompleta());
		
		Clase clas1 = new Clase();
				
		clas1.setiD(" ");
		clas1.setCurso(4);
		clas1.setLetra('A');
		clas1.setNumeroAlumnos(28);
		clas1.setSecundaria(false);
		clas1.setBachillerato(false);
		clas1.setFp(true);
				
		Alumno a1 = new Alumno();
		a1.setDNI("79048133P");
		a1.setNombre("Jonathan");
		a1.setNumeroMatricula(1204);
		a1.setTelefono(634717024);
		a1.setFechaNacimiento("18/03/2001");
		System.out.println(a1.getEdad());
		
		Modulo mod1 = new Modulo();
		mod1.setiD(" ");
		mod1.setNombre("Sistemas Informáticos en Red");
		mod1.setCurso(4);
		mod1.setSecundaria(false);
		mod1.setBachillerato(false);
		mod1.setFp(true);
		
	}

}
