package autowireannot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired 
	@Qualifier("ad")
	private Address address;
//Write @autowired on variable,setter,constructor

	public Student(Address address) {
		super();
		System.out.println("Constructor Called");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("setter Called");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
}
