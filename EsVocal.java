package recuperacion;

import java.io.IOException;

public class EsVocal {

	public static void main(String[] args) throws IOException
	{
		System.out.println("introduce un carácter:");
		char car = (char) System.in.read(); 
		if(esVocal(car))
			System.out.println(car+ " es vocal");
		else
			System.out.println(car+ " no es vocal");

	}
	///////////////////////////////////////////////7
	public static boolean esVocal(char car)
	{
		return (car == 'a' || car == 'A' || car == 'e' || car == 'E' || car == 'i'
				|| car == 'I' || car == 'o' || car =='O' || car == 'u' || car == 'U');
				
	}

}
