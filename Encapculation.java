package sakshigothal;

public class Encapculation {
	int id;
	String name,email,address;
	long mobileno;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
public static void main(String[] args) {
	//encapsulation,inheritance,polymorphisam,absraction
	Encapculation e=new Encapculation();
	e.setId(1);
	e.setName("sakshi");
	e.setAddress("kandivali");
	e.setEmail("sgothal@gmail.com");
	e.setMobileno(123647647);
	System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress()+" " +e.getMobileno()+" "+e.getEmail());
	
	e.setId(2);
	e.setName("sanket");
	e.setAddress("malad");
	e.setEmail("ssakpal@gmail.com");
	e.setMobileno(678763543);
	System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress()+" " +e.getMobileno()+" "+e.getEmail());

}

}
