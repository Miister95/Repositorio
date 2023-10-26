package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
	
}
