package main;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vuelo extends Plan {
	private int nro_vuelo;
	private String compania;
	private String aeronave;
	private Aeropuerto origen;
	private Aeropuerto destino;
	private int codigo_reserva;
	ArrayList<Escala> escalas;

	public Vuelo(LocalDateTime hora_inicio, LocalDateTime hora_fin, int nro_vuelo, String compania, String aeronave, Aeropuerto origen,
			Aeropuerto destino, int codigo_reserva) {
		super(hora_inicio, hora_fin);
		this.nro_vuelo = nro_vuelo;
		this.compania = compania;
		this.aeronave = aeronave;
		this.origen = origen;
		this.destino = destino;
		this.codigo_reserva = codigo_reserva;
		this.escalas = new ArrayList<Escala>();
	}

	public int getNro_vuelo() {
		return nro_vuelo;
	}

	public String getCompania() {
		return compania;
	}

	public String getAeronave() {
		return aeronave;
	}

	public Aeropuerto getOrigen() {
		return origen;
	}

	public Aeropuerto getDestino() {
		return destino;
	}

	public int getCodigo_reserva() {
		return codigo_reserva;
	}

	public void setNro_vuelo(int nro_vuelo) {
		this.nro_vuelo = nro_vuelo;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public void setAeronave(String aeronave) {
		this.aeronave = aeronave;
	}

	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}

	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}

	public void setCodigo_reserva(int codigo_reserva) {
		this.codigo_reserva = codigo_reserva;
	}

	public void addEscala(Escala escala) {
		if (!escalas.contains(escala))
			escalas.add(escala);
	}
	
	int tiempoEscalas() {
		return 0;
	}
}
