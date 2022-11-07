package pe.edu.upc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.entity.Contrato;
import pe.edu.upc.repository.IContratoRepository;
import pe.edu.upc.serviceinterfeaces.IContratoInterfaces;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public class ContratoImpl implements IContratoInterfaces {
    @Autowired
    private IContratoRepository dContrato;

    @Override
    @Transactional
    public boolean insertar(Contrato contrato){
        Contrato objContrato = dContrato.save(contrato);
        if(objContrato==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idContrato) {
        dContrato.deleteById(idContrato);
    }

    @Override
    public Optional<Contrato> listarId(int idContrato){
        return dContrato.findById(idContrato);
    }

    @Override
    public List<Contrato> listar(){
        return dContrato.findAll();
    }

    @Override
    public List<Contrato> buscarnombreUsuario(String nombreUsuario){
        return dContrato.buscarnombreUsuario(nombreUsuario);
    }

    public List<Contrato> buscarTipodeMoneda(String TipodeMoneda) {
        return dContrato.buscarTipodeMoneda(TipodeMoneda);
    }
}

