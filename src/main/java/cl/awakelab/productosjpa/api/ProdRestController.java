package cl.awakelab.productosjpa.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.productosjpa.model.Producto;
import cl.awakelab.productosjpa.repositorios.IProductoRepositorio;

@RestController
public class ProdRestController {

	@Autowired
	private IProductoRepositorio prodRepo;
	
	@RequestMapping(value="/api/getProductos", headers = "Accept=application/json")
	public List<Producto> getProductos(){
		
		List<Producto> productos = prodRepo.findAll();
		
		return productos;
	}
	
	@RequestMapping(value="/api/getProducto/{id}", headers = "Accept=application/json")
	public Producto getProducto(@PathVariable("id") int id) {
		
		Producto p = prodRepo.findById(id).get();
		return p;
		
	}
	
}
