package Rrepositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{

}
