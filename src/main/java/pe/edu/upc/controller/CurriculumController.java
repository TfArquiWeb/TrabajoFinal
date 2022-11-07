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

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cService.eliminar(id);
    }

    @GetMapping
    public List<Curriculum> listar() {
        return cService.listar();

    }

    @PostMapping("/buscar")
    public List<Curriculum> buscarCapacitacion(@RequestBody Curriculum c) throws ParseException {

        List<Curriculum> listaCapacitacion;
        listaCapacitacion = cService.buscarCapacitacion(c.getCapacitacion().getDescCapacitacion());
        if (listaCapacitacion.isEmpty()) {

            listaCapacitacion = cService.buscarExperiencia(c.getExperiencia().getDescExperiencia());
        }
        return listaCapacitacion;

    }
    @GetMapping("/{id}")
    public Optional<Curriculum> listarId(@PathVariable("id") Integer id) {
        return cService.listarId(id);
    }
}