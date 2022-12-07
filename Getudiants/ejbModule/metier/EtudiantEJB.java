package metier;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import metier.entities.Etudiant;

@Stateless(name="ETU")//publier_sa_reference_dans_l'annuaire_JNDI=>:Nom_Projet_EAR/Nom_Projet_EJB/Name!Package.Nominterface
public class EtudiantEJB implements EtudiantRemote, EtudiantLocal {
	
	@PersistenceContext(unitName="Getudiants")
	private EntityManager em;

	@Override
	public void save(Etudiant etudiant) {
		em.persist(etudiant);
	}

	@Override
	public void update(Etudiant etudiant) {
		em.refresh(etudiant);
	}

	@Override
	public void delete(Etudiant etudiant) {
		em.remove(etudiant);
	}
	@Override
	public Etudiant getById(Long idEtudiant) {
		Etudiant etudiant = em.find(Etudiant.class, idEtudiant);
		if(etudiant == null)
			throw new RuntimeException("Etudiant introuvale !");
		return etudiant;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Etudiant> list() {
		Query qry = em.createQuery("Select e from Etudiant e");
		return qry.getResultList();
	}
}
