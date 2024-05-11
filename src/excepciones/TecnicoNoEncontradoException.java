package excepciones;

public class TecnicoNoEncontradoException extends Exception{

	public TecnicoNoEncontradoException() {
		
	}
	
	public TecnicoNoEncontradoException(String message) {
		super(message);
	}
}
