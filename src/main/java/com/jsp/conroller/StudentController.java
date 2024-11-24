package com.jsp.conroller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.model.Student;

public class StudentController {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	public void saveStudent(Student s) {
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("record inserted succesfully");
		
	}




	public void findByRollNo(int rol) {
		Student s= em.find(Student.class, rol);
		if(s!=null) {
			System.out.println(s.getName()+" "+ s.getGmail()+" "+s.getDob()+" "+s.getAddress()+" "+s.getCareOf());
		}
		else {
			System.out.println("record is not present");
		}		
	}




	public void updatebyRollNo(int rollno, String newname) {
			Student	s=em.find(Student.class, rollno);
			if(s!=null) {
				s.setName(newname);
				et.begin();
				em.merge(s);
				et.commit();
				System.out.println("record updated");
			}
			else {
				System.out.println("record not present");
			}
	}




	public void deleteByRollNo(int no) {
				Student s = em.find(Student.class, no);
				if(s!=null) {
					et.begin();
					em.remove(s);
					et.commit();
					System.out.println("record deleted");
				}
				else {
					System.out.println("record not present");
				}
	}




	public void findAll() {
				Query q = em.createQuery("select s from Student s");
				List<Student> l=q.getResultList();
				if(! l.isEmpty()) {
					for(Student s: l) {
						System.out.println(s.getName()+" "+s.getGmail()+" "+s.getDob()+" "+s.getAddress()+" "+s.getCareOf());
					}
				}
				else {
					System.out.println("records not present to fetch");
				}
	}

}
