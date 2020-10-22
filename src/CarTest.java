/**
 * CarTest
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        booleanAssertEquals("Test startEngine: wrong key", false, car.startEngine("1234"));
        booleanAssertEquals("Test startEngine: correct key", true, car.startEngine("ssg5OjMoG4"));
        booleanAssertEquals("Test stopEngine", false, car.stopEngine());
    }

    public static void booleanAssertEquals(String name, boolean expected, boolean actual) {
        String result = (expected == actual) ? "PASS" : "FAIL";
        System.out.println(String.format("%s - %s", name, result));
    }
}
