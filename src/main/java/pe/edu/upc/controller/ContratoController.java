package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.Contrato;
import pe.edu.upc.serviceinterfeaces.IContratoInterfaces;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Contrato")
public class ContratoController {
    @Autowired
    private IContratoInterfaces cService;
    @PostMapping
    public void registrar(@RequestBody Contrato c){
        cService.insertar(c);
    }
    @PutMapping
    public void modificar(@RequestBody Contrato c){
        cService.insertar(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cService.eliminar(id);
    }
    @GetMapping
    public List<Contrato> listar(){
        return cService.listar();
    }
    /*@PostMapping("/buscar")
    public List<Contrato> buscar(@RequestBody Contrato c) throws ParseException{
        return null;
    }*/
    @GetMapping("/{id}")
    public Optional<Contrato> listarId(@PathVariable("id") Integer id){
        return cService.listarId(id);
    }
}