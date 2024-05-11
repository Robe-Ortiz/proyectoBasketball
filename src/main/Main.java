package main;

import java.util.List;

import excepciones.EquipoNoEncontradoException;
import excepciones.TecnicoNoEncontradoException;
import nba.LigaNba;
import persona.Jugador;
import posiciones.Posicion;

public class Main {

	public static void main(String[] args) {
		
		//LigaNba.informacionBasicaDeLaLiga();		
		//List<Jugador> listaJugadores = LigaNba.obtenerTodosLosJugadores();
		//listaJugadores.forEach(System.out::println);
		
		//System.out.println(LigaNba.mostrarEdadMediaJugadoresDeLaLiga());
		//LigaNba.informacionDetalladaDeCadaEquipo();

		//LigaNba.informacionBasicaDeLaLiga();
		//System.out.println(LigaNba.mostrarEdadMediaJugadoresDeUnEquipo("Miami Heat 12_13"));
		//LigaNba.mostrarJugadoresDeLaLigaPorPosicion(Posicion.PT).forEach(System.out::println);
		//System.out.println(LigaNba.sumarPersonasActivasEnLaLiga());
		//System.out.println(LigaNba.jugadorDeMenorAltura().get());
		//System.out.println(LigaNba.jugadorDeMayorAltura().get());
		
		LigaNba.imprimirJugadoresOrdenadosPorNombreConElApellidoEnPrimerLugarYEnMayusculas();
		//LigaNba.imprimirJugadoresPorDorsalOrdenadosPorAlturaDescendente(33);
		/*		
		try{
			System.out.println(LigaNba.informacionDetalladaDeUnEquipoPorSuNombre("Chicago Bulls 95_96"));
		}catch(EquipoNoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(LigaNba.informacionDetalladaDeUnEquipoPorSuTecnico("phil","JackSON").get());
		}catch (TecnicoNoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		//LigaNba.imprime5JugadoresAleatoriosDeLaLigaOrdenadosPorNombre();
		//LigaNba.obten10JugadoresAleatoriosConElNombreYApellidoEnMayusculas().forEach(System.out::println);
		
	}
	
	
}
