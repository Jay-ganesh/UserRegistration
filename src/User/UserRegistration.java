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
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches()){
            System.out.println("First Name : "+firstName);
        }
        else {
            System.out.println("Invalid name..!");
        }
    }
}
