package pe.edu.upc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.entity.Empresario;
import pe.edu.upc.repository.IEmpresarioRepository;
import pe.edu.upc.serviceinterfeaces.IEmpresarioService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresarioServiceImpl implements IEmpresarioService {
    @Autowired
    private IEmpresarioRepository dEmpresario;

    @Override
    @Transactional
    public boolean insertar(Empresario empresario) {
        Empresario objEmpresario = dEmpresario.save(empresario);
        if (objEmpresario == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int id) {

        dEmpresario.deleteById(id);

    }

    @Override
    public Optional<Empresario> listarId(int id) {

        return dEmpresario.findById(id);
    }

    @Override
    public List<Empresario> listar() {
        return dEmpresario.findAll();
    }

    @Override
    public List<Empresario> buscarUsuario(String nombreUsuario) {
        return dEmpresario.buscarUsuario(nombreUsuario);
    }

    @Override
    public List<Empresario> buscarEmpresario(String razonEmpresario) {
        return dEmpresario.buscarEmpresario(razonEmpresario);
    }

    @Override
    public List<Empresario> findByRucEmpresario(int rucEmpresario) {
        return dEmpresario.findByRucEmpresario(rucEmpresario);
    }


}
