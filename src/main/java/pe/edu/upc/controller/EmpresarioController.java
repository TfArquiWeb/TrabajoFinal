package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.Empresario;
import pe.edu.upc.serviceinterfeaces.IEmpresarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresario")
public class EmpresarioController {
    @Autowired
    private IEmpresarioService empService;

    @PostMapping
    public void registrar(@RequestBody Empresario emp) {empService.insertar(emp);
    }

    @PutMapping
    public void modificar(@RequestBody Empresario emp) {
        empService.insertar(emp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer ide) {
        empService.eliminar(ide);
    }

    @GetMapping
    public List<Empresario> listar() {
        return empService.listar();

    }

    @PostMapping("/buscar")
    public List<Empresario> buscar(@RequestBody Empresario emp) throws ParseException {

        List<Empresario> listaEmpresarios;
        listaEmpresarios = empService.buscarEmpresario(emp.getRazonEmpresario());
        if (listaEmpresarios.isEmpty()) {

            listaEmpresarios = empService.buscarEmpresario(emp.getUsuario().getNombreUsuario());
        }
        return listaEmpresarios;

    }
    @GetMapping("/{id}")
    public Optional<Empresario> listarId(@PathVariable("id") Integer ide) {
        return empService.listarId(ide);
    }
}