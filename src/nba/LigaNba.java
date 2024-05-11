package nba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import equipo.Equipo;
import excepciones.TecnicoNoEncontradoException;
import excepciones.EquipoNoEncontradoException;
import persona.Jugador;
import persona.Tecnico;
import posiciones.Posicion;

public class LigaNba {
		
	 private static Equipo chicagoBulls95_96 = crearChicagoBulls95_96();
	 private static Equipo lakers80_81 = crearLakers80_81();
	 private static Equipo spurs00_01 = crearSpurs00_01();
	 private static Equipo miamiHeat12_13 = crearMiamiHeat12_13();
	 private static List<Equipo> listaDeEquipos = crearListaEquipos();
	 
		private static List<Equipo> crearListaEquipos(){
	 		listaDeEquipos = new ArrayList<Equipo>();	 		
	 			 		
	 		listaDeEquipos.add(chicagoBulls95_96);
	 		listaDeEquipos.add(lakers80_81);
	 		listaDeEquipos.add(spurs00_01);
	 		listaDeEquipos.add(miamiHeat12_13);
	 		
	 		return listaDeEquipos;
	 	}
	   
	    private static Equipo crearChicagoBulls95_96() {
	       
	        Tecnico tecnico = new Tecnico("Phil", "Jackson", 50);	  
	        List<Jugador> jugadoresChicagoBulls95_96 = new ArrayList<>();
	        jugadoresChicagoBulls95_96.add(new Jugador("Michael", "Jordan", Posicion.EX, 33, 23, 198));
	        jugadoresChicagoBulls95_96.add(new Jugador("Scottie", "Pippen", Posicion.AL, 30, 33, 203));
	        jugadoresChicagoBulls95_96.add(new Jugador("Dennis", "Rodman", Posicion.AP, 34, 91, 201));
	        jugadoresChicagoBulls95_96.add(new Jugador("Ron", "Harper", Posicion.BA, 32, 9, 198));
	        jugadoresChicagoBulls95_96.add(new Jugador("Luc", "Longley", Posicion.PT, 27, 13, 218));

	        return new Equipo("Chicago Bulls 95_96",tecnico, jugadoresChicagoBulls95_96);
	    }
	
	    private static Equipo crearLakers80_81() {

	        Tecnico tecnico = new Tecnico("Paul", "Westhead", 50);	
	        List<Jugador> jugadoresLakers80_81 = new ArrayList<>();
	        jugadoresLakers80_81.add(new Jugador("Magic", "Johnson", Posicion.BA, 21, 32, 206));
	        jugadoresLakers80_81.add(new Jugador("Kareem", "Abdul-Jabbar", Posicion.PT, 33, 33, 218));
	        jugadoresLakers80_81.add(new Jugador("James", "Worthy", Posicion.AL, 19, 42, 203));
	        jugadoresLakers80_81.add(new Jugador("Michael", "Cooper", Posicion.EX, 23, 21, 198));
	        jugadoresLakers80_81.add(new Jugador("Kurt", "Rambis", Posicion.AP, 22, 31, 203));

	        return new Equipo("Ángeles Lakers 80_81",tecnico, jugadoresLakers80_81);
	    }

	    private static Equipo crearSpurs00_01() {

	        Tecnico tecnico = new Tecnico("Gregg", "Popovich", 52);
	        List<Jugador> jugadoresSpurs00_01 = new ArrayList<>();
	        jugadoresSpurs00_01.add(new Jugador("Tim", "Duncan", Posicion.AP, 25, 21, 211));
	        jugadoresSpurs00_01.add(new Jugador("David", "Robinson", Posicion.PT, 35, 50, 213));
	        jugadoresSpurs00_01.add(new Jugador("Manu", "Ginóbili", Posicion.AL, 23, 20, 198));
	        jugadoresSpurs00_01.add(new Jugador("Tony", "Parker", Posicion.BA, 18, 9, 188));
	        jugadoresSpurs00_01.add(new Jugador("Bruce", "Bowen", Posicion.EX, 29, 12, 201));

	        return new Equipo("San Antonio Spurs 00_01",tecnico, jugadoresSpurs00_01);
	    }

	    private static Equipo crearMiamiHeat12_13() {

	        Tecnico tecnico = new Tecnico("Erik", "Spoelstra", 42);
	        List<Jugador> jugadoresMiamiHeat12_13 = new ArrayList<>();
	        jugadoresMiamiHeat12_13.add(new Jugador("LeBron", "James", Posicion.AL, 28, 6, 203));
	        jugadoresMiamiHeat12_13.add(new Jugador("Dwyane", "Wade", Posicion.EX, 31, 3, 193));
	        jugadoresMiamiHeat12_13.add(new Jugador("Chris", "Bosh", Posicion.AP, 29, 1, 211));
	        jugadoresMiamiHeat12_13.add(new Jugador("Ray", "Allen", Posicion.EX, 37, 34, 196));
	        jugadoresMiamiHeat12_13.add(new Jugador("Mario", "Chalmers", Posicion.BA, 26, 15, 188));

	        return new Equipo("Miami Heat 12_13",tecnico, jugadoresMiamiHeat12_13);
	    }

	    public static void informacionBasicaDeLaLiga() {
	    	System.out.printf("Los equipos que actualmente forman esta liga son:\n"
	    			+ "-%s\n"
	    			+ "-%s\n"
	    			+ "-%s\n"
	    			+ "-%s\n"
	    			+ "\n",
	    			chicagoBulls95_96.getNombre(),lakers80_81.getNombre(),
	    			miamiHeat12_13.getNombre(),spurs00_01.getNombre());
	    }

	    public static void informacionDetalladaDeCadaEquipo() {
	    	listaDeEquipos.forEach(System.out::println);
	    }
	
