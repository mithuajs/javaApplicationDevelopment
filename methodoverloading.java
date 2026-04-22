// user input and method overloading

// import java.util.Scanner;

// class MathOperation {

//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// public class methodoverloading {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         MathOperation obj = new MathOperation();

//         System.out.print("Enter 1st numbers: ");
//         int a = sc.nextInt();
//         System.out.print("Enter 2nd number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter 3rd number: ");
//         int c = sc.nextInt();

//         System.out.println("Sum (2 numbers): " + obj.add(a, b));
//         System.out.println("Sum (3 numbers): " + obj.add(a, b, c));
//     }
// }

// inline input and output

class  mithu {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
         mithu obj = new mithu();

        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));
    }
}

// output
// 15   
// 30