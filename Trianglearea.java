import java.util.Scanner;
public class Trianglearea {
    public static void main(String[] args) {
        Scanner mithu = new Scanner(System.in);
        double base, height, area;
        System.out.print("Enter base : ");
        base = mithu.nextDouble();
        System.out.print("Enter height : ");
        height = mithu.nextDouble();
        area = 0.5 * base * height;
        System.out.println("Area of triangle is : " + area);
        
    }
    
}

//output
// Enter base : 10  
// Enter height : 20
// Area of triangle is : 100.0  

