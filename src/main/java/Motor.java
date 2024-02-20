package test;

public class Motor {
	public int numeroCilindros;
	public String tipo;
	public static int registro;

	public void cambiarRegistro(int registro) {
		Motor.registro = registro;
	}

	public void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "gasolina") {
			this.tipo = tipo;
		}
	}

}
