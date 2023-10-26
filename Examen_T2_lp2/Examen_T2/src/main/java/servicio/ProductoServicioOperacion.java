package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Producto;
import repositorio.ProductoRepositorio;

@Service
public class ProductoServicioOperacion implements ProductoServicio{
	
	@Autowired
	private ProductoRepositorio productoRepository;
	
	public List<Producto> getAll(){
		return productoRepository.findAll();
	}
	
	public Producto getbyId(Integer id) {
		return productoRepository.findById(id).orElse(null);
	}
	
	public void saveProducto(Producto producto) {
		productoRepository.save(producto);
	}
}
