// /// user input to create an object and then create another object using copy constructor and display both objects

// import java.util.Scanner;

// class Student {
//     String name;
//     int age;

//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }

//     Student(Student s) {
//         name = s.name;
//         age = s.age;
//     }

//     void display() {
//         System.out.println(name + " " + age);
//     }
// }

// public class COPPYCONSTRUCTOR {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();

//         Student s1 = new Student(name, age);
//         Student s2 = new Student(s1);

//         s1.display();
//         s2.display();
//     }
// }
 

// inline input and output

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student("MITHU", 19);
        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}


// jodi run na kore tahoile terminal e ai 2ta commend dile hoibe 
// javac copyconstructor.java
// java copyconstructor