package main;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Viaje {
	private String nombre;
	private Ciudad ciudad_destino;
	private LocalDateTime fecha_inicio; // NO USAR LOCAL LocalDateTime
	private LocalDateTime fecha_fin;
	private String descripcion;
	private ArrayList<Plan> planes;
	
	public Viaje(String nombre, String descripcion, Vuelo vuelo_ida, Vuelo vuelo_vuelta) {
		this.nombre = nombre;
		this.ciudad_destino = vuelo_ida.getDestino().getUbicacion();
		this.fecha_inicio = vuelo_ida.getHora_inicio();
		this.fecha_fin = vuelo_vuelta.getHora_fin();
		this.descripcion = descripcion;
		
		this.planes = new ArrayList<Plan>();
		planes.add(vuelo_ida);
		planes.add(vuelo_vuelta);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getCiudad_destino() {
		return ciudad_destino;
	}

	public void setCiudad_destino(Ciudad ciudad_destino) {
		this.ciudad_destino = ciudad_destino;
	}

	public LocalDateTime getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(LocalDateTime fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public LocalDateTime getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(LocalDateTime fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void addPlan(Plan plan) {
		if (planes.contains(plan))
			planes.add(plan); // INSERTAR ORDENADO
	}
//	
//	public boolean realizado() {
//	}
}
