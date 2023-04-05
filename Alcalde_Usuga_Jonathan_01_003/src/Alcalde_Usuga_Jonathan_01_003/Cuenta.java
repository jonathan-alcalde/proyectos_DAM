package Alcalde_Usuga_Jonathan_01_003;

public class Cuenta {
	 String numeroCuenta;
	 double saldo;
	 
	 public Cuenta() {
		 this.numeroCuenta = "0000";
		 this.saldo = 0;
	 }
	 
	 public Cuenta(String paramNumeroCuenta , double paramSaldo) {
		 this.numeroCuenta = paramNumeroCuenta;
		 this.saldo = paramSaldo;
	 }
	 
//getters ¬ setters	 
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String paramNumeroCuenta) {
		this.numeroCuenta = paramNumeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double paramSaldo) {
		this.saldo = paramSaldo;
	}
//Métodos
	public String saldoDisponible() {
		return "El saldo actual es de :" + saldo;
	}
	
	public String recibirAbonos(double paramAbonos) {
		double saldoActual = this.saldo;
		saldoActual = saldoActual + paramAbonos;
		this.saldo = saldoActual;
		return "Se ha recibido un abono de " + paramAbonos + "El saldo actual es de " + saldoActual;
	}
	
	public String pagarRecibo(double paramRecibo) {
		double saldoActual = this.saldo;
		saldoActual = saldoActual - paramRecibo;
		this.saldo = saldoActual;
		return "Se ha pagado un recibo  de " + paramRecibo + "El saldo actual es de " + saldoActual;
	}

			
	
	
	 
	 
}
