package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import modelo.Producto;
import repositorio.ProductoRepositorio;
import servicio.ProductoServicio;

@Controller
public class CatalogoController {
	
	@Autowired
	private ProductoServicio productoService;
	
	@GetMapping("/catalogo")
    public String verCatalogo(Model model) {
        model.addAttribute("productos", productoService.getAll());
        return "catalogo";
    }
}
