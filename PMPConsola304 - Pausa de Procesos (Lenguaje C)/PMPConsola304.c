/**
 * En este ejemplo se muestra:
 *  1. C�mo enviar una se�al a un proceso en un tiempo elegido por el usuario para que otro proceso se pause
 *     justo en ese momento. 
 * Para compilar y ejecutar este proyecto, ser� necesario disponer de un compilador de C para crear el ejecutable. En sistemas UNIX/Linux:
 * lbb@ubuntu:~$ gcc PMPConsola304.c -o PMPConsola304
 * lbb@ubuntu:~$ ./PMPConsola304
 * @author Luis de Blas
 * @version 1.0
 * @since PSP 1.0
*/

#include<stdio.h>
#include<signal.h>
#include<unistd.h>

void sig_handler(int signo) {
    if (signo == SIGUSR1){
        printf("Recibida la se�al de pausa!\n");
        printf("Estar� pausado 5 segundos m�s...\n");
	pause();
    }
    else
	if (signo == SIGUSR2){
	    printf("Pulse CTRL+C para finalizar.\n");
        }
}

int main(void) {
    int pausar=0;

    do{
	printf("Elige en qu� segundo se pausar� el proceso:\n");
	scanf("%d",&pausar); 
	if(pausar<=0)
	   printf("Introduzca un valor entero positivo.\n");
    } while (pausar<=0);
    printf("El programa se parar� en %d segundos...\n", pausar);
    pid_t pid;
    if ( (pid=fork()) == 0 ) {
	//El proceso hijo manda se�al SIGUSR1 al padre en el momento indicado para que �ste se pause
	sleep(pausar);
	kill(getppid(), SIGUSR1);
	//5 segundos despu�s le pide al padre que reanude (con la se�al SIGUSR2)
	sleep(5);
	kill(getppid(), SIGUSR2);
	exit(0);
    }
    else{
	//el proceso padre debe capturar las se�ales que le mande el otro proceso
        if (signal(SIGUSR1, sig_handler) == SIG_ERR)
        	printf("No se puede capturar la se�al SIGUSR1.\n");
        if (signal(SIGUSR2, sig_handler) == SIG_ERR)
        	printf("No se puede capturar la se�al SIGUSR2.\n");
	while(1){
	  printf("@");
	}
    }
    return 0;
}
