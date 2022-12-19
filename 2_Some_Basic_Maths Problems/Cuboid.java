import java.util.Scanner;

public class Cuboid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length,breadth,height;
        int volume,total_area;
        System.out.println("Enter the Lenght of Cuboid:- ");
        length=sc.nextInt();
        System.out.println("Enter the breadth of Cuboid:- ");
        breadth=sc.nextInt();
        System.out.println("Enter the height of Cuboid:- ");
        height=sc.nextInt();
        total_area=2*((length*breadth)+(length*height)+(breadth*height));
        volume=length*breadth*height;
        System.out.println("The Total Volume of The Cuboid is:- "+volume);
        System.out.println("The Total Surface Area of Cuboid is:- "+total_area);



    }
}
