package cl.awakelab.productosjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.productosjpa.model.Countries;
import cl.awakelab.productosjpa.model.Producto;

import cl.awakelab.productosjpa.repositorios.ICountriesRepository;
import cl.awakelab.productosjpa.repositorios.IProductoRepositorio;

@Controller
public class InicioController {
	
	@Autowired
	private IProductoRepositorio productoRepositorio;
	
	private ICountriesRepository countriesRepo;

	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String inicio(Model model) {
		
		List<Producto> lista = productoRepositorio.findAll();
		
		model.addAttribute("lista", lista);
		
		return "home";
	}
	
	@RequestMapping(value="/pais", method=RequestMethod.GET)
	public String paises(Model model) {
		List<Countries> countriesList = countriesRepo.findAll();
		
		model.addAttribute("countriesList", countriesList);
		
		return "paises";
	}
	
	
}
