package tests;

public class Coche {

	public int velocidad;

	public void acelerar_Tatiana_Garijo(int aceleracion) {
		velocidad += aceleracion;
		
	}

	public void decelerar_Tatiana_Garijo(int deceleracion) {
		velocidad -= deceleracion;
		if(velocidad<0) velocidad=0;
		
	}
}
