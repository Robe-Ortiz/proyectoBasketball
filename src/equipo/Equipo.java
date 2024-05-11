package equipo;

import java.util.ArrayList;
import java.util.List;

import persona.Jugador;
import persona.Tecnico;

public class Equipo {

	private String nombre;
	private Tecnico tecnico;
	private List<Jugador> listaDeJugadores = new ArrayList<Jugador>();
	
	
	public Equipo(String nombre, Tecnico tecnico, List<Jugador> listaDeJugadores) {
		this.nombre = nombre;
		this.tecnico = tecnico;
		this.listaDeJugadores = listaDeJugadores;
	}
	

	public String getNombre() {
		return nombre;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public List<Jugador> getListaDeJugadores() {
		return listaDeJugadores;
	}

	private String obtenerListaDeJugadores() {
		StringBuilder listaDeJugadoresString = new StringBuilder();
		listaDeJugadores.forEach(j-> listaDeJugadoresString.append(j).append("\n"));
		return listaDeJugadoresString.toString();
	}

	@Override
	public String toString() {
		return String.format("%s\n"
				+ "Tecnico:\n"
				+ "%s"
				+ "Jugadores:\n"
				+ "%s"
				, nombre.toUpperCase(),tecnico,obtenerListaDeJugadores());
	}
	
	
	
}
