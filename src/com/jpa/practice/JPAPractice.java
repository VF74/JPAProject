package com.jpa.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author obd561
 *
 */
public class JPAPractice 
{

	public static void main(String[] args) 
	{
		System.out.println("JPAPractice");
		
		JPAPractice jpapractice = new JPAPractice();
		
        StudentEntity s1=new StudentEntity();  
        s1.setId(101);  
        s1.setName("Rob");  
        s1.setAge(24);  
        
        jpapractice.saveStudent(s1);

	}
	
	
	private void saveStudent(StudentEntity student)
	{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(student);  
		em.getTransaction().commit();  
		
		emf.close();  
	    em.close(); 
	    
	}
	
	
	private void readStudent(int studentId)
	{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em = emf.createEntityManager();  
          
        StudentEntity s = em.find(StudentEntity.class, studentId);  
          
        System.out.println("Student id = "+s.getId());  
        System.out.println("Student Name = "+s.getName());  
        System.out.println("Student Age = "+s.getAge());  
		
	}
	

}
