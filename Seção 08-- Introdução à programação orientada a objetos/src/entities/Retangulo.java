package entities;



public class Retangulo {
    public String resultado;
	public double base;
	public double altura;


	public double Area() 
	{
		return base*altura;
    }
	
	
	public double Perimetro() 
	{
		return 2*(base+altura);
    }
	
	public double Diagonal() 
	{
		return Math.sqrt(altura*altura+base*base);
	}
	
	public String toString() 
	{
		return  "Area :" + String.format("%.2f%n", Area()) + 
				"Perimetro: " + String.format("%.2f%n", Perimetro()) + 
				"Diagonal: " + String.format("%.2f%n", Diagonal());
		
	}
}
