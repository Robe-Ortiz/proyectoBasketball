package posiciones;

public enum Posicion {
BA("Base"),AL("Alero"),ES("Escolta"),AP("Ala-Pívot"),PT("Pívot");
	
	private String nombre;
	
	private Posicion(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
}
