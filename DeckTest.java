import java.util.Scanner;

public class DeckTest {
    public static void main(String[] args) {
        Deck testDeck = new Deck();
        Scanner keyboard = new Scanner(System.in);
        //int index;
        int stop = 0;
        
        System.out.println("Enter deck index, or 'stop' to end program: ");
        while (stop == 0) {
            String input = keyboard.nextLine();
            if (input.matches("\\d+")) {
                if (Integer.parseInt(input) >= 52) {
                    System.out.println("Input must be less than 52!");
                } else {
                    System.out.println(testDeck.getCard(Integer.parseInt(input)));
                }
            } else if (input.toLowerCase().equals("stop")) {
                ++stop;
            }  else {
                System.out.println("Input must be a positive integer!");
            }
        }

        keyboard.close();
    }
}