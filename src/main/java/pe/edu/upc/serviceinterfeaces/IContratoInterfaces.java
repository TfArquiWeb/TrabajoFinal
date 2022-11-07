package pe.edu.upc.serviceinterfeaces;

import pe.edu.upc.entity.Contrato;

import java.util.List;
import java.util.Optional;

public interface IContratoInterfaces {
    public boolean insertar(Contrato contrato);

    public void eliminar(int idContrato);

    Optional<Contrato> listarId(int idContrato);

    List<Contrato> listar();

    List<Contrato> buscarnombreUsuario(String nombreUsuario);

    List<Contrato> buscarTipodeMoneda(String TipodeMoneda);

}
