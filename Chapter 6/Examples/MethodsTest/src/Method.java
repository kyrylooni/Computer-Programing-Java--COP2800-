public class Method {

    // modifier (public static)  return value type (int)    method name (max)

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = 5;
        int j = 89;
        int k = max(i, j);
        System.out.println(k);
    }
}

