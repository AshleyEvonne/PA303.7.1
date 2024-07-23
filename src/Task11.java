import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");

        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.println(amount);

        String[] favs = new String[amount];

        for (int i = 0; i < amount; i++){
            System.out.println("Enter you thing: " +(i + 1) + ":");
            favs[i] = scanner.nextLine();
        }

        System.out.println("Your favorite things are : ");

        for (String thing : favs){
            System.out.print(thing + " ");
        }
        scanner.close();

    }
}
