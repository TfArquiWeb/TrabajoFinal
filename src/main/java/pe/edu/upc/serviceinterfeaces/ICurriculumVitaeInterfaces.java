package pe.edu.upc.serviceinterfeaces;

import java.util.List;

import pe.edu.upc.entity.curriculumvitae;

public interface ICurriculumVitaeInterfaces {
	public void insert(curriculumvitae cv);
	List<curriculumvitae>list();
}
