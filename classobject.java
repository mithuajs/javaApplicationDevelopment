
// user thaki input nibo and sum of 1 to n print korbo.
// import java.util.Scanner;

// class Student {
//     String name;

//     void setName(String n) {
//         name = n;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//     }
// }

// public class classobject {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Student s1 = new Student();

//         System.out.print("Enter name: ");
//         String name = sc.nextLine();

//         s1.setName(name);
//         s1.display();
//     }
// }


// inline input and output

class Student {
    String name;

    void display() {
        System.out.println("Name: " + name);
    }
}

public class classobject {
    public static void main(String[] args) {
        Student s1 = new Student(); // Object create
        s1.name = "Mithu";
        Student s2 = new Student();
        s2.name = "jahid";

        s1.display(); // Method call
        s2.display(); // Method call
    }
}