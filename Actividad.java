package main;

import java.time.LocalDateTime;

public class Actividad extends Plan {
	private String descipcion;
	private String lugar;
	
	public Actividad(LocalDateTime hora_inicio, LocalDateTime hora_fin, String descipcion, String lugar) {
		super(hora_inicio, hora_fin);
		this.descipcion = descipcion;
		this.lugar = lugar;
	}

	public String getDescipcion() {
		return descipcion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
}
