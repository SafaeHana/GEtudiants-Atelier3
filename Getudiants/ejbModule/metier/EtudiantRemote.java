package metier;

import java.util.List;

import jakarta.ejb.Remote;
import metier.entities.Etudiant;

@Remote
public interface EtudiantRemote {

	public void save(Etudiant etudiant);

	public void update(Etudiant etudiant);

	public Etudiant getById(Long idEtudiant);

	public List<Etudiant> list();
	
	public void delete(Etudiant etudiant);

}
