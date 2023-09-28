package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Medicamento;

public interface IMedicRepositorio extends JpaRepository<Medicamento, Integer>{

}
