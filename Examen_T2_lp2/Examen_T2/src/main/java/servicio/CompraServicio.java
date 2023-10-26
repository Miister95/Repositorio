package servicio;

import java.util.List;

import modelo.Compra;

public interface CompraServicio {
	List<Compra> getAll();
	Compra getbyId(Integer id);
	void saveCompra(Compra compra);
}
