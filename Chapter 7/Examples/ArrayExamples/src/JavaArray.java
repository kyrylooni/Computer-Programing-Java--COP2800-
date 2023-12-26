public class JavaArray {
    public static void main(String[] args) {
        String[] groceries = new String[6];

        groceries[0] = "Fruits";
        groceries[1] = "Vegetables";
        groceries[2] = "Butter";
        groceries[3] = "Drink";
        groceries[4] = "Chips";
        groceries[5] = "Cookies";


        String[] supplies = {"Ink", "Table Pencils", "PrinterPaper", "Network Cables", "DigitalComputer cameras", "Mice" };

        System.out.println("The third element is: " + supplies[2]);

        int sizeOfArray = supplies.length;
        System.out.println("The size of array is: " + sizeOfArray);
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Items [" + i + "] = " + supplies[i]);

        }

        for (String str: groceries) {
            System.out.println(str);
        }
    }
}
