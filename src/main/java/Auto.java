package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public static int registro;
	public int cantidadCreados;
	
	public int cantidadAsientos() {
		return asientos.length;
	}
	
	public String verificarIntegridad() {
		if(Motor.registro==Auto.registro && Asiento.registro==Motor.registro) {
			return "Auto original";
		}
		return "Las piezas no son originales";
	}

}
