package cl.awakelab.productosjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="products")
public class Producto {

	@Id
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String nombre;
	
	@Column(name="description")
	private String descripcion;
	
	@Column(name="standard_cost")
	private double costo;
	
	@Column(name="list_price")
	private double precio;
	
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Categoria categoria;
	

	public Producto() {
		
	}
	
	public Producto(int id, String nombre, String descripcion, double costo, double precio, Categoria categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costo = costo;
		this.precio = precio;
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
