package main;

public class LinkVuelo extends Link {
	private Vuelo vuelo_ida;
	private Vuelo vuelo_vuelta;
	
	public LinkVuelo(String email, String enlace, int codigo_reserva, Vuelo vuelo_ida, Vuelo vuelo_vuelta) {
		super(email, enlace, codigo_reserva);
		this.vuelo_ida = vuelo_ida;
		this.vuelo_vuelta = vuelo_vuelta;
	}

	public Vuelo getVuelo_ida() {
		return vuelo_ida;
	}
	
	public Vuelo getVuelo_vuelta() {
		return vuelo_vuelta;
	}
}
