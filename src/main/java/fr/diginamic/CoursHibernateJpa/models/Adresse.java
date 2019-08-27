package fr.diginamic.CoursHibernateJpa.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Adresse implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomDeRue;
	private String numero;
	private String codePostal;
	private String City;

	@OneToMany(mappedBy = "adressePrincipale")
	Set<Contact> contacts;

	/**
	 * Constructeur
	 * 
	 */
	public Adresse() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nomDeRue
	 * @param numero
	 * @param codePostal
	 * @param city
	 */
	public Adresse(String nomDeRue, String numero, String codePostal, String city) {
		super();
		this.nomDeRue = nomDeRue;
		this.numero = numero;
		this.codePostal = codePostal;
		City = city;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nomDeRue
	 */
	public String getNomDeRue() {
		return nomDeRue;
	}

	/**
	 * Setter
	 * 
	 * @param nomDeRue
	 *            the nomDeRue to set
	 */
	public void setNomDeRue(String nomDeRue) {
		this.nomDeRue = nomDeRue;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Setter
	 * 
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter
	 * 
	 * @param codePostal
	 *            the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}

	/**
	 * Setter
	 * 
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		City = city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adresse [id=" + id + ", nomDeRue=" + nomDeRue + ", numero=" + numero + ", codePostal=" + codePostal
				+ ", City=" + City + "]";
	}

}