	    public static Equipo informacionDetalladaDeUnEquipoPorSuNombre(String nombreEquipo) throws EquipoNoEncontradoException {
	    	return listaDeEquipos.stream()
			    				.filter(e->e.getNombre().equalsIgnoreCase(nombreEquipo))
			    				.findFirst()
			    				.orElseThrow(()-> new EquipoNoEncontradoException("El nombre de equipo introducido no coincide con ninguno"));
	    }

	    public static Optional<Equipo> informacionDetalladaDeUnEquipoPorSuTecnico(String nombreEntrenador, String apellidoEntrenador) throws TecnicoNoEncontradoException{
	    	Optional<Equipo>  optEquipo= listaDeEquipos.stream()
	    				.filter(e->e.getTecnico().getNombre().equalsIgnoreCase(nombreEntrenador))
	    				.filter(e->e.getTecnico().getApellido().equalsIgnoreCase(apellidoEntrenador))
	    				.findFirst();
	    	if(optEquipo.isEmpty()) throw new TecnicoNoEncontradoException("No se ha encontrado ningún técnico con ese nombre en la liga.");
	    	
	    	return optEquipo;
	    }
    
	    public static List<Jugador> obtenerTodosLosJugadores(){
	    	if(listaDeEquipos.isEmpty()) return new ArrayList<Jugador>();
	    	 
			return listaDeEquipos.stream()
			.flatMap(e->e.getListaDeJugadores().stream())
			.collect(Collectors.toList());
	    }
		
	    public static double mostrarEdadMediaJugadoresDeLaLiga() {
	    	return listaDeEquipos.stream()
						    	.flatMapToDouble(e->e.getListaDeJugadores().stream().mapToDouble(Jugador::getEdad))
						    	.average()
						    	.orElse(0); 	
	    }
	    
	    public static double mostrarEdadMediaJugadoresDeUnEquipo(String nombre) {
	    	return listaDeEquipos.stream()
			    				.filter(e->e.getNombre().equalsIgnoreCase(nombre))
			    				.flatMapToDouble(e->e.getListaDeJugadores().stream().mapToDouble(Jugador::getEdad))
			    				.average()
			    				.orElse(0);   	
	    }

	    public static List<Jugador> mostrarJugadoresDeLaLigaPorPosicion(Posicion posicion){
	    	return listaDeEquipos.stream()
	    				.flatMap(e->e.getListaDeJugadores().stream().filter(j->j.getPosicion()== posicion))
	    				.collect(Collectors.toList());
	    }
	    
	    public static int sumarPersonasActivasEnLaLiga() {
	    	int totalPersonas = 0;  		    	
	    	totalPersonas += listaDeEquipos.stream()
								    	.map(e->e.getTecnico())
								    	.count();
	    	totalPersonas += listaDeEquipos.stream()
    									.flatMap(e->e.getListaDeJugadores().stream())
    									.count();    	
	    	return totalPersonas;
	    }
	    
	    public static Optional<Jugador> jugadorDeMenorAltura() {
	    	return listaDeEquipos.stream()
	    						.flatMap(e->e.getListaDeJugadores().stream())
	    						.min(Comparator.comparing(Jugador::getAlturaEnCm));	    	
	    }
	    
	    public static Optional<Jugador> jugadorDeMayorAltura(){
	    	return listaDeEquipos.stream()
	    						.flatMap(e->e.getListaDeJugadores().stream())
	    						.max(Comparator.comparing(Jugador::getAlturaEnCm));
	    }

	    public static void imprimirJugadoresOrdenadosPorNombreConElApellidoEnPrimerLugarYEnMayusculas(){
	 		List<Jugador> listaOrdenadaYEnMayuscula = listaDeEquipos.stream()
																	.flatMap(e->e.getListaDeJugadores().stream())
																	.sorted(Comparator.comparing(Jugador::getNombre))
																	.collect(Collectors.toList());
	 		listaOrdenadaYEnMayuscula.forEach(j->System.out.printf("%s %s %d %d %s %d\n",
													j.getApellido().toUpperCase(),j.getNombre(),j.getEdad(),
													j.getAlturaEnCm(),j.getPosicion(),j.getDorsal()));
	    }

	    public static void imprimirJugadoresPorDorsalOrdenadosPorAlturaDescendente(int dorsal) {
	    	List<Jugador> jugadoresPorDorsal = listaDeEquipos.stream()
										    				.flatMap(e->e.getListaDeJugadores().stream())
										    				.filter(j->j.getDorsal() == dorsal)
										    				.sorted(Comparator.comparing(Jugador::getAlturaEnCm).reversed())
										    				.collect(Collectors.toList());
	    	if(jugadoresPorDorsal.isEmpty()) {
	    		System.out.println("No se han encontrado jugadores por el dorsal seleccionado.");
	    	}else {
	    		jugadoresPorDorsal.forEach(j->System.out.printf("%s %s %d %d %s %d\n",
													j.getApellido(),j.getNombre(),j.getEdad(),
													j.getAlturaEnCm(),j.getPosicion(),j.getDorsal()));
	    	}				
	    }

	    public static void imprime5JugadoresAleatoriosDeLaLigaOrdenadosPorNombre() {

	    	List<Jugador> lista5JugadoresAleatorios = listaDeEquipos.stream()
												    				.flatMap(e->e.getListaDeJugadores().stream())
												    				.sorted(Comparator.comparingDouble(j->Math.random()))
												    				.limit(5)
												    				.sorted(Comparator.comparing(Jugador::getNombre))
												    				.collect(Collectors.toList());
	    	if (lista5JugadoresAleatorios.isEmpty()) {
				System.out.println("No hay jugadores para mostrar");
			}else {
				lista5JugadoresAleatorios.forEach(System.out::println);
			}
	    }

}
