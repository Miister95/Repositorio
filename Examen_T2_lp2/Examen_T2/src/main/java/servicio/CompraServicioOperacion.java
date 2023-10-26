package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Compra;
import repositorio.CompraRepositorio;

@Service
public class CompraServicioOperacion implements CompraServicio{
	
	@Autowired
	private CompraRepositorio compraRepository;
	
	public List<Compra> getAll() {
		return compraRepository.findAll();
	}

	public Compra getbyId(Integer id) {
		return compraRepository.findById(id).orElse(null);
	}

	public void saveCompra(Compra compra) {
		 compraRepository.save(compra);

	}
}
