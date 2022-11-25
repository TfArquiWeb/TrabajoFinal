package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.curriculum;
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
    public void registrar(@RequestBody curriculum c) {
        cService.insert(c);
    }
    @PutMapping
    public void modificar(@RequestBody curriculum c) {
        cService.insert(c);
    }
    @GetMapping
    public List<curriculum> listar() { return cService.list();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cService.delete(id);
    }

    @PostMapping("/buscardesccapacitacion")
    public List<curriculum> BuscardescCapacitacion(@RequestBody String c) throws ParseException {
        return cService.searchdescCapacitacion(c);
    }
    @PostMapping("/buscardescexperiencia")
    public List<curriculum> BuscardescExperiencia(@RequestBody String c ) throws ParseException{
        return cService.searchdescExperiencia(c);
    }
    @PostMapping("/buscardeschabilidad")
    public List<curriculum> BuscardescHabilidad(@RequestBody String c) throws ParseException {
        return cService.searchdescHabilidad(c);
    }

    @PostMapping("/buscarcapacitacion")
    public List<curriculum> BuscarCapacitacion(@RequestBody String c) throws ParseException {
        return cService.searchCapacitacion(c);
    }
    @PostMapping("/buscarexperiencia")
    public List<curriculum> BuscarExperiencia(@RequestBody String c ) throws ParseException{
        return cService.searchExperiencia(c);
    }
    @PostMapping("/buscarhabilidad")
    public List<curriculum> BuscarHabilidad(@RequestBody String c) throws ParseException {
        return cService.searchHabilidad(c);
    }
    @GetMapping("/ordenardesc")
    public List<curriculum> ordenarDesc() throws ParseException {
        return cService.ordenarDesc();
    }
    @GetMapping("/{id}")
    public Optional<curriculum> listarId(@PathVariable("id") Integer id) { return cService.listarId(id);}
    @GetMapping("/cantidad")
    public List<respuestaCu> cantidadCurriculum() throws ParseException {
        return cService.cantidadCurriculum();
    }
}