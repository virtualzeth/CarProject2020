import java.util.*;

/**
 * Car
 */
public class Car {
    String name = "Default - car";
    boolean active = false;
    int currentSpeed = 0;
    String gear = "N";

    static Scanner sc = new Scanner(System.in);

    public boolean startEngine(String keyCode) {
        this.active = (keyCode.equals("ssg5OjMoG4")) ? true : false;
        return this.active;
    }

    public boolean stopEngine() {
        this.active = false;
        return this.active;
    }

    public String changeGear(String newGear) {
        return this.gear;
    }

    public void userInterface() {
        boolean gate = true;
        while (gate) {
            System.out.println("Start engine (cmd: start");
            System.out.println("Check current speed (cmd: speed)");
            System.out.println("Exit (cmd: exit)\n");
            String input = sc.next().toLowerCase();

            if (input.equals("exit")) {
                gate = false;
            } else if (input.equals("start")) {
                System.out.println("Please enter password:");
                String password = sc.next();
                this.startEngine(password);
                String msg = (this.active) ? "> The engine is on" : "> Incorrect password!";
                System.out.println(msg + "\n");
            } else if (input.equals("speed")) {
                System.out.println(String.format("The cars current speed: %s km/t\n", this.currentSpeed));
            } else {
                System.out.println("Input error - try again..");
            }
        }
    }
}