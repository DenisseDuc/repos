package recuperacion;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el primer valor:");
		double num1= entrada.nextDouble();
		System.out.println("Ingrese el segundo valor:");		
		double num2= entrada.nextDouble();
		System.out.println("Ingrese el tercer valor:");
		double num3 = entrada.nextDouble();
		double mayor = getMayor(num1,num2,num3);
		System.out.println("el mayor es:"+ mayor);
	}
	///////////////////////////////////////////////////////
	public static double getMayor(double num1, double num2, double num3)
	{
		if(num1>num2)
			if(num1>num3)
				return num1;
				    else
				    	return num3;
				else{
					    if(num2>num3)
					        return num2;
					    else
					        return num3;
				     }    
	}

}
