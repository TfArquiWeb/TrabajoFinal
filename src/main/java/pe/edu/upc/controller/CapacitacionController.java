package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.capacitacion;
import pe.edu.upc.serviceimpl.CapacitacionImpl;

@RestController
@RequestMapping("/Capacitacion")

public class CapacitacionController {

	@Autowired
	private CapacitacionImpl cService;
	
	@PostMapping
    public void registrar(@RequestBody capacitacion c) {
		cService.insert(c);
	}
	@GetMapping
	public List<capacitacion> listar(){
		return cService.list();
	}
}
