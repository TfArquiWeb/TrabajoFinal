package pe.edu.upc.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.entity.experiencia;
import pe.edu.upc.serviceimpl.ExperienciaImpl;
@RestController
@RequestMapping("/Experiencia")
public class ExperienciaController {
	 @Autowired
	 private ExperienciaImpl expService;

	 @PostMapping
	 public void registrar(@RequestBody experiencia e) {
			expService.insert(e);
	    }

		@GetMapping
		public List<experiencia> listar() {
	        return expService.list();
	    }
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		expService.eliminar(id);
	}
	@PutMapping
	public void modificar(@RequestBody experiencia e) {
		expService.insert(e);
	}
	@PostMapping("/buscar")
	public List<experiencia> buscar(@RequestBody experiencia e) {
		 return expService.buscardescExperiencia(e.getDescExperiencia());
	}
}
