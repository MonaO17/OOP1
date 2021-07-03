package datatypes;

public class Person {
	private String lastName;
	private String firstName;
	
	public Person(String last, String first) {
		lastName =last;				//or this.lastName =lastName !!!!!
		firstName =first;
	}

	public String toString() {
		return "Last name: "+ lastName + ", First Name: "+firstName;
	}
}
