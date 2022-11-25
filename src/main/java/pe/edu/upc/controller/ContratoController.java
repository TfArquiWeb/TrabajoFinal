package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.Contrato;
import pe.edu.upc.serviceimpl.ContratoImpl;
import pe.edu.upc.serviceinterfeaces.IContratoInterfaces;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Contrato")
public class ContratoController {
    @Autowired
    private ContratoImpl cService;
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
    @PostMapping("/buscarUsuario")
    public List<Contrato> BuscarUsuario(@RequestBody String c) throws ParseException {
        return cService.BuscarUsuario(c);
    }
    @PostMapping("/buscarTipomoneda")
    public List<Contrato> findByTipodeMoneda(@RequestBody String c) throws ParseException {
        return cService.findByTipodeMoneda(c);
    }
    @PostMapping("/buscarTipopago")
    public List<Contrato> findByTipopago(@RequestBody String c) throws ParseException {
        return cService.findByTipopago(c);
    }
    @GetMapping("/{id}")
    public Optional<Contrato> listarId(@PathVariable("id") Integer id){
        return cService.listarId(id);
    }
}