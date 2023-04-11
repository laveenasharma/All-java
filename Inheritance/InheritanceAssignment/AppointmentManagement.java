import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentManagement {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clinic clinic = new Clinic();
        boolean running = true;
        
        while (running) {
            System.out.println("===== Clinic Appointment Management System =====");
            System.out.println("1. View list of all Visitors");
            System.out.println("2. Add new Visitor");
            System.out.println("3. Edit Visitor Details");
            System.out.println("4. View Appointment Schedule for a Day");
            System.out.println("5. Book an Appointment");
            System.out.println("6. Edit/Cancel Appointment");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            
            switch (choice) {
                case 1:
                    clinic.viewVisitorsList();
                    break;
                case 2:
                    System.out.print("Enter Visitor name: ");
                    String visitorName = input.nextLine();
                    System.out.print("Enter Visitor age: ");
                    int visitorAge = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Visitor phone number: ");
                    String visitorPhoneNumber = input.nextLine();
                    Visitor newVisitor = new Visitor(visitorName, visitorAge, visitorPhoneNumber);
                    clinic.addVisitor(newVisitor);
                    System.out.println("New Visitor added successfully!");
                    break;
                case 3:
                    System.out.print("Enter Visitor name to edit: ");
                    String editVisitorName = input.nextLine();
                    System.out.print("Enter new Visitor name: ");
                    String newVisitorName = input.nextLine();
                    System.out.print("Enter new Visitor age: ");
                    int newVisitorAge = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter new Visitor phone number: ");
                    String newVisitorPhoneNumber = input.nextLine();
                    Visitor editedVisitor = new Visitor(newVisitorName, newVisitorAge, newVisitorPhoneNumber);
                    clinic.editVisitorDetails(editVisitorName, editedVisitor);
                    System.out.println("Visitor details edited successfully!");
                    break;
                case 4:
                    System.out.print("Enter the date to view appointment schedule (YYYY-MM-DD): ");
                    String date = input.nextLine();
                    clinic.viewAppointmentSchedule(date);
                    break;
                case 5:
                    System.out.print("Enter Visitor name: ");
                    String bookVisitorName = input.nextLine();
                    System.out.print("Enter date for appointment (YYYY-MM-DD): ");
                    String bookAppointmentDate = input.nextLine();
                    System.out.print("Enter time for appointment (HH:MM AM/PM): ");
                    String bookAppointmentTime = input.nextLine();
                    boolean booked = clinic.bookAppointment(bookVisitorName, bookAppointmentDate, bookAppointmentTime);
                    if (booked) {
                        System.out.println("Appointment booked successfully!");
                    } else {
                        System.out.println("Appointment booking failed! Please choose a different time slot.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Visitor name to edit appointment: ");
                    String editAppointmentVisitorName = input.nextLine();
                    System.out.print("Enter date for appointment to edit (YYYY-MM-DD): ");
                    String editAppointmentDate = input.nextLine();
                    System.out.print("Enter time for appointment to edit (HH:MM AM/PM): ");
                    String editAppointmentTime = input.nextLine();
                    System.out.print("Enter new time for appointment (HH:MM AM/PM) or 'cancel' to cancel the appointment: ");
                    String newAppointmentTime = input.nextLine();
                    boolean edited = clinic.editAppointment(editAppointmentVisitorName, editAppointmentDate, editAppointmentTime, newAppointment

