package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.Curriculum;
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
        cService.insertar(c);
    }

    @PutMapping
    public void modificar(@RequestBody Curriculum c) {
        cService.insertar(c);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cService.eliminar(id);
    }

    @GetMapping
    public List<Curriculum> listar() { return cService.listar();}

    @PostMapping("/buscarCapacitacion")
    public List<Curriculum> buscarCapacitacion(@RequestBody Curriculum c) {
        return cService.buscarCapacitacion(c.getCapacitacion().getDescCapacitacion());
    }
    @PostMapping("/buscarHabilidad")
    public List<Curriculum> buscarHabilidad(@RequestBody Curriculum c) {
        return cService.buscarHabilidad(c.getHabilidad().getDescHabilidad());
    }
    @PostMapping("/buscarExperiencia")
    public List<Curriculum> buscarExperiencia(@RequestBody Curriculum c) {
        return cService.buscarExperiencia(c.getExperiencia().getDescExperiencia());
    }
}