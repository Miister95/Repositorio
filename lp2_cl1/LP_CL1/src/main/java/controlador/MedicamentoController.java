package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import modelo.Medicamento;
import repositorio.IMedicRepositorio;

@Controller
@RequestMapping("/medicamentos")
public class MedicamentoController {
	@Autowired
	private IMedicRepositorio medicRepositorio;
	
	@GetMapping("/")
	public String listadoMedicamentos(Model model) {
		List<Medicamento> medicamentos = medicRepositorio.findAll();;
		model.addAttribute("medicamentos", medicamentos);
		return "listarmedicamentos";
	}
	
	@GetMapping("/nuevo")
	public String nuevoMedicamento(Model model) {
		model.addAttribute("medicamento", new Medicamento());
		return "nuevo";
	}
	
	@PostMapping("/guardar")
	public String guardarmedicamento(@ModelAttribute Medicamento medic) {
		medicRepositorio.save(medic);
		return "redirect:/medicamentos/";
	}
}
