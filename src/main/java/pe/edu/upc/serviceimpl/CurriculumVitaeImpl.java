package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.curriculumvitae;
import pe.edu.upc.repository.ICurriculumVitaeRepository;
import pe.edu.upc.serviceinterfeaces.ICurriculumVitaeInterfaces;
@Service
public class CurriculumVitaeImpl implements ICurriculumVitaeInterfaces{
	@Autowired
	private ICurriculumVitaeRepository cvR;
	@Override
	public void insert(curriculumvitae cv) {
		// TODO Auto-generated method stub
		cvR.save(cv);
	}

	@Override
	public List<curriculumvitae> list() {
		// TODO Auto-generated method stub
		return cvR.findAll();
	}

}
