package controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import modelo.Carrito;
import modelo.Producto;
import repositorio.CarritoRepositorio;
import repositorio.ProductoRepositorio;
import servicio.ProductoServicio;

@Controller
public class CarritoController {
	
	private List<Producto> carrito = new ArrayList<>();

	@Autowired
	private ProductoServicio productoService;

	@PostMapping("/agregarcar")
	public String agregarCar(@RequestParam("productoId") Integer productoId) {
		Producto producto = productoService.getbyId(productoId);
		carrito.add(producto);
		return "redirect:/catalogo";
	}

	@GetMapping("/carrito")
	public String mostrarCarrito(Model model) {
		model.addAttribute("productsOnCar", carrito);
		double monto = carrito.stream().mapToDouble(Producto::getPrecio).sum();
		model.addAttribute("monto", monto);
		return "carrito";
	}
}
