package servicio;

import java.util.List;

import modelo.Habitacion;

public interface HabitacionService {
	List<Habitacion> getHabitaciones();
	Habitacion getById(Integer id);
	void saveHabitacion(Habitacion habitacion);
}
