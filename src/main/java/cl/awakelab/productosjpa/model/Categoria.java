package cl.awakelab.productosjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_categories")
public class Categoria {

	@Id
	@Column(name="category_id")
	private int id;
	
	@Column(name="category_name")
	private String nombre;
	

	public Categoria() {
		
	}


	public Categoria(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
