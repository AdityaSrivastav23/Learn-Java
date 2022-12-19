import java.util.Scanner;

public class Area_of_Tri {
    public static void main(String args[]) {
        int A, B, C;
        double S, Area;
        System.out.println("Let Us Calculate The Area of Right Triangle! ");
        System.out.println("Enter The Length of A: ");
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        System.out.println("Enter The Length of B: ");
        B = sc.nextInt();
        System.out.println("Enter The Length of C: ");
        C = sc.nextInt();
        S = (A + B + C) / 2f;
        Area = Math.sqrt(S * (S - A) * (S - B) * (S - C));
        System.out.println("Area of The Triangle is " + Area);

    }
}