package main;

import java.time.LocalDateTime;

public class ReservaHotel extends Plan {
	private String nombre;
	private int codigo_reserva;
	private int nro_habitacion;

	public ReservaHotel(LocalDateTime hora_inicio, LocalDateTime hora_fin, String nombre, int codigo_reserva, int nro_habitacion) {
		super(hora_inicio, hora_fin);
		this.nombre = nombre;
		this.codigo_reserva = codigo_reserva;
		this.nro_habitacion = nro_habitacion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCodigo_reserva() {
		return codigo_reserva;
	}

	public int getNro_habitacion() {
		return nro_habitacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCodigo_reserva(int codigo_reserva) {
		this.codigo_reserva = codigo_reserva;
	}

	public void setNro_habitacion(int nro_habitacion) {
		this.nro_habitacion = nro_habitacion;
	}
}
