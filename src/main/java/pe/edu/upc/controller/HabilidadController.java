package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.*;
import pe.edu.upc.serviceimpl.*;

@RestController
@RequestMapping("/Habilidad")
public class HabilidadController {
	@Autowired
    private HabilidadImpl hService;

    @PostMapping
    public void registrar(@RequestBody habilidad h) {
        hService.insert(h);
    }
    @GetMapping
    public List<habilidad> listar() {
        return hService.list();
    }
}
