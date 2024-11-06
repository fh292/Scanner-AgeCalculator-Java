//Import Required Classes:
import java.util.Calendar;
import java.util.Scanner;

//Create a Class Named Main:
public class Main {

    //Define the Main Method:
    public static void main(String[] args) {
        //Prompt User for Birth Date:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the birth year: ");
        int birthYear = scanner.nextInt();

        System.out.println("Enter the birth month: ");
        int birthMonth = scanner.nextInt();

        System.out.println("Enter the birth day: ");
        int birthDay = scanner.nextInt();

        //Retrieve the Current Date:
        Calendar calendar = Calendar.getInstance();

        //Set User's Birth Date in Calendar Object:
        Calendar userBirthDate = Calendar.getInstance();
        userBirthDate.set(Calendar.YEAR, birthYear);
        userBirthDate.set(Calendar.MONTH, birthMonth);
        userBirthDate.set(Calendar.DAY_OF_MONTH, birthDay);

        //Calculate the Age:
        int age = calendar.get(Calendar.YEAR) - birthYear;

        //Display the Calculated Age:
        System.out.println("The age is " + age);

        //Close the Scanner:
        scanner.close();

    }
}