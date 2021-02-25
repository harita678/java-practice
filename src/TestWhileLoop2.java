import java.util.Scanner;

public class TestWhileLoop2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter a number: ");

            int a = Integer.valueOf(sc.nextLine());
            if(a<=0){
                System.out.println("invalid number");
                continue; 
            }
            System.out.println("correct number!!!");
            break;
        }
    }
}
