package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Rrepositorio.HabitacionRepositorio;
import modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements HabitacionService {

	@Autowired
	private HabitacionRepositorio habitacionRepos;

	public List<Habitacion> getHabitaciones() {		
		return habitacionRepos.findAll();
	}

	public Habitacion getById(Integer id) {
		return habitacionRepos.findById(id).orElse(null);
	}

	public void saveHabitacion(Habitacion habitacion) {
		habitacionRepos.save(habitacion);
		
	}
	
	public Boolean reservaExitosa() {
		return ;
	}
}
