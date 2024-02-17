package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula-jpa");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction();

		manager.persist(p1);
		manager.persist(p2);
		manager.persist(p3);
		
		manager.getTransaction().commit();
		
		Pessoa pessoa = manager.find(Pessoa.class, 2);
		
		System.out.println(pessoa);
		
		manager.remove(pessoa);
		
		manager.close();
		factory.close();

	}

}
