package fr.diginamic.CoursHibernateJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.CoursHibernateJpa.models.Adresse;
import fr.diginamic.CoursHibernateJpa.models.Contact;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("td-hibernate-jpa");
			em = emf.createEntityManager();

			em.getTransaction().begin();
			Contact contact = new Contact("olivier a une adresse");
			contact.setAdressePrincipale(new Adresse("rue de la soif", "50", "44000", "quimp"));
			em.persist(contact);

			// Contact h = em.find(Contact.class, 4l);
			// if (h != null) {
			// // traitement
			// System.out.println(h.toString());
			// h.setBirth(new Date());
			// em.merge(h);
			//
			// }

			em.getTransaction().commit();

			// TypedQuery<Contact> query = em.createQuery("from Contact",
			// Contact.class);
			// List<Contact> list = query.getResultList();
			//
			// for (Contact c : list) {
			// System.out.println(c);
			// }

		} finally {
			if (em != null)
				em.close();
			if (emf != null)
				emf.close();
		}

	}
}
