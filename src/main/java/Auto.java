package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public int cantidadCreados;
	
	public int cantidadAsientos() {
		return this.asientos.length;
	}
	
	public String verificarIntegridad() {
		if(Motor.interes==Auto.interes && Asiento.interes==Motor.interes) {
			return "Auto original";
		}
		return "Las piezas no son originales";
	}

}
