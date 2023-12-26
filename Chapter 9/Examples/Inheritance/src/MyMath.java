public class MyMath  extends SimpleMath {
    public static void main(String[] args) {
        int a = 20, b = 15;
        MyMath firstMath = new MyMath();
        firstMath.Multiply(a,b);
        firstMath.Modulus(a,b);
        firstMath.addition(a,b);

    }


    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers: " + z);
    }
}
