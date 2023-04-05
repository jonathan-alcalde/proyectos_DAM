package Alcalde_Usuga_Jonathan_01_003;
import java.util.Scanner;

public class Persona {
	public Scanner teclado = new Scanner(System.in);
	public String DNI;
	public Cuenta cuentasBancarias [] = new Cuenta [3];
	private int cantcuentas;
	
	public Persona() {
		this.DNI = "0000000";
		this.cuentasBancarias[0] = new Cuenta();
		this.cuentasBancarias[1] = new Cuenta();
		this.cuentasBancarias[2] = new Cuenta();	
	}
	
	public Persona(String paramDNI, Cuenta paramCuentasBancarias , Cuenta paramCuentasBancarias2 , Cuenta paramCuentasBancarias3)
	{
		this.DNI = paramDNI;
		this.cuentasBancarias[0] = paramCuentasBancarias;
		this.cuentasBancarias[1] = paramCuentasBancarias2;
		this.cuentasBancarias[2] = paramCuentasBancarias3;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public Cuenta[] getCuentasBancarias() {
		return cuentasBancarias;
	}
	public void setCuentasBancarias(Cuenta[] cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}
	
	public void añadirCuenta(Cuenta paramCuenta ) {
		if(cantcuentas >= cuentasBancarias.length)
		{
			System.out.println("No se pueden añadir mas cuentas");
		}
		
		
		cuentasBancarias[cantcuentas] = paramCuenta;
		cantcuentas++;
	}
	public boolean esMoroso(){
		boolean moroso = false;
		double saldo = 0;
		for(int i = 0; i < cuentasBancarias.length ; i++)
		{
			saldo = this.cuentasBancarias[i].saldo;
			if(saldo < 0)
			{	
				moroso = true;
			}

		}
		return moroso;
}
}