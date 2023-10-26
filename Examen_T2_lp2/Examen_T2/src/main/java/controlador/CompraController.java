package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import modelo.Compra;
import servicio.CompraServicio;

@Controller
public class CompraController {
	@Autowired
	private CompraServicio compraService;
	
	@GetMapping("vercarrito")
	public String verCarrito(Model model) {
		model.addAttribute("compras", compraService.getAll());
		return "carrito";
	}
	
	private double calculoTotalCompras(List<Compra> compras) {
		double tot = 0.0;
		for (Compra compra : compras) {
			tot += compra.getTotal();
		}
		return tot;
	}
	
	@GetMapping("/vercompras")
	public String verCompras(Model model) {
		List<Compra> com = compraService.getAll();
		double totalCom = calculoTotalCompras(com);
		model.addAttribute("compras", com);
		model.addAttribute("totalCom", totalCom);
		return "vercompras";
	}
}
