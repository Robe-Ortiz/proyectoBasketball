package persona;

import posiciones.Posicion;

public class Jugador {

	private String nombre;
	private String apellido;
	private Posicion posicion;
	private int edad;
	private int dorsal;
	private int alturaEnCm;
	
	
	public Jugador(String nombre, String apellido, Posicion posicion, int edad, int dorsal, int alturaEnCm) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.posicion = posicion;
		this.edad = edad;
		this.dorsal = dorsal;
		this.alturaEnCm = alturaEnCm;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public int getEdad() {
		return edad;
	}

	public int getDorsal() {
		return dorsal;
	}

	public int getAlturaEnCm() {
		return alturaEnCm;
	}

	
	@Override
	public String toString() {
		return String.format("%s %s de %d años, mide %dcm, juega en la posición de %s con el dorsal %d",
				nombre,apellido,edad,alturaEnCm,posicion,dorsal);
	}
	
	
	
}
