package Projects;

import javax.swing.event.DocumentEvent;
import java.util.*;

public class Email_Information {

    // Required variable setup is as follow
    private String firstName;
    private String lastName;
    private String password;
    private int passwordLength = 10;
    private String department;
    private String domain = "company.com";
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;

    // Receive employee first name & last name
    public Email_Information(String firstName, String lastName) {

        // Generate employee Information
        this.firstName = firstName;
        this.lastName = lastName;
      //  System.out.println("Email Created For :: " + this.firstName + " " + this.lastName);

        // Generate Department Information
        this.department = setDepartment();
      // System.out.println("Department Is :: " + this.department);

        // Generate Random Password
        this.password = randomPassword(passwordLength);
        System.out.println("Your Password Is :: " + this.password);

        // Generate Email With First, Last Name And Company Name With Domain
        email = firstName.toLowerCase()  + lastName.toLowerCase() + "@" + department.toLowerCase()  + "." + domain.toLowerCase();
       //  System.out.println("Email Generated For Employee Is :: " +email);
    }

    // Ask for department
    private String setDepartment() {
        System.out.println("New Employee :: " + firstName + "\nDepartment Codes Are :: \n1 Development \n2 Marketing \n3 Designing \n4 Accounting \n5 None \nEnter The Department Code ::" );
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        if (choice == 1) {
            return "Development";
        }
        if (choice == 2) {
            return "Marketing";
        }
        if (choice == 3) {
            return "Designing";
        }
        if (choice == 4) {
            return "Accounting";
        }

            return "None";

    }



    // Generate password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*~";
        char password[] = new char[length];
        for(int i=0; i<length; i++){
           int random = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(random);
        }
        return new String (password);
    }

    // Set mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    // Set alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    // Password change
    public void changePassword(String password){
        this.password = password;
    }
    // Get mailbox capacity
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    // Get alternate email
    public String getAlternateEmail(){
        return alternateEmail;
    }
    // Get password
    public String getPassword(){
        return password;
    }
    // Show information
    public String showInfo() {
        return "\nDisplay Name Of Employee :: " + firstName + " " + lastName +
                "\nCompany Email :: " + email +
                "\nMailbox Capacity :: " + mailBoxCapacity + "mb";
    }
}
