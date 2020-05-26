package main;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private String distrito;
	private String pais;
	private ArrayList<Aeropuerto> aeropuertos;
	
	public Ciudad(String nombre, String distrito, String pais) {
		this.nombre = nombre;
		this.distrito = distrito;
		this.pais = pais;
		this.aeropuertos = new ArrayList<Aeropuerto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDistrito() {
		return distrito;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void addAeropuerto(Aeropuerto aeropuerto) {
		if (!aeropuertos.contains(aeropuerto))
			aeropuertos.add(aeropuerto);
	}	
}
