package posiciones;

public enum Posicion {
BA("Base"),AL("Alero"),EX("Escolta"),AP("Ala-Pívot"),PT("Pívot");
	
	private String nombre;
	
	private Posicion(String nombre) {
		this.nombre = nombre;
	}
	
}
