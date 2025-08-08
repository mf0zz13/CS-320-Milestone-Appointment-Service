import java.util.Date;
import java.util.HashMap;

public class AppointmentService {
    private int appointmentCount = 0;
    private HashMap<String, Appointment> appointments = new HashMap<String, Appointment>();

    public void addAppointment(Date appointmentDate, String appointmentDescription) {
        String appointmentID;
        try {
            appointmentID = String.valueOf(appointmentCount);
            appointmentCount++;

            Appointment tempAppointment = new Appointment(appointmentID, appointmentDate, appointmentDescription);
            appointments.put(appointmentID,tempAppointment);
        }
        catch (Exception e) {
            appointmentCount--;
            appointmentID = String.valueOf(appointmentCount);

            System.err.println(e.getMessage());
        }
    }

    public void deleteAppointment(String appointmentID) {
        try {
            appointments.remove(appointmentID);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


}
