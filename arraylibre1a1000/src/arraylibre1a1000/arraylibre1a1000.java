package arraylibre1a1000;

import java.util.Scanner;

public class arraylibre1a1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tama�o = 0;
		int[] numeros ;
		Scanner teclado= new Scanner (System.in);
		do
		{
			System.out.println("Teclea el tama�o que quieres que tenga el array(el array no puede ser mayor de 1000)");
			tama�o = teclado.nextInt();
		}
		while(tama�o > 1000);
		numeros = new int [tama�o];
		
		for(int i = 0;i < tama�o ; i ++)
		{
			numeros[i] = (int)(Math.random()*1000)+1;
			for(int j = 0;j < tama�o ; j ++)
			{
				if(j !=j && numeros[i]==numeros[j])
				{
					numeros[i]=(int)(Math.random()*1000)+1;
					i--;
				}
			}
		}
		for(int k =0; k <tama�o;k++)
		{
			System.out.println(numeros[k]);
		}
		
		teclado.close();
	}

}
