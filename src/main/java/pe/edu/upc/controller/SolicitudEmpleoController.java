package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.solicitudempleo;
import pe.edu.upc.serviceimpl.SolicitudEmpleoImpl;

@RestController
@RequestMapping("/SolicitudEmpleo")
public class SolicitudEmpleoController {
	@Autowired
	private SolicitudEmpleoImpl sService;
	@PostMapping
	public void registrar(@RequestBody solicitudempleo s) {
		sService.insert(s);
	}

	@GetMapping
	public List<solicitudempleo> listar() {
		return sService.list();
	}
}
