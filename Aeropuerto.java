package main;

import java.util.ArrayList;

public class Aeropuerto {
	private String nombre;
	private Ciudad ubicacion;
	private ArrayList<String> mostradores;
	
	public Aeropuerto(String nombre, Ciudad ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.mostradores = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public Ciudad getUbicacion() {
		return ubicacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setUbicacion(Ciudad ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void addMostrador(String mostrador) {
		if (!mostradores.contains(mostrador))
			mostradores.add(mostrador);
	}
}
