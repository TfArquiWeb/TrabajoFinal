package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.contador;
import pe.edu.upc.serviceimpl.ContadorImpl;

@RestController
@RequestMapping("/Contador")
public class ContadorController {
	
	@Autowired
	private ContadorImpl cService;
	@PostMapping
    public void registrar(@RequestBody contador p) {
        cService.insert(p);
    }
    @GetMapping
    public List<contador> listar() {
        return cService.list();
    }
    @DeleteMapping("/{idcontador}")
    public void eliminar(@PathVariable("idcontador") Integer idcontador){
        cService.delet(idcontador);
    }
    @PutMapping
    public void modificar(@RequestBody contador c) {
        cService.insert(c);
    }
    @PostMapping("/buscardesc")
    public List<contador> Buscardesc(@RequestBody contador c ) {
        return cService.searchdesc(c.getDescContador());
    }
    @PostMapping("/buscarUsu")
    public List<contador> BuscarUsuario(@RequestBody contador c ) {
        return cService.searchUsu(c.getUsuario().getNombreUsuario());
    }
}
