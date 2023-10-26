package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Compra;

public interface CompraRepositorio extends JpaRepository<Compra, Integer>{
	
}
