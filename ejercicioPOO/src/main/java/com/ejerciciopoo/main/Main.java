package com.ejerciciopoo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.ejerciciopoo.entidades.Cliente;
import com.ejerciciopoo.entidades.Pais;





public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();

	public static void main(String[] args) {
		Cliente cliente= new Cliente(0,"joel ","olivos","mendez");
		ingresarCliente(cliente);
		Cliente cliente1= new Cliente(1,"choez ","choez","super");
		ingresarCliente(cliente1);
		
		Pais pais= new Pais(0,"ecuador ");
		ingresarpais(pais);
		Pais pais1= new Pais(1,"mexico ");
		ingresarpais(pais1);
		
		
		
	

	}
	static void ingresarCliente(Cliente cliente) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(cliente);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresarpais(Pais pais) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(pais);
		session.getTransaction().commit();
		session.close();

	}
	
        static List<Cliente> getCliente(){
		Session session = sessionFactory.openSession();
		List<Cliente> pais=(List<Cliente>)session.createQuery("from cliente",Cliente.class ).list();
		return pais;
	}


}
