import java.util.Scanner;

public class CostCatering
{
    public static void main(String[] args) {
        int numOfGuests = 22;
        int inputGuest;
        final int PRICE_PER_PERSON = 35;
        int totalprice;
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the number of guests you are expecting>>");
        inputGuest = in.nextInt();
        System.out.println("We have " + inputGuest + " guests");
        totalprice = inputGuest * PRICE_PER_PERSON;
        System.out.println("The total cost of the event is $: " + totalprice);

    }
}