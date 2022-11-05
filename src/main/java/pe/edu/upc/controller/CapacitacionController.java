package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.serviceimpl.CapacitacionServiceImpl;

import java.util.List;
@RestController
@RequestMapping("/Capacitacion")
public class CapacitacionController {
    @Autowired
    private CapacitacionServiceImpl cService;

    @PostMapping
    public void registrar(@RequestBody Capacitacion c) {
        cService.insert(c);
    }
    @GetMapping
    public List<Capacitacion> listar() {
        return cService.list();
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Capacitacion c) {
        cService.insert(c);
    }
    @PostMapping("/buscar")
    public List<Capacitacion> Buscar(@RequestBody Capacitacion c ) {
        return cService.search(c.getDescCapacitacion());
    }
}
