package persona;

public class Tecnico {

	private String nombre;
	private String apellido;
	private int edad;
	
	
	public Tecnico(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return String.format("%s %s de %d años.\n", nombre,apellido,edad);
	}
	
	
}
