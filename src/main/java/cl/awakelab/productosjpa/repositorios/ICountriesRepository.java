package cl.awakelab.productosjpa.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.productosjpa.model.Countries;

public interface ICountriesRepository extends JpaRepository<Countries, Integer> {

}
