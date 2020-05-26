package main;

import java.time.LocalDateTime;

public class Plan {
	private LocalDateTime hora_inicio; // DIJE NO USAR LOCAL LocalDateTime
	private LocalDateTime hora_fin;
	
	public Plan(LocalDateTime hora_inicio, LocalDateTime hora_fin) {
		super();
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
	}

	public LocalDateTime getHora_inicio() {
		return hora_inicio;
	}

	public LocalDateTime getHora_fin() {
		return hora_fin;
	}

	public void setHora_inicio(LocalDateTime hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public void setHora_fin(LocalDateTime hora_fin) {
		this.hora_fin = hora_fin;
	}
	
//	@Override
//	public abstract boolean equals(Object plan);
}
