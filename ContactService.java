package contactServices;
import java.util.HashMap;
import java.util.Map;
public class ContactService {
	 // ContactService class managing contact operations in the mobile application

    private Map<String, Contact> contacts = new HashMap<>();

    // Method to add a new contact to the service
    public void addContact(Contact contact) {
        // Extract contact ID for validation
        String contactId = contact.getcontactID();

        // Check if the contact with the given ID already exists
        if (contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Duplicate ID: " + contactId);
        }

        // Add the contact to the map
        contacts.put(contactId, contact);
    }

    // Method to delete a contact by its ID
    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }

    // Method to update an existing contact with new information
    public void updateContact(Contact updatedContact) {
        // Extract contact ID for validation
        String contactId = updatedContact.getcontactID();

        // Check if the contact with the given ID exists
        if (contacts.containsKey(contactId)) {
            // Update the contact
            contacts.put(contactId, updatedContact);
        } else {
            throw new IllegalArgumentException("Contact with ID " + contactId + " does not exist. Unable to update.");
        }
    }

    // Method to retrieve a contact by its ID
    public Contact getContactById(String contactID) {
        return contacts.get(contactID);
    }

    // Method to update the first name of a contact by ID
    public void updateContactFirstName(String contactId, String firstName) {
        // Retrieve contact by ID
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            // Update the first name
            contact.setFirstName(firstName);
        } else {
            throw new IllegalArgumentException("Contact with ID " + contactId + " not found.");
        }
    }

    // Method to update the last name of a contact by ID
    public void updateContactLastName(String contactId, String lastName) {
        // Retrieve contact by ID
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            // Update the last name
            contact.setLastName(lastName);
        } else {
            throw new IllegalArgumentException("Contact with ID " + contactId + " not found.");
        }
    }

    // Method to update the phone number of a contact by ID
    public void updateContactPhone(String contactId, String number) {
        // Retrieve contact by ID
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            // Update the phone number
            contact.setPhone(number);
        } else {
            throw new IllegalArgumentException("Contact with ID " + contactId + " not found.");
        }
    }

    // Method to update the address of a contact by ID
    public void updateContactAddress(String contactId, String address) {
        // Retrieve contact by ID
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            // Update the address
            contact.setAddress(address);
        } else {
            throw new IllegalArgumentException("Contact with ID " + contactId + " not found.");
        }
    }
}