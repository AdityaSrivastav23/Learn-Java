import java.util.Scanner;

public class Area_of_Right_Triangle {
    public static void main(String args[]) {
        float Base, Height, Area;
        System.out.println("Let Us Calculate The Area of Right Triangle! ");
        System.out.println("Enter The Base of The Triangle: ");
        Scanner sc = new Scanner(System.in);
        Base = sc.nextFloat();
        System.out.println("Enter The Height of The Triangle: ");
        Height = sc.nextFloat();
        Area = Base * Height * 0.5f;
        System.out.println("Area of Triangle is :-  "+ Area);

    }

}
