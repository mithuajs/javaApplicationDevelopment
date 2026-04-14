import java.util.Scanner;
public class rectanglearea {
    public static void main(String[] args) {
        Scanner mithu = new Scanner(System.in);
        double length, width, area;
        System.out.print("Enter length : ");
        length = mithu.nextDouble();
        System.out.print("Enter width : ");
        width = mithu.nextDouble();
        area = length * width;
        System.out.println("Area of rectangle is : " + area);
    }
}


//output
// Enter length : 10
// Enter width : 20
// Area of rectangle is : 200.0