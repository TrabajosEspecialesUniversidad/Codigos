package main;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String correo;
	private int dni;
	private ArrayList<Viaje> viajes;
	private LocalDateTime fecha_nacimiento;
	
	public Usuario(String nombre, String correo, int dni, LocalDateTime fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.dni = dni;
		this.viajes = new ArrayList<Viaje>();
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public int getDni() {
		return dni;
	}

	public LocalDateTime getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setFecha_nacimiento(LocalDateTime fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public void crearViaje(Viaje viaje) {
		if (!viajes.contains(viaje))
			viajes.add(viaje);
	}
	
//	public void crearViaje(Link link);
}
