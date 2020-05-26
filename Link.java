package main;

public class Link {
	private String email;
	private String enlace;
	private int codigo_reserva;
	
	public Link(String email, String enlace, int codigo_reserva) {
		this.email = email;
		this.enlace = enlace;
		this.codigo_reserva = codigo_reserva;
	}

	public String getEmail() {
		return email;
	}

	public String getEnlace() {
		return enlace;
	}

	public int getCodigo_reserva() {
		return codigo_reserva;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public void setCodigo_reserva(int codigo_reserva) {
		this.codigo_reserva = codigo_reserva;
	}
}
