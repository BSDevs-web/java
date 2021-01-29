import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        int num = Integer.parseInt(sacn.nextLine());
        if (num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
}
