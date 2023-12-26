/*

public class Test {
    public static void main(String[] args) {
        int x = 10;

        while ( x < 20 ) {
            System.out.print("Value of x: " + x);
            x++;
            System.out.println();
        }
    }
}
*/

/*
public class Test {
    public static void main(String[] args) {
        int x = 10;

        do
        {
            System.out.print("Value of x : " + x );
            x++;
            System.out.println();
        } while (x < 20 );
    }
}
 */
/*
public class Test {
    public static void main(String[] args) {

        for (int x = 10; x < 20; x++) {
            System.out.print("Value of x: " + x);
            System.out.println();
        }
    }
}

*/
public class Test {
    public static void main(String[] args) {
        for(int a = 1; a < 10; a++) {
            if (a == 5 ) {
                continue;
            }
            System.out.print(a + " ");
        }
    }
}

