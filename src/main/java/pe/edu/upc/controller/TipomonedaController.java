package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.tipomoneda;
import pe.edu.upc.serviceimpl.TipomonedaImpl;

@RestController
@RequestMapping("/Tipomoneda")
public class TipomonedaController {
	@Autowired
    private TipomonedaImpl tmService;

    @PostMapping
    public void registrar(@RequestBody tipomoneda t) {
        tmService.insert(t);
    }
    @GetMapping
    public List<tipomoneda> listar() {
        return tmService.list();
    }
}
