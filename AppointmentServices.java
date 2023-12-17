package ApointmentServices;
import java.util.ArrayList;

import java.util.Date;
public class AppointmentServices {

	// builds an array to store appointments
		public ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

		// Display all current Appointment stored.
		public void displayAppointmentList() {
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				System.out.println("\t Appointment ID: " + appointmentList.get(counter).getAppointmentID());
				System.out.println("\t Appointment Date: " + appointmentList.get(counter).getAppointmentDate());
				System.out.println("\t Appointment Description: " + appointmentList.get(counter).getAppointmentDesc());
			}
		}

		// Adds a new appointment 
		public void addAppointment(Date appointmentDate, String appointmentDesc) {
			// Create the new appointment
			Appointment appointment = new Appointment(appointmentDate, appointmentDesc);
			appointmentList.add(appointment);
		}

		// Search for a matching appointment ID and return a value if found
		
		public Appointment getAppointment(String appointmentID) {
			Appointment appointment = new Appointment(null, null);
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				if (appointmentList.get(counter).getAppointmentID().contentEquals(appointmentID)) {
					appointment = appointmentList.get(counter);
				}
			}
			return appointment;
		}

		// can delete the appointment
		
		public void deleteAppointment(String appointmentID) {
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
					appointmentList.remove(counter);
					break;
				}
				if (counter == appointmentList.size() - 1) {
					System.out.println("Appointment ID: " + appointmentID + " not found.");
				}
			}
		}

		// changes the appoint dates.
		public void updateAppointmentDate(Date updatedDate, String appointmentID) {
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
					appointmentList.get(counter).setAppointmentDate(updatedDate);
					break;
				}
				if (counter == appointmentList.size() - 1) {
					System.out.println("Appointment ID: " + appointmentID + " not found.");
				}
			}
		}

		// allows for us to update our appointments
		public void updateAppointmentDesc(String updatedString, String appointmentID) {
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
					appointmentList.get(counter).setAppointmentDesc(updatedString);
					break;
				}
				if (counter == appointmentList.size() - 1) {
					System.out.println("Appointment ID: " + appointmentID + " not found.");
				}
			}
		}
	}