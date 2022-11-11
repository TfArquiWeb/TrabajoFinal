package pe.edu.upc.serviceinterfeaces;

import pe.edu.upc.entity.solicitudempleo;

import java.util.List;
import java.util.Optional;

public interface ISolicitudEmpleoInterfacaces {
    public boolean insert(solicitudempleo se);
    List<solicitudempleo> list();
    public void delet(int id);
    Optional<solicitudempleo> listarId(int id);
    List<solicitudempleo>Buscarestado(String estadoSE);

}
