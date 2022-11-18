package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.entity.Curriculum;
import pe.edu.upc.entity.contador;
import pe.edu.upc.serviceinterfeaces.ICurriculumService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Curriculum")
public class CurriculumController {
    @Autowired
    private ICurriculumService cService;

    @PostMapping
    public void registrar(@RequestBody Curriculum c) {
        cService.insert(c);
    }
    @PutMapping
    public void modificar(@RequestBody Curriculum c) {
        cService.insert(c);
    }
    @GetMapping
    public List<Curriculum> listar() { return cService.list();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cService.delete(id);
    }

    @PostMapping("/buscarCapacitacion")
    public List<Curriculum> buscarCapacitacion(@RequestBody Curriculum c) throws ParseException {
        return cService.buscarExperiencia(c.getCapacitacion().getDescCapacitacion());
    }

    @PostMapping("/buscarExperiencia")
    public List<Curriculum> buscarExperiencia(@RequestBody Curriculum c ) throws ParseException{
        return cService.buscarExperiencia(c.getExperiencia().getDescExperiencia());
    }

    @PostMapping("/buscarHabilidad")
    public List<Curriculum> buscarHabilidad(@RequestBody Curriculum c) throws ParseException {
        return cService.buscarHabilidad(c.getHabilidad().getDescHabilidad());
    }

    @GetMapping("/{id}")
    public Optional<Curriculum> listarId(@PathVariable("id") Integer id) { return cService.listarId(id);}
}