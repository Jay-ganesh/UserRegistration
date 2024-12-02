package User;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameRegex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(nameRegex);

        System.out.println("Enter the first name : ");
        String firstName = sc.nextLine();
        Matcher firstNameMatcher = pattern.matcher(firstName);

        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();
        Matcher lastNameMatcher = pattern.matcher(lastName);

        if(firstNameMatcher.matches()){
            System.out.println("First Name : "+firstName);
        }
        else {
            System.out.println("Invalid first name..!");
        }
        if(lastNameMatcher.matches()){
            System.out.println("Last Name : "+firstName);
        }
        else {
            System.out.println("Invalid last name..!");
        }
    }
}
