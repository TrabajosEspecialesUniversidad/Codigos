package main;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		LocalDateTime fecha_nacimiento = LocalDateTime.of(-30, 2, 1, 0, 0, 0);
		Usuario frankito = new Usuario("Franco", "tuhermanaentanga@gmail.com", 1, fecha_nacimiento);
		
		Ciudad ciudad_origen = new Ciudad("Tandil", "Buenos Aires", "Argentina");
		Ciudad ciudad_destino = new Ciudad("Lima", "NO", "Peru");
		Aeropuerto aeropuerto_origen = new Aeropuerto("Ezeiza", ciudad_origen);
		Aeropuerto aeropuerto_destino = new Aeropuerto("Peruano", ciudad_destino);
		
		LocalDateTime fecha_inicio = LocalDateTime.of(120, 2, 1, 0, 0, 0);
		LocalDateTime fecha_fin = LocalDateTime.of(120, 11, 31, 23, 59, 59);
		
		Vuelo vuelo_ida = new Vuelo(fecha_inicio, fecha_fin, 1, "Palomas", "NOSE", aeropuerto_origen, aeropuerto_destino, 0);
		Vuelo vuelo_vuelta = new Vuelo(fecha_fin, fecha_inicio, 2, "No Palomas", "NOSE", aeropuerto_destino, aeropuerto_origen, 1);
		
		Viaje viaje1 = new Viaje("Peru", "Muchas palomas comestibles", vuelo_ida, vuelo_vuelta);
	
		frankito.crearViaje(viaje1);
	}

}
