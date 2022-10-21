package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.empresario;
import pe.edu.upc.serviceimpl.EmpresarioImpl;

@RestController
@RequestMapping("/Empresario")
public class EmpresarioController {
	@Autowired
	private EmpresarioImpl eService;
	@PostMapping
	public void registrar(@RequestBody empresario e) {
		eService.insert(e);
	}

	@GetMapping
	public List<empresario> listar() {
		return eService.list();
	}
}
