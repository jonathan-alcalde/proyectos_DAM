package Alcalde_Usuga_Jonathan_01_003;

public class PruebaCuentas {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		double saldoActual;
		
		p1.setDNI("79048133P");
		
		Cuenta c1 = new Cuenta();
		c1.setNumeroCuenta("75664");
		c1.setSaldo(0);
		
		Cuenta c2 = new Cuenta();
		c2.setNumeroCuenta("68485");
		c2.setSaldo(700);

		
		p1.añadirCuenta(c1);
		p1.añadirCuenta(c2);

		
		c1.recibirAbonos(1500);
		c2.pagarRecibo(750);
		
		System.out.println(p1.DNI + " es moroso: " + p1.esMoroso());

		
		saldoActual = c1.getSaldo();
		c1.setSaldo(saldoActual-50);
		
		saldoActual = c2.getSaldo();
		c2.setSaldo(saldoActual + 50);
		
		System.out.println(p1.DNI + " es moroso: " + p1.esMoroso());
	}
		

}
