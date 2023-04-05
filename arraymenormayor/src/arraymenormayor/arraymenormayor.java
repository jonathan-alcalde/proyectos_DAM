package arraymenormayor;

public class arraymenormayor {

	public static void main(String[] args) {
int [] menormayor = new int [5];
int [] ordenado = new int [5];
int contador = 0;
	menormayor [0] = 2;
	menormayor [1] = 8;
	menormayor [2] = 10;
	menormayor [3] = -146;
	menormayor [4] = 0;

	for (int i = -999999; i <=999999; i++)
	{
		if(menormayor[0] ==  i)
		{
			ordenado[contador] = menormayor[0];
			System.out.println(ordenado[contador]);
			contador++;
		}
		if(menormayor[1] ==  i)
		{
			ordenado[contador] = menormayor[1];
			System.out.println(ordenado[contador]);
			contador++;
		}
		if(menormayor[2] ==  i)
		{
			ordenado[contador] = menormayor[2];
			System.out.println(ordenado[contador]);
			contador++;
		}
		if(menormayor[3] ==  i)
		{
			ordenado[contador] = menormayor[3];
			System.out.println(ordenado[contador]);
			contador++;
		}
		if(menormayor[4] ==  i)
		{
			ordenado[contador] = menormayor[4];
			System.out.println(ordenado[contador]);
			contador++;
		}
		
	}
	

	}

}
