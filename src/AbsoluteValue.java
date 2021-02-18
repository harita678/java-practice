import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b = -1;
        System.out.println("enter the value of a: ");
        a= sc.nextInt();
        if (a < 0){
            a = a * b;
            System.out.println("New value of a: "+ a);
        }
        else
        {
            System.out.println("Original value of a: "+a);
        }
    }
}
