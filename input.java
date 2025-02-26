import java.util.Scanner;
public class input {
    public static void main(String[] args){
        System.out.println("Talking Input for the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one");
        int a = sc.nextInt();
        System.out.println("Enter number two");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}