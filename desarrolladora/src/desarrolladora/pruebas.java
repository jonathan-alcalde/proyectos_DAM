package desarrolladora;

public class pruebas {

	public static void main(String[] args) {
		Desarrolladora d1 = new Desarrolladora();
		d1.getIdDesarrolladora();
		d1.getNombre();
		d1.getEmpleados();
		d1.getFechadeCreacion();
		d1.getVideojuegos();
		d1.getIdPublicadora();
		d1.getDireccion();
		d1.getProvincia();
		d1.getPais();
		d1.getTelefono();
		d1.getCorreoElectronico();
		
		d1.setIdDesarrolladora("74581A");
		d1.setNombre("Bugesda");
		d1.setEmpleados(74);
		d1.setFechadeCreacion("18/11/1997");
		d1.setVideojuegos("Fallout 3");
		d1.setIdPublicadora("Bethesda");
		d1.setDireccion("Callle Santander , 25A");
		d1.setProvincia("Zamora");
		d1.setPais("España");
		d1.setTelefono(68928945);
		d1.setCorreoElectronico("attbugesda@gmail.com");
		System.out.println(d1.obtenerContacto());
		System.out.println(d1.obtenerDireccionCompleta());
		System.out.println(d1.obtenerIdentificacionDesarrolladora());
		
		Empleados e1 = new Empleados();
		e1.getCorreoElectronico();
		e1.getDiaContratado();
		e1.getDNI();
		e1.getFechan();
		e1.getFinContrato();
		e1.getGrupo();
		e1.getIdDesarrolladora();
		e1.getLenguajesProgram();
		e1.getNombre();
		e1.getSalario();
		e1.getTelefono();
		e1.isEspañol();
		e1.isIngles();
		e1.isOtroIdioma();
		
		e1.setCorreoElectronico("aaaa@outlook.es");
		e1.setDiaContratado("20/12/2018");
		e1.setDNI(12453658);
		e1.setFechan("07/06/1998");
		e1.setFinContrato("20/08/2024");
		e1.setGrupo("Atención Al Cliente");
		e1.setIdDesarrolladora("561474aA");
		e1.setLenguajesProgram(" ");
		e1.setNombre("Pepe");
		e1.setSalario(1025);
		e1.setTelefono(72455151);
		e1.setEspañol(true);
		e1.setIngles(true);
		e1.setOtroIdioma(false);
		System.out.println(e1.obtenerInformacionEmpleado());
		System.out.println(e1.obtenerLetraDNI());
		System.out.println(e1.duracionContrato());
		System.out.println(e1.conocimientos());
		
		Videojuegos v1 = new Videojuegos();
		v1.getFechaSalida();
		v1.getGenero();
		v1.getVentas();
		v1.getIdDesarrolladora();
		v1.getIdDistribuidora();
		v1.getIdJuego();
		v1.getNombreJuego();
		v1.getPlataformas();
		v1.getMotor();
		v1.getPrecio();
		
		v1.setFechaSalida("03/03/2003");
		v1.setGenero("RPG");
		v1.setVentas(1000);
		v1.setIdDesarrolladora("2325646");
		v1.setIdDistribuidora("15445456");
		v1.setIdJuego("545454");
		v1.setNombreJuego("Sekiro Shadow Die Twice");
		v1.setPlataformas("PS4");
		v1.setMotor("Unreal Engine 4");
		v1.setPrecio(70);
		v1.añosAlaVenta();
		v1.identificacion();
		v1.informacionAdicional();
		v1.numeroJuego();
		
		
		Distribuidoras d12 = new Distribuidoras();
		d12.getCorreoElectronico();
		d12.getDireccion();
		d12.getIdDistribuidora();
		d12.getJuegosPublicados();
		d12.getnEmpleados();
		d12.getNombre();
		d12.getPais();
		d12.getProvincia();
		d12.getTelefono();
		
		d12.setCorreoElectronico("sasas@asas.com");
		d12.setDireccion("Arturo Duo 9");
		d12.setIdDistribuidora("1212231");
		d12.setJuegosPublicados("Dark Souls");
		d12.setnEmpleados(54);
		d12.setNombre("EA");
		d12.setPais("Francia");
		d12.setProvincia("Burg");
		d12.setTelefono(6458456);
		d12.obtenerContacto();
		d12.obtenerIdentificacionDistribuidora();
		d12.obtenerDireccionCompleta();
	}

}
