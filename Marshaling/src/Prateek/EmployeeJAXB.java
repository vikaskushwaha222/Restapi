package Prateek;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.*;

public class EmployeeJAXB {
	
	public void marshell()	
	{
		try {
			
			Employee emp=new Employee(1010101, "vikas", "prateek", "mummy");
			
			JAXBContext j= JAXBContext.newInstance(Employee.class);
			
			Marshaller ms= j.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(emp, System.out);
			ms.marshal(emp, new File("src\\vikasku\\Employee.xml"));
			
			
			
		}
		catch(Exception e) {
			System.out.println(""+ e.getMessage());

			
		}
		
	}
	public void unmarshall()
	{
		
		try {
			
			JAXBContext j = JAXBContext .newInstance(Employee.class);
			Unmarshaller  un =  j.createUnmarshaller();
			Employee emp = (Employee) un.unmarshal(new File("src\\vikasku\\Employee.xml"));
			System.out.println("id    "+emp.getId());
			System.out.println("Name    "+emp.getName());
			
			System.out.println("Address  "+emp.getAddress());
			
			System.out.println("Salary    "+emp.getSalary());
			
			
			
			
			
		}
	catch(Exception e ) {
		
		System .out.println(""+e.getMessage());
	}
		
		
	}
	
	

}
