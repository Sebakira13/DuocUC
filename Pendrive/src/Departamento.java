import java.text.NumberFormat;
import java.util.Scanner;



public class Departamento {

	private String NombreComprador;
	private int NumeroDepto;
	private double PrecioBaseUF;
	
	public Departamento(){}
	
	public void setNombre(String n)
	{
		NombreComprador = n;
	}
	
	public void setNumeroDepto(int num)
	{
		if (num <= 999 && num > 99 )
		{
			NumeroDepto=num;
		}
		else 
		{
			System.out.println("Vuelva a intentar con un numero dentro de los parametros ");
		}
		
	}
	
	public void setPrecioBaseUF(double ufs)
	{
		PrecioBaseUF=ufs;
	}
	
	
	public String getNombreCompradot()
	{
		return NombreComprador;
	}
	
	public int getNumeroDepto()
	{
		return NumeroDepto;
	}
	
	public double getMontoAPagar()
	{
		int piso;
		double valorTotal;
		piso = (int) NumeroDepto/100;
		valorTotal= ((piso-1)*5 + PrecioBaseUF)*22703;
		return valorTotal;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numeroDepartamento;
		String nombre;
		double UFS;
		
		Departamento d1 = new Departamento();
		
		numeroDepartamento = in.nextInt();
		nombre = in.next();
		UFS = in.nextDouble();
		
		d1.setNombre(nombre);
		d1.setNumeroDepto(numeroDepartamento);
		d1.setPrecioBaseUF(UFS);
		
		System.out.println(d1.getMontoAPagar());
		
	}

}
