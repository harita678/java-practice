//Program to know how to use brake in java
import java.util.Scanner;

public class TestWhileLoop1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Give a Number: ");
            int a = Integer.valueOf(sc.nextLine());
            if(a == 4){
                break;
            }
        }
        System.out.println("Good Bye");
    }
}
