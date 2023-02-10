import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner AgeInput = new Scanner(System.in);
        int UserAge;

        System.out.println("Welcome to the theater");
        System.out.print("Please Enter your age: 22 ");
        UserAge = 22;

        if (UserAge >= 21) {
            System.out.println("You got a wrist band!");
        if (UserAge<21)    {
            System.out.println("you are underage and do not get Wristband");
        }
        }
    }
}
