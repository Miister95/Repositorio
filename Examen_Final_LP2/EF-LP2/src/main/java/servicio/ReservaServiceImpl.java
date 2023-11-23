package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Rrepositorio.ReservaRepositorio;
import modelo.Reserva;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepositorio reservaRepos;

	public List<Reserva> getReservas() {		
		return reservaRepos.findAll();
	}

	public Reserva getById(Integer id) {
		return reservaRepos.findById(id).orElse(null);
	}

	public void saveReserva(Reserva reserva) {
		reservaRepos.save(reserva);
		
	}

}
