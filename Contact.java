/*
 * Name: Carlis Caldwell
 * course: cs320
 * date 12/10/2023
 */
package contactServices;


//Contact class representing a contact in the mobile application
public class Contact {
    // Unique identifier for the contact
	private final String contactID;
    // Basic contact information

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	
    // Constructor to initialize a new contact with the provided information
public Contact(String contactID, String firstName, String lastName, String phone, String address) {
    /*
     * Updated contact ID in order  to prevent duplicates and to make
     * sure there is no other way to update the contact ID.
     * The contact ID is final so we do not need any getters or setters to access it.*/
	
	
	if (contactID == null || contactID.length() > 10) {
	    throw new IllegalArgumentException("Invalid ID.");
	}
	if (firstName == null || firstName.length() > 10) {
		throw new IllegalArgumentException("Invalid first name.");
	}
	
	if (lastName == null || lastName.length() > 10) {
		throw new IllegalArgumentException("Invalid last name.");
	}
	if (phone == null || !phone.matches("\\d{10}")) {
		throw new IllegalArgumentException("Invalid phone number.");
	}
	if (address  == null || address.length()  > 30) {
		throw new IllegalArgumentException("Invalid address.");
	}	
	
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phone;
		this.address = address;	    
}
// Getters and setters for accessing and modifying contact information

		public String getcontactID() {
			return contactID;
		}
		public String getfirstName() {
			return firstName;
		}
		public String getlastName() {
			return lastName;
		}
		public  String getphone() {
			return phoneNumber;
		}
		public String getaddress() {
			return address;
		}
		
//setters
	    public void setFirstName(String firstName) {  

	        // Verify the input  

	        if (firstName == null || firstName.length()>10) {  

	            throw new IllegalArgumentException("Invalid First Name");  

	        }  

	        this.firstName = firstName;  

	    }  
	    
// Setters for last name.
	    public void setLastName(String lastName) {
	    	// Verify the input
	    	if (lastName == null || lastName.length() > 10){  

	            throw new IllegalArgumentException("Invalid Last Name");  

	        }  
	    	this.lastName = lastName;
	    }
//setters for phone number.
	    public void setPhone(String phone) {
	    	if (phone == null || !phone.matches("\\d{10}")){
	    		throw new IllegalArgumentException("Invalid Phone number");
	    	}
	    	this.phoneNumber = phone;
	    }
	    
	    
//setters for Address
	    public void setAddress(String address) {
	    	if  (address  == null || address.length()  > 30) {
	    		throw new IllegalArgumentException("Invalid Addresss.");
	    	}
	    	this.address = address; 
	    }
}
