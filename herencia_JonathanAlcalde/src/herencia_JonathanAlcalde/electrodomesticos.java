package herencia_JonathanAlcalde;

public class electrodomesticos {
	double precioBase;
	String color;
	char consumoEnergetico;
	double peso;
	
	public electrodomesticos ()
	{
		precioBase = 100;
		color = "blanco";
		consumoEnergetico = 'F';
		peso = 5;
	}
	
	public electrodomesticos(double paramPrecioBase, String paramColor, 
			char paramConsumoEnergetico, double paramPeso)
	{
		precioBase = paramPrecioBase;
		color = paramColor;
		consumoEnergetico = paramConsumoEnergetico;
		peso = paramPeso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double precioConsumoEnergetico(char paramConsumoEnergetico) {
		double precioCE = 0;
		switch(paramConsumoEnergetico){
        case 'A':
            precioCE = 100;
            break;
        case 'B':
        	precioCE = 80;
            break;
        case 'C':
        	precioCE = 60;
            break;
        case 'D':
        	precioCE = 50;
            break;
        case 'E':
        	precioCE = 30;
            break;
        case 'F':
        	precioCE = 10;
            break;
    }
		return precioCE;
		
	}
    private void comprobarColor(String color){
    	   

        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color="blanco";
        }
          
          
    }
    
	 public double precioFinal(){
	        double plus=0;
	        switch(consumoEnergetico){
	            case 'A':
	                plus=100;
	                break;
	            case 'B':
	                plus=80;
	                break;
	            case 'C':
	                plus=60;
	                break;
	            case 'D':
	                plus=50;
	                break;
	            case 'E':
	                plus=30;
	                break;
	            case 'F':
	                plus=10;
	                break;
	        }
	   
	        if(peso>=0 && peso<19)
	        {
	            plus= plus + 10;
	        }
	        else if(peso>=20 && peso<49)
	        {
	            plus= plus + 50;
	        }
	        else if(peso>=50 && peso<=79)
	        {
	            plus= plus + 80;
	        }
	        else if(peso>=80)
	        {
	            plus= plus + 100;
	        }
	   
	        return precioBase+plus;
	    }
}
