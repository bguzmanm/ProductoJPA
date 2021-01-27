package cl.awakelab.productosjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Countries {

	@Id
	private int country_id;
	private String country_name;
	private int region_id;
	
	public Countries() {
		
	}
	
	public Countries(int country_id, String country_name, int region_id) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.region_id = region_id;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	
	
	
}
