package calculadora;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
double n1;
double n2;
double resultado;
char operacion;
char imprimir;
n1 = 5.55;
n2 = 1.11;
resultado=0;
operacion="+";
imprimir="s";
if (operacion=="+")
{
	resultado=n1+n2;
}
else
{
	if (operacion=="-")
	{
		resultado=n1-n2;
	}
	else
		{
		if(operacion == "*")
		{
			resultado = n1*n2;
		}
		else
		{
			resultado = n1/n2;
		}
		}
}
if (imprimir == "s")
{
	System.out.println("El resultado es"+ resultado);
}
else
	{
	System.out.println("No se imprimirá el resultado");
	}
}
}

