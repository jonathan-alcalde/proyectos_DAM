package herencia_JonathanAlcalde;

public class lavadora extends electrodomesticos{
	int carga;
	int rpm;
	
	public lavadora()
	{
		carga = 0;
		rpm = 0;
	}
	public lavadora(int paramCarga, int paramRpm)
	{
		carga = paramCarga;
		rpm = paramRpm;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	public int precioRPM(int paramRpm)
	{
		int plus = 0;
		switch(paramRpm)
		{
        case 1400:
            plus=100;
            break;
        case 1200:
            plus=80;
            break;
        case 800:
            plus=60;
            break;
        case 600:
            plus=50;
            break;
		}
		return plus;
	}
	
	public double precioFina()
	{
		double plus=super.precioFinal();
		if (carga > 20)
		{
			plus = plus + 40;
		}
		return plus;
	}
	
	
}
