package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Rrepositorio.ClienteRepositorio;
import modelo.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepositorio clienteRepos;

	public List<Cliente> getClientes() {		
		return clienteRepos.findAll();
	}

	public Cliente getById(Integer id) {
		return clienteRepos.findById(id).orElse(null);
	}

	public void saveCliente(Cliente cliente) {
		clienteRepos.save(cliente);
		
	}
}
