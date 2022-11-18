package pe.edu.upc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.entity.solicitudempleo;
import pe.edu.upc.repository.ISolicitudEmpleoRepository;
import pe.edu.upc.serviceinterfeaces.ISolicitudEmpleoInterfacaces;


import java.util.List;
import java.util.Optional;

@RestController
public class SolicitudEmpleoImpl implements ISolicitudEmpleoInterfacaces {

    @Autowired
    private ISolicitudEmpleoRepository SE;

    @Override
    @Transactional
    public boolean insert(solicitudempleo se) {
        solicitudempleo objSE =  SE.save(se);
        if (objSE == null) {
            return false;
        }else
        return true;
    }

    @Override
    public List<solicitudempleo> list() {
        return SE.findAll();
    }

    @Override
    @Transactional
    public void delet(int id) {
        SE.deleteById(id);
    }

    @Override
    public Optional<solicitudempleo> listarId(int id) {
        return SE.findById(id);
    }

    @Override
    public List<solicitudempleo> Buscarestado(String estadoSE) {
        return SE.Buscarestado(estadoSE);
    }

    @Override
    public List<solicitudempleo> Ordenardesc() {
        return SE.Ordenardesc();
    }
}
