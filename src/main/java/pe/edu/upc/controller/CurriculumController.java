package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.entity.Curriculum;
import pe.edu.upc.entity.respuestaCu;
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

    @PostMapping("/buscardesccapacitacion")
    public List<Curriculum> BuscardescCapacitacion(@RequestBody String c) throws ParseException {
        return cService.searchdescCapacitacion(c);
    }
    @PostMapping("/buscardescexperiencia")
    public List<Curriculum> BuscardescExperiencia(@RequestBody String c ) throws ParseException{
        return cService.searchdescExperiencia(c);
    }
    @PostMapping("/buscardeschabilidad")
    public List<Curriculum> BuscardescHabilidad(@RequestBody String c) throws ParseException {
        return cService.searchdescHabilidad(c);
    }

    @PostMapping("/buscarcapacitacion")
    public List<Curriculum> BuscarCapacitacion(@RequestBody String c) throws ParseException {
        return cService.searchCapacitacion(c);
    }
    @PostMapping("/buscarexperiencia")
    public List<Curriculum> BuscarExperiencia(@RequestBody String c ) throws ParseException{
        return cService.searchExperiencia(c);
    }
    @PostMapping("/buscarhabilidad")
    public List<Curriculum> BuscarHabilidad(@RequestBody String c) throws ParseException {
        return cService.searchHabilidad(c);
    }
    @GetMapping("/ordenardesc")
    public List<Curriculum> ordenarDesc() throws ParseException {
        return cService.ordenarDesc();
    }
    @GetMapping("/{id}")
    public Optional<Curriculum> listarId(@PathVariable("id") Integer id) { return cService.listarId(id);}
    @GetMapping("/cantidad")
    public List<respuestaCu> cantidadCurriculum() throws ParseException {
        return cService.cantidadCurriculum();
    }
}