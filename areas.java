import java.util.Scanner;

public class  areas {
    public static void main(String[] args) {
        Scanner mithu = new Scanner(System.in);

        double r,area;
        System.out.print("Enter radius : "); 
        r = mithu.nextDouble();

        area = 3.14 * r * r;
        System.out.println("Area of circle is : " + area);
    }
}


//output
// Enter radius : 5 
// Area of circle is : 78.5