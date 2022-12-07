package metier;

import java.util.List;

import jakarta.ejb.Local;
import metier.entities.Etudiant;

@Local
public interface EtudiantLocal {

	public void save(Etudiant etudiant);

	public void update(Etudiant etudiant);

	public Etudiant getById(Long idEtudiant);

	public List<Etudiant> list();
	
	public void delete(Etudiant etudiant);
}
