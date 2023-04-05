package herencia_JonathanAlcalde;

public class television extends electrodomesticos {
	int resolucion;
	boolean smartTV;
	
	public television() {
		resolucion = 0;
		smartTV = false;
	}
	
	public television(int paramResolucion, boolean paramSmartTV)
	{
		
	}
	
	public void precioTelevisionBase(int paramResolucion, boolean paramSmartTV)
	{
		double precioBase = 0;
		switch(paramResolucion)
		{
		case 768:
			precioBase = 10;
			break;
		case 1080:
			precioBase = 20;
			break;
		case 1200:
			precioBase = 30;
			break;
		case 1440:
			precioBase = 40;
		case 1600:
			precioBase = 50;
			break;	
		}
		
		if(paramSmartTV == true)
		{
			precioBase = precioBase + 100;
		}
		
	}
	public double precioFinal()
	{
		double precioBase = super.precioFinal();
		
		switch(resolucion)
		{
		case 768:
			precioBase = precioBase + 10;
			break;
		case 1080:
			precioBase = precioBase + 20;
			break;
		case 1200:
			precioBase = precioBase + 30;
			break;
		case 1440:
			precioBase = precioBase + 40;
		case 1600:
			precioBase = precioBase + 50;
			break;	
		}
		
		if(smartTV == true)
		{
			precioBase = precioBase + 100;
		}
		return precioBase = super.precioFinal() ;
		
  
	}
	
}
