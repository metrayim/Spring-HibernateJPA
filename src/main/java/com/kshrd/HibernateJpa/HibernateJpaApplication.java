package com.kshrd.HibernateJpa;

import com.kshrd.HibernateJpa.Entities.Dapartment;
import com.kshrd.HibernateJpa.Entities.Employee;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@SpringBootApplication
@Transactional
public class HibernateJpaApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication.class, args);
	}

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Dapartment dapartment1= new Dapartment("HI");
		Dapartment dapartment2= new Dapartment("HR");

		this.entityManager.persist(dapartment1);
		this.entityManager.persist(dapartment2);

		Employee employee1=new Employee("Dara",23.00,dapartment1);
		Employee employee2=new Employee("Sonita",23.00,dapartment1);
		Employee employee3=new Employee("Dada",23.00,dapartment2);
		Employee employee4=new Employee("Friday",23.00,dapartment2);

		this.entityManager.persist(employee1);
		this.entityManager.persist(employee2);
		this.entityManager.persist(employee3);
		this.entityManager.persist(employee4);

	}
}
