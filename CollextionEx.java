package sakshigothal;

import java.util.*;

class Student{
	int rollno;
	String name,address;
	long mobileno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
}

public class CollextionEx {
	public static void main(String[] args) {
		Student s=new Student();
		ArrayList a=new ArrayList(); 
		s.setName("virat");
		s.setRollno(18);
		s.setMobileno(123456789l);
		s.setAddress("mumbai");
		a.add(s);
		
		a=new ArrayList(); 
		s.setName("sakshi");
		s.setRollno(18);
		s.setMobileno(123456789l);
		s.setAddress("dubai");
		a.add(s);
		
		a=new ArrayList(); 
		s.setName("virat");
		s.setRollno(18);
		s.setMobileno(12345689898989l);
		s.setAddress("varali");
		a.add(s);
//		Iterator i=a.iterator();
//		while(i.hasNext()) {
//			s=(Student)i.next();
//			System.out.println(s.getName()+" "+ s.getRollno()+" "+s.getMobileno()+" "+s.getAddress());
//			System.out.println(s.getName()+" "+ s.getRollno()+" "+s.getMobileno()+" "+s.getAddress());
//		}
		Iterator i=a.iterator();
		while(i.hasNext()) {
			s=(Student)i.next();
			System.out.println(s.getName()+" "+s.getMobileno());
			System.out.println(s.getName()+" "+s.getMobileno());
		}
	}
	
}
