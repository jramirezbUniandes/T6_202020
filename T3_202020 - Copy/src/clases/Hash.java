package clases;

public class Hash 
{
	
	String llave;
	int posicion;
	int tamaņo = 0;
	int sigPrimo = siguientePrimo(tamaņo);
	
	public Hash(String pLlave, int pTamaņo)
	{
		llave = pLlave;
		tamaņo = pTamaņo; 
		posicion = funcionHash(llave, tamaņo, sigPrimo);
	}
	
	public String darLlave()
	{
		return llave;
	}
	
	public int darPosicion()
	{
		return posicion;
	}
	
	public int funcionHash(String llaveACambiar, int tamaņoLista, int tamaņoSiguientePrimo)
	{
		int rta = Math.abs(llaveACambiar.hashCode());
		rta = ((rta*darNumeroAlAzar(tamaņoSiguientePrimo)+ darNumeroAlAzar(tamaņoSiguientePrimo))% tamaņoSiguientePrimo)%tamaņoLista;
		if(rta <0)
		{
			rta*= -1;
		}
		return rta;
	}
	
	public int siguientePrimo(int num) 
	{
		num++;
		for (int i = 2; i < num; i++) 
		{
			if(num%i == 0) 
			{
				num++;
				i=2;
			} else 
			{
				continue;
			}
		}
		return num;
	}
	
	   
	public int darNumeroAlAzar(int tamaņoSiguientePrimo){ 
     int max = tamaņoSiguientePrimo; 
     int min = 1; 
     int range = max - min + 1; 
     int rta = 0;

     for (int i = 0; i < tamaņoSiguientePrimo; i++) 
     { 
         rta = (int)(Math.random() * range) + min; 
     } 
    return rta;
 }
	
}
