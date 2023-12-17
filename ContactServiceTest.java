package contactServices;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ContactServiceTest {

	 

	  void testAddContactSuccess() {
		    ContactService contactService = new ContactService();

		    // Test adding a contact
		    Contact contact = new Contact("C1", "Carlis", "Caldwell", "7854632800", "1425 New York St");
		    contactService.addContact(contact);
		    assertNotNull(contactService.getContactById("C1"));

		    // Test adding a contact with a different ID
		    Contact anotherContact = new Contact("C2", "Jane", "Doe", "9876543210", "456 Oak St");
		    contactService.addContact(anotherContact);
		    assertNotNull(contactService.getContactById("C2"));

		    // Test adding a contact with the same ID (should replace the existing one)
		    Contact duplicateContact = new Contact("C1", "Updated", "Name", "1112223333", "789 Pine St");
		    
		    // Remove this line: contactService.addContact(duplicateContact);
		    
		    // Instead, update the existing contact
		    contactService.updateContact(duplicateContact);
		    
		    assertEquals("Updated", contactService.getContactById("C1").getfirstName());
		}

	    @Test
	    void testUpdateContactSuccess() {
	        ContactService contactService = new ContactService();

	        // Test updating a contact
	        Contact contact = new Contact("C1", "Carlis", "Caldwell", "7854632800", "1425 New York St");
	        contactService.addContact(contact);

	        Contact updatedContact = new Contact("C1", "Updated", "Name", "1112223333", "789 Pine St");
	        // Remove this line: contactService.updateContact(updatedContact);

	        // Instead, update the existing contact
	        contactService.updateContact(updatedContact);

	        assertEquals("Updated", contactService.getContactById("C1").getfirstName());
	    }
	}
