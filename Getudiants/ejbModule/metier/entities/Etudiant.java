package metier.entities;

import java.io.Serializable;
import java.lang.String;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity implementation class for Entity: etudiant
 *
 */
@Entity
@Table(name = "etudiant")
public class Etudiant implements Serializable { 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_etudiant;
	private String nom;
	private String prenom;
	private String cne;
	private String adress;
	private String niveau;
	private static final long serialVersionUID = 1L;

	public Etudiant(int i, String nomEtudiant, String prenomEtudiant, String cneEtudiant, String adresseEtudiant, String niveauEtudiant) {
		super();
	}   
	public Etudiant() {
		super();
	} 
	public Long getId_etudiant() {
		return this.id_etudiant;
	}

	public void setId_etudiant(Long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getCne() {
		return this.cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}   
	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}   
	public String getNiveau() {
		return this.niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
   
}
