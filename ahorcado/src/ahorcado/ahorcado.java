package ahorcado;

import java.util.Scanner;

public class ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int intentos = 6; //6 intentos
String [] nombre = new String [2];
int turno = 0;
String palabra = "0";
String adivina = "0";
String pista = "0";
int puntos []= new int [2];
String [] palabrasadivinadas = new String [10];
int contadorpalabras = 0;
System.out.println("Escribe tu nombre, jugador 1");
nombre[0] = teclado.nextLine();

System.out.println("Escribe tu nombre, jugador 2");
nombre[1] = teclado.nextLine();

while(puntos[0] != 3 || puntos[1] != 3)
{
if(turno == 0)
{
	System.out.println(nombre[0] +" escribe una palabra, " + nombre[1] + " tendrá que adivinarla.");
	palabra = teclado.nextLine();
	for(int i = 0; i<10;i++)
	{
	if(palabra == palabrasadivinadas[i])
	{
		System.out.println("Palabra repetida, vuelve a escribir otra");
		palabra = teclado.nextLine();
		i--;
	}
	}
	palabrasadivinadas[contadorpalabras] = palabra;
	contadorpalabras++;
	System.out.println(nombre[0] + " escirbe una pista sobre " + palabra);
	pista = teclado.nextLine();
	System.out.println(nombre[1] + " intenta adivinar la palabra");
	
}
else if(turno == 1)
{
	System.out.println(nombre[1] +" escribe una palabra, " + nombre[0] + " tendrá que adivinarla.");
	palabra = teclado.nextLine();
	for(int i = 0; i<10;i++)
	{
	if(palabra == palabrasadivinadas[i])
	{
		System.out.println("Palabra repetida, vuelve a escribir otra");
		palabra = teclado.nextLine();
		i--;
	}
	}
	System.out.println(nombre[1] + " escirbe una pista sobre " + palabra);
	pista = teclado.nextLine();
	System.out.println(nombre[0] + " intenta adivinar la palabra");

}

do
{
	adivina = teclado.nextLine();
	 if(palabra.equals(adivina))
	 {
		 System.out.println("FELICIDADES, " + nombre[turno]  + " HAS ACERTADO");
		if (turno == 0)
		{
		 puntos [1]++;
		}
		else if(turno == 1)
		{
			puntos[0]++;
		}
	 }
	else
	{
	 switch (intentos) {
     case 6:
         System.out.println(" ---------------------");
         System.out.println("__________");
         intentos--;
         System.out.println("Te quedan " + intentos + " intentos.");
         break;

     case 5:
         System.out.println(" ---------------------");
         System.out.println(" |                     |");
         System.out.println(" |                     |");
         System.out.println(" |                  -------");
         System.out.println(" |                 | -  -  |");
         System.out.println(" |                 |   o   |");
         System.out.println(" |                  -------");
         System.out.println("__________");
         intentos--;
         break;

     case 4:
         System.out.println(" ---------------------");
         System.out.println(" |                     |");
         System.out.println(" |                     |");
         System.out.println(" |                  -------");
         System.out.println(" |                 | -  -  |");
         System.out.println(" |                 |   o   |");
         System.out.println(" |                  -------");
         System.out.println(" |                     |   ");
         System.out.println(" |                     |   ");
         System.out.println(" |                     |   ");
         System.out.println(" |                     |   ");
         System.out.println(" |                     |   ");       
         System.out.println("__________");
         intentos--;
         System.out.println("Te quedan " + intentos + " intentos.");
         break;

     case 3:
         System.out.println(" ---------------------");
         System.out.println(" |                     |");
         System.out.println(" |                     |");
         System.out.println(" |                  -------");
         System.out.println(" |                 | -  -  |");
         System.out.println(" |                 |   o   |");
         System.out.println(" |                  -------");
         System.out.println(" |                     |   ");
         System.out.println(" |                   / |   ");
         System.out.println(" |                 /   |   ");
         System.out.println(" |                /    |   ");
         System.out.println(" |                     |   ");
         System.out.println("__________");
         System.out.println(pista);
         intentos--;
         System.out.println("Te quedan " + intentos + " intentos.");
         break;

     case 2:
         System.out.println(" ---------------------");
         System.out.println(" |                     |");
         System.out.println(" |                     |");
         System.out.println(" |                  -------");
         System.out.println(" |                 | -  -  |");
         System.out.println(" |                 |   o   |");
         System.out.println(" |                  -------");
         System.out.println(" |                     |   ");
         System.out.println(" |                   / | \\ ");
         System.out.println(" |                  /  |   \\ ");
         System.out.println(" |                 /   |     \\ ");
         System.out.println(" |                     |   ");
         System.out.println("__________");
         System.out.println(pista);
         intentos--;
         System.out.println("Te quedan " + intentos + " intentos.");
         break;

     case 1:
         System.out.println(" ---------------------");
         System.out.println(" |                     |");
         System.out.println(" |                     |");
         System.out.println(" |                  -------");
         System.out.println(" |                 | -  -  |");
         System.out.println(" |                 |   o   |");
         System.out.println(" |                  -------");
         System.out.println(" |                     |   ");
         System.out.println(" |                   / | \\ ");
         System.out.println(" |                  /  |   \\ ");
         System.out.println(" |                 /   |     \\ ");
         System.out.println(" |                     |   ");
         System.out.println(" |                    /  ");
         System.out.println(" |                   /      ");
         System.out.println(" |                  /       ");
         System.out.println("__________");
         System.out.println(pista);
         intentos--;
         System.out.println("Te quedan " + intentos + " intentos.");
         break;

     case 0:
        System.out.println(" ---------------------");
         System.out.println(" |                     |");
         System.out.println(" |                     |");
         System.out.println(" |                  -------");
         System.out.println(" |                 | X  X  |");
         System.out.println(" |                 |   o   |");
         System.out.println(" |                  -------");
         System.out.println(" |                     |   ");
         System.out.println(" |                   / | \\ ");
         System.out.println(" |                  /  |   \\ ");
         System.out.println(" |                 /   |     \\ ");
         System.out.println(" |                     |   ");
         System.out.println(" |                    / \\");
         System.out.println(" |                   /   \\  ");
         System.out.println(" |                  /     \\ ");
         System.out.println("__________");
         System.out.println("GAME OVER");
         intentos--;
         if(turno == 0)
         {
        	 puntos[1]++;
         }
         else if(turno != 0)
         {   	 
        	 puntos[0]++;
         }
         break;
	 }
         
 }
	 System.out.println(nombre[0] + " tiene " + puntos[0]);
	 System.out.println(nombre[1] + " tiene " + puntos[1]);
}	 
	 while(!palabra.equals(adivina) || intentos >= 0);
	if (turno == 0)
	{
		turno = 1;
	}
	else if(turno == 1)
	{
		turno = 0;
	}
}
teclado.close();
	}
}
