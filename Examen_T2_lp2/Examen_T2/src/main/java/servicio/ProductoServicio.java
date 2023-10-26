package servicio;

import java.util.List;

import modelo.Producto;

public interface ProductoServicio {
	List<Producto> getAll();
	Producto getbyId(Integer id);
	void saveProducto(Producto producto);
}
