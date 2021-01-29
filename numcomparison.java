import java.util.Scanner;

public class numcomparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.next());
        int num2 = Integer.parseInt(scan.next());

        if (num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
