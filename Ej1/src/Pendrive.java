
public class Pendrive {
	
	private String marca;
	private double totalOcupado;
	private int cantidadArchivos;
	
	public Pendrive (String m, double to, int ca){
		
		marca=m;
		totalOcupado=to;
		cantidadArchivos=ca;
		
	}
	
	public void setDisminuir(double valor)
	{
		totalOcupado= totalOcupado-valor;
	}
	
	public void setArchivoMenos()
	{
		cantidadArchivos=cantidadArchivos-1;
	}
	
	public void setVirus()
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
		p1.setDisminuir(1000);
		System.out.println(p1.getTotalOcupado());
		p1.setArchivoMenos();
		System.out.println(p1.getTotalArchivos());
		System.out.println(p1.getMarca());
		p1.setVirus();
		System.out.println(p1.getTotalOcupado());
		

	}

}
