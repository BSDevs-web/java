import java.util.Scanner;
public class Fruit_Shop {
    public static void main(String[] args) {

        double banana = 2.50;
        double apple = 1.20;
        double orange = 0.85;
        double grapefruit = 1.45;
        double kiwi = 2.70;
        double pineapple = 5.50;
        double grapes = 3.85;

        Scanner scan = new Scanner(System.in);
        System.out.print("Choose fruit: ");
        String fruits = scan.nextLine();
        System.out.print("Choose day: ");
        String day = scan.nextLine();
        System.out.print("Enter Amount: ");
        int amount = scan.nextInt();

        switch(day.toLowerCase()){
            case "monday", "tuesday",  "wednesday", "thursday", "friday":

                switch (fruits.toLowerCase()){
                    case "banana":
                        double outout_banana = amount * banana;
                        System.out.printf("[INFO] Price: %.2f BGN", outout_banana);
                        break;
                    case "apple":
                        double output_apple = amount * apple;
                        System.out.printf("[INFO] Price: %.2f BGN", output_apple);
                        break;
                    case "orange":
                        double output_orange = amount * orange;
                        System.out.printf("[INFO] Price: %.2f BGN", output_orange);
                        break;
                    case "grapefruit":
                        double  output_grapefruit = amount * grapefruit;
                        System.out.printf("[INFO] Price: %.2f BGN", output_grapefruit);
                        break;
                    case "kiwi":
                        double output_kiwi = amount * kiwi;
                        System.out.printf("[INFO] Price: %.2f BGN", output_kiwi);
                        break;
                    case "pineapple":
                        double output_pineapple = amount * pineapple;
                        System.out.printf("[INFO] Price: ", output_pineapple);
                        break;
                    case "grapes":
                        double output_grapes = amount * grapes;
                        System.out.printf("[INFO] Price: ", output_grapes);
                        break;
                }
                break;
            case "saturday", "sunday":
                switch (fruits.toLowerCase()){
                    case "banana":
                        double outout_banana = amount * (banana + 0.20);
                        System.out.printf("[INFO] Price: %.2f BGN", outout_banana);
                        break;
                    case "apple":
                        double output_apple = amount * (apple + 0.05);
                        System.out.printf("[INFO] Price: %.2f BGN", output_apple);
                        break;
                    case "orange":
                        double output_orange = amount * (orange + 0.05);
                        System.out.printf("[INFO] Price: %.2f BGN", output_orange);
                        break;
                    case "grapefruit":
                        double  output_grapefruit = amount * (grapefruit + 0.15);
                        System.out.printf("[INFO] Price: %.2f BGN", output_grapefruit);
                        break;
                    case "kiwi":
                        double output_kiwi = amount * (kiwi+0.30);
                        System.out.printf("[INFO] Price: %.2f BGN", output_kiwi);
                        break;
                    case "pineapple":
                        double output_pineapple = amount * (pineapple+0.10);
                        System.out.printf("[INFO] Price: ", output_pineapple);
                        break;
                    case "grapes":
                        double output_grapes = amount * (grapes + 0.35);
                        System.out.printf("[INFO] Price: ", output_grapes);
                        break;
                }
                break;
            default:
                System.out.println("[ERROR] Enter a valid day of the week!");
                break;


        }
    }

}
