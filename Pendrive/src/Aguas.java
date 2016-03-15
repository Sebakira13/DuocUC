
public class Aguas {

	private String nombreCliente;
	private String direccionCliente;
	private double mesAnterior;
	private double mesActual;
	private double consumo;
	private double dineroConsumido;
	
	Aguas(String n, String dc, double man, double mac)
	{
		nombreCliente=n;
		direccionCliente=dc;
		mesAnterior=man;
		mesActual=mac;
		
	}
	
	public double getConsumoLitros()
	{
		consumo=mesActual-mesAnterior;
		return consumo;
	}
	
	public double getConsumoEnDinero()
	{
		dineroConsumido = consumo*35;
			return dineroConsumido;
	}	
	
	public double getTotalAPagar()
	{
		return (875+dineroConsumido+dineroConsumido*0.008);
	}
	
	public static void main(String[] args) {
		
		Aguas a1 = new Aguas("El wea", "Que te importa", 100000, 120000);
		
		System.out.println(a1.getConsumoEnDinero());
		System.out.println(a1.getConsumoLitros());
		System.out.println(a1.getTotalAPagar());

	}

}
