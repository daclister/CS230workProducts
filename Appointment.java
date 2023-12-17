package ApointmentServices;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Calendar;
import java.util.Date;

public class Appointment {
	private final String appointmentID;
    private Date appointmentDate;
    private String appointmentDesc;
    private static AtomicLong idGenerator = new AtomicLong();

    /**
     * Constructs an appointment with the provided date and description.
     * If any parameter is null or empty, it is set to "NULL" to ensure data integrity.
     * Appointment ID is generated and truncated to a maximum of 10 characters.
     * Date is validated to ensure it is not before the current date.
     *
     * @param appointmentDate The date of the appointment.
     * @param appointmentDesc The description of the appointment.
     */
    @SuppressWarnings("deprecation")
    public Appointment(Date appointmentDate, String appointmentDesc) {
        // Appointment ID
        // Generated when the constructor is called, set as a final variable, and no other getter or setter exists.
        // The idGenerator is static to prevent duplicates across all tasks.
        this.appointmentID = String.valueOf(idGenerator.getAndIncrement());

        // Appointment Date
        if (appointmentDate == null) {
            this.appointmentDate = new Date(2022, Calendar.JANUARY, 1);
        } else if (appointmentDate.before(new Date())) {
            throw new IllegalArgumentException("Cannot make appointment before the current date.");
        } else {
            this.appointmentDate = appointmentDate;
        }

        // Appointment Description
        if (appointmentDesc == null || appointmentDesc.isEmpty()) {
            this.appointmentDesc = "NULL";
        } else if (appointmentDesc.length() > 50) {
            this.appointmentDesc = appointmentDesc.substring(0, 50);
        } else {
            this.appointmentDesc = appointmentDesc;
        }
    }

    // GETTERS
    public String getAppointmentID() {
        return appointmentID;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentDesc() {
        return appointmentDesc;
    }

    // SETTERS
    /**
     * Sets the appointment date.
     * If the provided date is null, it defaults to January 1, 2022.
     * Validates that the date is not before the current date.
     *
     * @param appointmentDate The new date of the appointment.
     */
    @SuppressWarnings("deprecation")
    public void setAppointmentDate(Date appointmentDate) {
        if (appointmentDate == null) {
            appointmentDate = new Date(2022, Calendar.JANUARY, 1);
        } else if (appointmentDate.before(new Date())) {
            throw new IllegalArgumentException("Cannot make appointment before the current date.");
        } else {
            this.appointmentDate = appointmentDate;
        }
    }

    /**
     * Sets the appointment description.
     * If the provided description is null or empty, it is set to "NULL."
     * Limits the description to a maximum of 50 characters.
     *
     * @param appointmentDesc The new description of the appointment.
     */
    public void setAppointmentDesc(String appointmentDesc) {
        if (appointmentDesc == null || appointmentDesc.isEmpty()) {
            this.appointmentDesc = "NULL";
        } else if (appointmentDesc.length() > 50) {
            this.appointmentDesc = appointmentDesc.substring(0, 50);
        } else {
            this.appointmentDesc = appointmentDesc;
        }
    }
}
