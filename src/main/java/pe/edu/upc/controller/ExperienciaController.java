package pe.edu.upc.controller;

import java.util.List;

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
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		expService.delete(id);
	}
	@PutMapping
	public void modificar(@RequestBody experiencia e) {
		expService.insert(e);
	}
	@PostMapping("/buscar")
	public List<experiencia> Buscar(@RequestBody experiencia e ) {
		return expService.search(e.getDescExperiencia());
	}
}
