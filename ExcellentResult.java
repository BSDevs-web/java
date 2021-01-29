import java.util.Scanner;


public class ExcellentResult {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        switch (grade){
            case 5, 6:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Nothing");
                break;
        }
    }
}
