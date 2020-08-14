package com.tarea.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tarea.entidades.Cliente;
import com.tarea.entidades.Pais;




public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();

	public static void main(String[] args) {
		
		 Cliente cliente1 = new Cliente (0,"Kennya","Rosado","Delgado");
		 Cliente cliente2 = new Cliente (0,"Ronald","Rosado","Delgado");
		 Cliente cliente3 = new Cliente (0,"Marcelo","Rosado","Delgado");
		 
			 
		 
		
		     ingresarCliente(cliente1);
		     ingresarCliente(cliente2); 
		     ingresarCliente(cliente3);
			    
		    
		    
		    
		    
		    
         Pais pais1 = new Pais (0,"Ecuador");
         Pais pais2 = new Pais (0,"Peru");
         Pais pais3 = new Pais (0,"España");
         
         
         
         
             ingresarPais (pais1);
             ingresarPais (pais2);
             ingresarPais (pais3);
             
        
		

	}
	
	
	 static void ingresarCliente(Cliente cliente) {
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(cliente);
			
			session.getTransaction().commit();
			session.close();
			System.out.println(cliente.getId());
		}
	  
	 
	 static void ingresarPais(Pais pais) {
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(pais);
			
			session.getTransaction().commit();
			session.close();
			System.out.println(pais.getId());
		}
	

}
