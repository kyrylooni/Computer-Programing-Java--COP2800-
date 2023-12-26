import java.security.SecureRandom;

public class RollDice {

    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7]; // array of frequency counters

        // roll a die 60,000,000 times; use die values as frequency index
        for (int roll = 1; roll <= 50; roll++) {
            ++frequency[1+ randomNumbers.nextInt(3)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%16d%n", face, frequency[face]);
        }
    }
}
