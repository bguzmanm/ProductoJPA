package cl.awakelab.productosjpa.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.productosjpa.model.Producto;

public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {
	
	List<Producto> findByNombre(String nombre);
	
}
