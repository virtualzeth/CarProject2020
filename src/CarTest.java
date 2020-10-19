/**
 * CarTest
 */
public class CarTest {
    public static void main(String[] args) {
        booleanAssertEquals("Test startEngine: wrong key", false, Car.startEngine("1234"));
        booleanAssertEquals("Test startEngine: correct key", true, Car.startEngine("ssg5OjMoG4"));
        booleanAssertEquals("Test stopEngine", false, Car.stopEngine());
    }
    public static void booleanAssertEquals(String name, boolean expected, boolean actual) {
        String result = (expected == actual) ? "PASS" : "FAIL";
        System.out.println(String.format("%s - %s", name, result));
    }
}
