package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Carrito;

public interface CarritoRepositorio extends JpaRepository<Carrito, Integer>{
	
}
