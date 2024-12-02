package User;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameRegex = "^[A-Z][a-z]{2,}$";
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String mobileRegex = "^[0-9]{2} [0-9]{10}$";
        String passwordRegex = "^.{8,}&";

        System.out.println("Enter the first name : ");
        String firstName = sc.nextLine();
        validator(firstName,nameRegex,"FirstName");

        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();
        validator(lastName,nameRegex,"LastName");

        System.out.println("Enter the email : ");
        String email = sc.nextLine();
        validator(email,emailRegex,"Email");

        System.out.println("Enter the phone number : ");
        String phoneNumber = sc.nextLine();
        validator(phoneNumber,mobileRegex,"PhoneNumber");

        System.out.println("Enter the password : ");
        String password = sc.nextLine();
        validator(password,passwordRegex,"Password");
    }
    public static void validator(String name, String pattern, String nameType){
        if (Pattern.matches(pattern,name)){
            System.out.println(nameType +" : "+name);
        }
        else {
            System.out.println("Invalid..!");
        }
    }
}
