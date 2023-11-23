package Rrepositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Reserva;

public interface ReservaRepositorio extends JpaRepository<Reserva, Integer>{
	
}
