import java.util.*;

public class Pendrive {
	
	private String marca;
	private double totalOcupado;
	private int cantidadArchivos;
	
	public Pendrive (String m, double to, int ca){
		
		marca=m;
		totalOcupado=to;
		cantidadArchivos=ca;
		
	}
	
	public double disminuir(double valor)
	{
		totalOcupado= totalOcupado-valor;
		return totalOcupado;
	}
	
	public void archivoMenos()
	{
		cantidadArchivos=cantidadArchivos-1;
	}
	
	public void virus()
	{
		totalOcupado=totalOcupado*0.1;
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public double getTotalOcupado()
	{
		return totalOcupado;
	}
	
	public int getTotalArchivos()
	{
		return cantidadArchivos;
	}
	
	
	public static void main(String[] args) {
		
		Pendrive p1 = new Pendrive("kingston",2024,10);
		p1.disminuir(100);
		
		

	}

}
