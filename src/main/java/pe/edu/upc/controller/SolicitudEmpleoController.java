package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.entity.solicitudempleo;
import pe.edu.upc.serviceimpl.SolicitudEmpleoImpl;

@RestController
@RequestMapping("/solicitudempleo")
public class SolicitudEmpleoController {

    @Autowired
    private SolicitudEmpleoImpl SE;

    @PostMapping
    public void registrar(@RequestBody solicitudempleo se) {
        SE.insert(se);
    }



}
