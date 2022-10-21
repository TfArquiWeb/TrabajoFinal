package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
