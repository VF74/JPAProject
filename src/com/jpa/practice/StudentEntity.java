package com.jpa.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;  


@Entity  
@Table(name="student") 
public class StudentEntity 
{  
    @Id private int id;
    
    private String name;  
    private int age;
    private long fees;  
    
    public StudentEntity() {}

    public StudentEntity(int s_id, String s_name, int s_age) {  
        super();  
        this.id = s_id;  
        this.name = s_name;  
        this.age = s_age;  
    }      
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}  
	
	
}  


