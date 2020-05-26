package main;

public class LinkReservaHotel extends Link {
	private ReservaHotel reserva;

	public LinkReservaHotel(String email, String enlace, int codigo_reserva, ReservaHotel reserva) {
		super(email, enlace, codigo_reserva);
		this.reserva = reserva;
	}

	public ReservaHotel getReserva() {
		return reserva;
	}	
}
