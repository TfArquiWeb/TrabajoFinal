package pe.edu.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.entity.tipomoneda;
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
	public List<tipopago> listar() { return tpService.list(); }

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		tpService.delete(id);
	}
	@PutMapping
	public void modificar(@RequestBody tipopago tp) {
		tpService.insert(tp);
	}

	@PostMapping("/buscar")
	public List<tipopago> buscar(@RequestBody tipopago tp){
		return tpService.search(tp.getTipopago());
	}

}
