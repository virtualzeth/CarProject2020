import java.util.*;
/**
 * Car
 */
public class Car {
    static Scanner sc = new Scanner(System.in);

    private static boolean active = false;
    static int currentSpeed = 0;

    public static void userInterface() {
        boolean gate = true;
        while(gate) {
            System.out.println("Check current speed (cmd: exit)");
            System.out.println("Exit (cmd: exit)");
            String input = sc.next().toLowerCase();

            if(input.equals("exit")) {
                gate = false;
            } else if(input.equals("speed")) {
                System.out.println(String.format("The cars current speed: %i km/t", currentSpeed));
            } else {
                System.out.println("Input error - try again..");
            }
        }
    }
    public static boolean startEngine(String keyCode) {
        active = (keyCode == "ssg5OjMoG4") ? true : false;
        return active;
    }
    public static boolean stopEngine() {
        active = false;
        return active;
    }
}