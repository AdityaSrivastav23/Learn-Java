import java.util.Scanner;

public class Quadric_Equation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        System.out.println("Enter The Value of A:-");
        a=sc.nextInt();
        System.out.println("Enter The Value of B:-");
        b=sc.nextInt();
        System.out.println("Enter The Value of C:-");
        c=sc.nextInt();
        r1=((-b+ Math.sqrt((b*b)-4*a*c))/(2*a));
        r2=((-b- Math.sqrt((b*b)-4*a*c))/(2*a));
        System.out.println("The Value of r1 is "+r1);
        System.out.println("The Value of r2 is "+r2);

    }
    
}
