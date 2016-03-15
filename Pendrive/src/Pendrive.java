import java.util.Scanner;

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
		
		Scanner in = new Scanner(System.in);
		
		String nombre;
		double totalPendrive;
		int archivos;
		int disminuir;
		String respuesta;
		
		System.out.println("Ingrese nombre Pendrive");
		nombre = in.next();
		System.out.println("Ingrese capacidad ocupada en MB");
		totalPendrive = in.nextDouble();
		System.out.println("Ingrese total archivos");
		archivos = in.nextInt();
		
		Pendrive p1 = new Pendrive(nombre,totalPendrive,archivos);
		
			System.out.println("Quiere eliminar un archivo? Yes/No");
			respuesta = in.next();
			
			
			if (respuesta.compareToIgnoreCase("Yes")==0)
			{
				System.out.println("Ingrese peso del archivo en MB");
				disminuir = in.nextInt();
				p1.setDisminuir(disminuir);
			}
			else
			{
				System.out.println("OK");
			}
		
		System.out.println("");
		System.out.println("");
	
		/*
		p1.setDisminuir(1000);
		System.out.println(p1.getTotalOcupado());
		p1.setArchivoMenos();
		System.out.println(p1.getTotalArchivos());
		System.out.println(p1.getMarca());
		p1.setVirus();
		System.out.println(p1.getTotalOcupado());
		*/

	}

}