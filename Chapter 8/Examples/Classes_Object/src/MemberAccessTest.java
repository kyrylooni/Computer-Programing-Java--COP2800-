public class MemberAccessTest {
    public static void main(String[] args) {

        Time1 time = new Time1(); // create and initialize Time1 object
        Time1 time2 = new Time1();

        //time.hour = 7; // error: hour has private access in Time1
        //time.minute = 15; // error: minute has private access in Time1
        //time.second = 30; // error: second has private access in Time1

        time2.setTime(19, 22, 21);
        TestTime1.displayTime("My times are ", time2);
    }
}
