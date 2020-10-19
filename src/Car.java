/**
 * Car
 */
public class Car {
    static boolean active = false;
    public static void main(String[] args) {
        
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