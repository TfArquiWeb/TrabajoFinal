package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.curriculumvitae;
import pe.edu.upc.serviceimpl.CurriculumVitaeImpl;
@RestController
@RequestMapping("/CurriculumVitae")
public class CurriculumVitaeController {
	@Autowired
	private CurriculumVitaeImpl cvService;
	@PostMapping
	public void registrar(@RequestBody curriculumvitae cv) {
		cvService.insert(cv);
	}

	@GetMapping
	public List<curriculumvitae> listar() {
		return cvService.list();
	}
}
