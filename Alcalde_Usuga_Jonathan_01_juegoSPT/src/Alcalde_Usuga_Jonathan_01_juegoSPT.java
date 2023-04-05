import java.util.Scanner;

public class Alcalde_Usuga_Jonathan_01_juegoSPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Se declaran 3 variables, partidas ,que almacenar� el n�mero de rondas que se van a jugar;
 ganadasj1, que almacenar� un contador de rondas que ha ganado el primer jugador y 
 ganadasj2, que almacenar� un contador de rondas que ha ganado el segundo jugador*/
int partidas = 0;
int ganadasj1 = 0;
int ganadasj2 = 0;	
/*Se crea un objeto Scanner */
Scanner numeropartidas = new Scanner(System.in);
/*Primero se pedir� un n�mero para saber el n�mero de rondas que se van a jugar,
 que ser� el n�mero de veces que se repita el bucle while */
System.out.println("�Cuantas partidas se jugar�n?");
partidas = numeropartidas.nextInt();
while (partidas > 0 )
{
/*Ahora se pedir� a los jugadores que escriban el c�racter que esta asociado al objeto */
System.out.println("jugador 1,�Piedra(R), papel (P), o tijera(S)?");
char jugador1 = numeropartidas.next().charAt(0);
/*Para que no se pueda ver la elecci�n del jugador 1 se hace un bucle for que muestre l�neas en blanco para "limpiar" la consola */
for (int i=0; i < 12; i++)

{

 System.out.println();

}
System.out.println("jugador 2,�Piedra(R), papel (P), o tijera(S)?");
char jugador2 = numeropartidas.next().charAt(0);
/*Ahora se har� una cadena de ifs donde se se tendr�n que cumplir dos condiciones para realizar la instrucci�n del IF, 
 en el primer if, si las dos variables son iguales no se sumar� ning�n punto a ning�n jugador */
if(jugador1 == jugador2)
{
	System.out.println("Esta ronda se ha empatado");
}
else
{
	/*Si no se cumple la primera condici�n, se pasar� al siguiente if que tiene que cumplir la condici�n de que 
	 la variable jugador 1 es igual a R y jugador2 es igual a P, si se cumplen las dos condiciones se sumar� un punto al jugador 2*/
	if(jugador1 == 'R' && jugador2 == 'P')
	{
	System.out.println("Jugador 2 gana esta ronda");
	ganadasj2++;
	}
	else
		{
		/*En  este if si jugador1 es igual a R y jugador2 igual a S, se sumar� un punto a j1 */
		if(jugador1 == 'R' && jugador2 == 'S')
		{
		System.out.println("Jugador 1 gana esta ronda");
		ganadasj1++;
		}
		else
			{
			/*Cuando jugador1 sea igual a P y jugador2 igual a R se sumar� un punto a jugador1 */
			if(jugador1 == 'P' && jugador2 == 'R')
			{				
			System.out.println("Jugador 1 gana esta ronda");
			ganadasj1++;
			}
			else
				{
				/*En el caso de que jugador1 sea P y jugador2 sea S se sumar� un punto a jugador2 */
				if (jugador1 == 'P' && jugador2 == 'S')
				{
				System.out.println("Jugador 2 gana esta ronda");
				ganadasj2++;
				}
				else
					{
					/*Si jugador1 es igual a S y jugador2 es R se sumar� un punto al jugador2 */
					if (jugador1 == 'S' && jugador2 == 'R')
					{
					System.out.println("Jugador 2 gana esta ronda");
					ganadasj2++;
					}
					else
						{
						/*Finalmente, si no se cumple ninguna condici�n de las anteriores ser� que jugador1 es igual a S y jugador2 es P
						 asi que se sumar� un punto al jugador1 */ 
						if(jugador1 == 'S' && jugador2 == 'P')
						{
							System.out.println("Jugador 1 gana esta ronda");
							ganadasj1++;
						}
						
					}
				}
			}
		}
	}
}	
/*Tras cumplirse una de las condiciones y sumar el punto al ganador de la ronda se restar� a la variable partidas 1, 
 para ver si se sigue cumpliendo la condici�n del bucle while y se sacar� un mensaje avisando de las rondas que faltan */ 
partidas--;
System.out.println("Quedan " + partidas  + " rondas");
}
/*Al final del programa se mostrar�n los puntos que ha ganado cada jugador */ 
System.out.println("El jugador 1 ha ganado " + ganadasj1 + " rondas");
System.out.println("El jugador 2 ha ganado " + ganadasj2 + " rondas");
numeropartidas.close();

	}

	
}

	


