import java.util.Date;

public class Appointment {
    private String appointmentID;
    private Date appointmentDate;
    private String appointmentDescription;


       public void SetAppointmentID(String appointmentID) {
           if (appointmentID != null && appointmentID.length() <= 10)
               this.appointmentID = appointmentID;
           else
               throw new IllegalArgumentException("Appointment ID can not be null or more than 10 characters.");
       }

       public String GetAppointmentID() {
           return appointmentID;
       }

       public void SetAppointmentDate(Date appointmentDate) {
           Date SystemDate = new Date();

           if (appointmentDate.before(SystemDate))
               throw new IllegalArgumentException("Date can not be in the past");
           else
               this.appointmentDate = appointmentDate;
       }

       public Date GetAppointmentDate() {
           return appointmentDate;
       }

       public void SetAppointmentDescription(String appointmentDescription) {
           if (appointmentDescription != null && appointmentDescription.length() <= 50)
               this.appointmentDescription = appointmentDescription;
           else
               throw new IllegalArgumentException("Appointment Description can not be null or more than 50 characters.");
       }

       public String GetAppointmentDescription() {
           return appointmentDescription;
       }

       public Appointment(String appointmentID, Date appointmentDate, String appointmentDescription) {
           SetAppointmentID(appointmentID);
           SetAppointmentDate(appointmentDate);
           SetAppointmentDescription(appointmentDescription);
       }
}
