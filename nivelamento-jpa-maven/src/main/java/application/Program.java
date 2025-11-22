package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {
	public static void main(String[] args) {
		Person person1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
		Person person2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
		Person person3 = new Person(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		entityManager.getTransaction().commit();
		
		System.out.println("Pronto");
	}
}
