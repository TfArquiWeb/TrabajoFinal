package pe.edu.upc.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping
    public void modificar(@RequestBody habilidad h) {
        hService.insert(h);
    }
    @GetMapping
    public List<habilidad> listar() {
        return hService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {hService.delete(id);}

    @PostMapping("/buscar")
    public List<habilidad> buscar(@RequestBody String descExperiencia ) throws ParseException {
        List<habilidad> listaHabilidad;
        listaHabilidad =hService.buscardescHabilidad(descExperiencia);
        return listaHabilidad;
    }
    @GetMapping("/{id}")
    public Optional<habilidad> listarId(@PathVariable("id") Integer id) { return hService.listarId(id);}
}
