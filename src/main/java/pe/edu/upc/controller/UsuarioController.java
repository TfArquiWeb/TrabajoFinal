package pe.edu.upc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uService.delet(id);
    }
    @PutMapping
    public void modificar(@RequestBody usuario u) {
        uService.insert(u);
    }
    @PostMapping("/buscar")
    public List<usuario> Buscar(@RequestBody usuario u ) {
        return uService.search(u.getNombreUsuario());
    }
    @GetMapping("/{id}")
    public Optional<usuario> listarId(@PathVariable("id") Integer id) {
        return uService.listarId(id);
    }
}