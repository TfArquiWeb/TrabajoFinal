package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.usuario;
import pe.edu.upc.serviceimpl.UsuarioImpl;
@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
	@Autowired
    private UsuarioImpl uService;

    @PostMapping
    public void registrar(@RequestBody usuario p) {
        uService.insert(p);
    }
    @GetMapping
    public List<usuario> listar() {
        return uService.list();
    }
}
