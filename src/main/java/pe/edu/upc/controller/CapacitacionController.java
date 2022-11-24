package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.serviceimpl.CapacitacionServiceImpl;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Capacitacion")
public class CapacitacionController {
    @Autowired
    private CapacitacionServiceImpl cService;

    @PostMapping
    public void registrar(@RequestBody Capacitacion c) {
        cService.insert(c);
    }
    @PutMapping
    public void modificar(@RequestBody Capacitacion c) {
        cService.insert(c);
    }
    @GetMapping
    public List<Capacitacion> listar() {
        return cService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Capacitacion> buscar(@RequestBody String descCapacitacion ) throws ParseException {
        List<Capacitacion> listaCapacitacion;
        listaCapacitacion =cService.buscardescCapacitacion(descCapacitacion);
       return listaCapacitacion;
    }
    @GetMapping("/{id}")
    public Optional<Capacitacion> listarId(@PathVariable("id") Integer id) { return cService.listarId(id);}
}