import java.util.Scanner;
public class perctage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1: ");
        int a = sc.nextInt();
        System.out.println("Enter the marks of subject 2: ");
        int b = sc.nextInt();
        System.out.println("Enter the marks of subject 3: ");
        int c = sc.nextInt();
        System.out.println("Enter the marks of subject 4: ");
        int d = sc.nextInt();
        System.out.println("Enter the marks of subject 5: ");
        int f = sc.nextInt();

        int total = a+ b+ c+ d+ f;
        System.out.println(total);

        float perctage = (total*100)/500;
        System.out.println(perctage);

    }
    
}
