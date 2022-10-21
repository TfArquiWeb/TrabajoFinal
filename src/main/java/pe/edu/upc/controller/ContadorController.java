package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.contador;
import pe.edu.upc.serviceimpl.ContadorImpl;
@RestController
@RequestMapping("/Contador")
public class ContadorController {
	@Autowired
	private ContadorImpl coService;
	@PostMapping
	public void registrar(@RequestBody contador co) {
		coService.insert(co);
	}

	@GetMapping
	public List<contador> listar() {
		return coService.list();
	}
}
