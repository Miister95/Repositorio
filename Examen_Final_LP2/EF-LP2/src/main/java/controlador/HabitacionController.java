package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import modelo.Habitacion;
import servicio.HabitacionService;

@Controller
public class HabitacionController {
	
	@Autowired
	private HabitacionService habitacionService;
	
	@GetMapping("/catalogo")
	public String mostrarCatalogo(Model model) {
		List<Habitacion> habitaciones = habitacionService.getHabitaciones();
		model.addAttribute("habitaciones", habitaciones);
		return "catalogo";
	}
	
	@PostMapping("/cofirmacion_reserva")
	public String reservarHabitacion(@RequestParam Integer habitacionId, Model model) {
	    Boolean habitaciones = true;
	    if (habitaciones.booleanValue() == habitaciones) {
	        return "redirect:/reserva/confirmacion_reserva";
	    } else {
	        model.addAttribute("error", "No se pudo completar la reserva. Inténtelo de nuevo.");
	        return "redirect:/catalogo";
	    }
	}
}
