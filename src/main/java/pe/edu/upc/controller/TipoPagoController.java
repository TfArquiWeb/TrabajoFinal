package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.tipopago;
import pe.edu.upc.serviceimpl.TipoPagoImpl;

@RestController
@RequestMapping("/TipoPago")
public class TipoPagoController {
	@Autowired
	private TipoPagoImpl tpService;
	@PostMapping
	public void registrar(@RequestBody tipopago tp) {
		tpService.insert(tp);
	}

	@GetMapping
	public List<tipopago> listar() {
		return tpService.list();
	}
}
