package Prateek;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="Employee")
@XmlAccessorType(XmlAccessType.FIELD)




public class Employee {
	
	@XmlElement
	 private int Salary ;
	@XmlElement
	 private String Name;
	@XmlElement
	 private String Address;
	@XmlElement
	 private String id;
	 
	 
	public Employee() {
		super();
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Employee(int salary, String name, String address, String id) {
		super();
		Salary = salary;
		Name = name;
		Address = address;
		this.id = id;
	}
	
	


}
