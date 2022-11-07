package pe.edu.upc.controller;

import java.security.Provider;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.entity.tipomoneda;
import pe.edu.upc.serviceinterfeaces.ITipomonedaInterfaces;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Tipomoneda")
public class TipomonedaController {
	@Autowired
    private ITipomonedaInterfaces tmService;

    @PostMapping
    public void registrar(@RequestBody tipomoneda t) {
        tmService.insert(t);
    }
    @GetMapping
    public List<tipomoneda> listar() {
        return tmService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tmService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody tipomoneda t) {
        tmService.insert(t);
    }

    @PostMapping("/buscar")
    public List<tipomoneda> buscar(@RequestBody tipomoneda t){
        return tmService.search(t.getTipodeMoneda());
    }
    @GetMapping("/{id}")
    public Optional<tipomoneda> listarId(@PathVariable("id") Integer id){
        return tmService.listarId(id);
    }
}
