package fr.diginamic.CoursHibernateJpa.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CONTACT")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date birth;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "adresse_id")
	private Adresse adressePrincipale;

	/**
	 * Constructeur
	 * 
	 */
	public Contact() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param name
	 * @param birth
	 */
	public Contact(String name, Date birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	/**
	 * Constructeur
	 * 
	 * @param name
	 */
	public Contact(String name) {
		super();
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", birth=" + birth + "]";
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}

	/**
	 * Setter
	 * 
	 * @param birth
	 *            the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/**
	 * @return the adressePrincipale
	 */
	public Adresse getAdressePrincipale() {
		return adressePrincipale;
	}

	/**
	 * Setter
	 * 
	 * @param adressePrincipale
	 *            the adressePrincipale to set
	 */
	public void setAdressePrincipale(Adresse adressePrincipale) {
		this.adressePrincipale = adressePrincipale;
	}

}
