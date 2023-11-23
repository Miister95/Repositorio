package servicio;

import java.util.List;

import modelo.Cliente;

public interface ClienteService {
	List<Cliente> getClientes();
	Cliente getById(Integer id);
	void saveCliente(Cliente cliente);
}
