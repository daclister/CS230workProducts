package contactServices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testCreateContactSuccess() {
        Contact contact = new Contact("C1", "carlis", "caldwell", "7854632800", "1425 newy york st");
        assertEquals("C1", contact.getcontactID());
        assertEquals("carlis", contact.getfirstName());
        assertEquals("caldwell", contact.getlastName());
        assertEquals("7854632800", contact.getphone());
        assertEquals("1425 newy york st", contact.getaddress());
	}

	
	@Test
	void testCreateContactContactIdFail() {
	    // Test for an invalid contact ID
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345678901", "Carlis", "Caldwell", "2801 91ST", "4802929112");
	    });
	}

	@Test
	void testCreateContactFirstNameFail() {
	    // Test for an invalid first name
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("C2", "Carlisrrrrrrrrrr", "Caldwell", "1111 E Road Street", "4802929112");
	    });
	}

	@Test
	void testCreateContactLastNameFail() {
	    // Test for an invalid last name
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("C3", "Carlis", "Toolonglastnamethatisinvalid", "123 Main St", "4802929112");
	    });
	}

	@Test
	void testCreateContactPhoneNumberTooLongFail() {
	    // Test for an invalid phone number (too long)
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("C4", "Alice", "Johnson", "12345678901", "456 Broad St");
	    });
	}

	@Test
	void testCreateContactPhoneNumberTooShortFail() {
	    // Test for an invalid phone number (too short)
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("C5", "Bob", "Smith", "123", "5555555555");
	    });
	}

	    }
	
	
	
	
	

