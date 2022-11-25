package pe.edu.upc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.entity.empresario;
import pe.edu.upc.entity.respuestaEMP;
import pe.edu.upc.repository.IEmpresarioRepository;
import pe.edu.upc.serviceinterfeaces.IEmpresarioInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmpresarionImpl implements IEmpresarioInterfaces{
    @Autowired
    private IEmpresarioRepository eR;

    @Override
    @Transactional
    public boolean insert(empresario e) {
        // TODO Auto-generated method stub
        empresario objempresario = eR.save(e);
        if (objempresario==null) {
            return false;
        }else
        {
            return true;
        }
    }

    @Override
    public List<empresario> list() {
        // TODO Auto-generated method stub
        return eR.findAll();
    }

    @Override
    @Transactional
    public void delet(int id) {
        // TODO Auto-generated method stub
        eR.deleteById(id);
    }

    @Override
    public Optional<empresario> listarId(int id) {
        // TODO Auto-generated method stub
        return eR.findById(id);
    }


    @Override
    public List<empresario> searchdesc(String descContador) {
        // TODO Auto-generated method stub
        return eR.Buscardesc(descContador);
    }

    @Override
    public List<empresario> searchUsu(String nombreUsuario) {
        // TODO Auto-generated method stub
        return eR.BuscarUsuario(nombreUsuario);
    }

    @Override
    public List<empresario> ordenarDesc() {
        // TODO Auto-generated method stub
        return eR.ordenarDesc();
    }

    @Override
    public List<respuestaEMP> cantidadEmpresarios() {
        List<respuestaEMP>lista=new ArrayList<>();
        eR.cantidadEmpresarios().forEach(y->{
                    respuestaEMP r=new respuestaEMP();
                    r.setUsuario(y[0]);
                    r.setCantidad(y[1]);
                    lista.add(r);
                }
        );
        // TODO Auto-generated method stub
        return lista;
    }

}