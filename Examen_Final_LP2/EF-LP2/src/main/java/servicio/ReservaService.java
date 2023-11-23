package servicio;

import java.util.List;

import modelo.Reserva;

public interface ReservaService {
	List<Reserva> getReservas();
	Reserva getById(Integer id);
	void saveReserva(Reserva reserva);
}
