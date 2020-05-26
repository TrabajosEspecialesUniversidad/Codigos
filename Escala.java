package main;

import java.time.LocalDateTime;

public class Escala {
	private LocalDateTime llegada;
	private LocalDateTime salida;
	private Aeropuerto ubicacion;
	
	public Escala(LocalDateTime llegada, LocalDateTime salida, Aeropuerto ubicacion) {
		this.llegada = llegada;
		this.salida = salida;
		this.ubicacion = ubicacion;
	}
	
	public LocalDateTime getLlegada() {
		return llegada;
	}
	
	public LocalDateTime getSalida() {
		return salida;
	}
	
	public Aeropuerto getUbicacion() {
		return ubicacion;
	}
	
	public void setLlegada(LocalDateTime llegada) {
		this.llegada = llegada;
	}
	
	public void setSalida(LocalDateTime salida) {
		this.salida = salida;
	}
	
	public void setUbicacion(Aeropuerto ubicacion) {
		this.ubicacion = ubicacion;
	}
}
