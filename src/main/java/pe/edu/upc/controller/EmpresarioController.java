package pe.edu.upc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.empresario;
import pe.edu.upc.entity.respuestaEMP;
import pe.edu.upc.serviceimpl.EmpresarionImpl;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Empresario")
public class EmpresarioController {
    @Autowired
    private EmpresarionImpl eService;
    @PostMapping
    public void registrar(@RequestBody empresario p) {
        eService.insert(p);
    }
    @GetMapping
    public List<empresario> listar() {
        return eService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eService.delet(id);
    }
    @PutMapping
    public void modificar(@RequestBody empresario e) {
        eService.insert(e);
    }
    @PostMapping("/buscardesc")
    public List<empresario> Buscardesc(@RequestBody String c ) throws ParseException {
        return eService.searchdesc(c);
    }
    @PostMapping("/buscarusu")
    public List<empresario> BuscarUsuario(@RequestBody String c )throws ParseException {
        return eService.searchUsu(c);
    }
    @GetMapping("/ordenardesc")
    public List<empresario> ordenarDesc() throws ParseException {
        return eService.ordenarDesc();
    }
    @GetMapping("/{id}")
    public Optional<empresario> listarId(@PathVariable("id") Integer id) {
        return eService.listarId(id);
    }
    @GetMapping("/cantidad")
    public List<respuestaEMP> cantidadEmpresarios() throws ParseException {
        return eService.cantidadEmpresarios();
    }

}
