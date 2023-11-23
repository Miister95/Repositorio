package controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import modelo.Habitacion;
import servicio.HabitacionService;

@Controller
public class ReservaController {
	private List<Habitacion> reserva = new ArrayList<>();
	
	@Autowired
	private HabitacionService habitacionService;
	
	@GetMapping("/addreserva")
	public String addreserva(@RequestParam("habitacionId") Integer habitacionId) {
		Habitacion habitacion = habitacionService.getById(habitacionId);
		reserva.add(habitacion);

		return "redirect:/catalogo";
	}
	
	@GetMapping("/reserva") /*Reserva se refiere a un tipo carrito de compra*/
	public String mostrarReserva(Model model) {
		model.addAttribute("habitacionesEnReserva", reserva);
		double montoTotal = reserva.stream().mapToDouble(Habitacion::getPrecio).sum();
		model.addAttribute("montoTotal", montoTotal);
		return "reserva";
	}
}
