package ejemplo;

public class Diezxciento {
	
	
	public int ahorro;
	public int sueldo;
	
	public Diezxciento() {
		ahorro=2000000;
		sueldo=700000;
	}
	
	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
	}
	
	public int diezxciento(int monto) {
		double diezxciento =monto*0.1;
		System.out.println(diezxciento);
		return (int) diezxciento;
		
	}
	
	public int impuesto()
	{
		return 0;
	}
	public int saldoAhorro() {
		double noventaxciento =ahorro*0.9;
		return (int) noventaxciento;
	}
	
	
	//saca dinero según impuesto
	public int calculaImpuesto(int renta)
	{
		if(renta>3000000) {
			double aux = (renta+(renta*0.2));
			renta=(int)aux;
			
		}
		else {
			renta=0;
		}
		return renta; 
		
	
	}
	
	//metodo que valida los ahorros
	
	public static int sacarAhorros (int ahorros)
	{
		//int ahorros=this.ahorro;
		int aux;
		
		if(ahorros>=10000000 && ahorros<=50000000)
		{
			aux= (int)(ahorros*0.1);
			
		}
		else if(ahorros <=1000000 && ahorros>=1000000)
		{
			aux= 1000000;
		}
		else if(ahorros<=1000000)
		{
			aux=(int)(ahorros*0.1);
		}
		else if(ahorros>=50000000)
		{
			aux= 5000000;
			
		}
		else {
			aux=0;
		}
		
		System.out.println (aux);
		return aux;
		
	}
	

	
	
	
	
	
	
	
	
	

}
