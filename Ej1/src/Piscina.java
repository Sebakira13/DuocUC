/**
 * 
 */

/**
 * @author cetecom
 *
 */


public class Piscina {

	private int ancho, largo, altura, cosa;
	
	public Piscina(int a, int l, int h)
	{
		ancho=a;
		largo=l;
		altura=h;
		
	}
	
	public int getLitrosAgua()
	{
		return ancho*largo*altura;
	}
	
	public int getLitrosPintura()
	{
		cosa=(ancho*altura)*2 + (largo*altura)*2 + (ancho*largo);
		return cosa/2;
		
	}

	
	public static void main(String[] args)
	{
		
		Piscina p1= new Piscina(1,2,3);
		System.out.println(p1.getLitrosAgua());
		System.out.println(p1.getLitrosPintura());
		
		
	}

}
