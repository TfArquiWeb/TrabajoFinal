package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.entity.solicitudempleo;
import pe.edu.upc.serviceimpl.SolicitudEmpleoImpl;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitudempleo")
public class SolicitudEmpleoController {

    @Autowired
    private SolicitudEmpleoImpl SE;

    @PostMapping
    public void registrar(@RequestBody solicitudempleo se) {
        SE.insert(se);
    }

    @GetMapping
    public List<solicitudempleo> listar() {
        return SE.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id) {
        SE.delet(id);
    }

    @PutMapping
    public void modificar(@RequestBody solicitudempleo se) {SE.insert(se);}

    @PostMapping("/buscadorsoli")
    public List<solicitudempleo> Buscador(@RequestBody solicitudempleo se) throws ParseException {
        return SE.Buscarestado(se.getEstadoSE());
    }

    @GetMapping("/{id}")
    public Optional<solicitudempleo> listarId(@PathVariable("id")Integer id){
        return SE.listarId(id);
    }

    @GetMapping("/ordenarsoli")
    public List<solicitudempleo> Ordenardec() throws ParseException{
        return SE.Ordenardesc();
    }


}
