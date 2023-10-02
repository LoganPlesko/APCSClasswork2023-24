/* Logan Plesko, AP CS Fall 2023
This program takes your input and tells you if it is odd,even,or neither. */


import java.util.Scanner; //Chat GPT

public class OddOrEven {
    public static void main(String[] args) {
        while (true) { // Owen minami
            Scanner scanner = new Scanner(System.in); //Chat GPT
            System.out.println("Please enter an integer!");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number % 2 == 0) {
                    System.out.println(number + " is Even");
                } else {
                    System.out.println(number + " is Odd");
                }
            } else {
                System.out.println("That is not an integer");
            }
            
            try { // Owen Minami found this on ChatGPT
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}