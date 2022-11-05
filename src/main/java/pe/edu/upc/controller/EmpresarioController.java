package pe.edu.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresarios")
public class EmpresarioController {
    @Autowired
private IEmpresarioService empService;

    @PostMapping
    public void registrar(@RequestBody Vehiculo v) {
        vService.insertar(v);
    }

    @PutMapping
    public void modificar(@RequestBody Vehiculo v) {
        vService.insertar(v);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        vService.eliminar(id);
    }

    @GetMapping
    public List<Vehiculo> listar() {
        return vService.listar();

    }

    @PostMapping("/buscar")
    public List<Vehiculo> buscar(@RequestBody Vehiculo v) throws ParseException {

        List<Vehiculo> listaVehiculos;
        listaVehiculos = vService.buscarVehiculo(v.getLicensePlateVehiculo());
        if (listaVehiculos.isEmpty()) {

            listaVehiculos = vService.buscarPropietario(v.getPropietario().getNamePropietario());
        }
        return listaVehiculos;

    }
    @GetMapping("/{id}")
    public Optional<Vehiculo> listarId(@PathVariable("id") Integer id) {
        return vService.listarId(id);
    }
}