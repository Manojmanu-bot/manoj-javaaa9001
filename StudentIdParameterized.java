class Student {

    // Instance variables
    int id;
    String firstName;
    String lastName;
    double fees;

    // Parameterized constructor
    Student(int id, String firstName, String lastName, double fees) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fees = fees;
    }

    // Method to return full name
    String getName() {
        return firstName + " " + lastName;
    }

    // Method to return fees
    double getFees() {
        return fees;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating 3 Student objects
        Student s1 = new Student(1, "Rahul", "Sharma", 15000.50);
        Student s2 = new Student(2, "Anita", "Kumar", 17000.75);
        Student s3 = new Student(3, "Bharat", "Naik", 20000.00);

        // Printing values
        System.out.println("ID: " + s1.id + " | Name: " + s1.getName() + " | Fees: " + s1.getFees());
        System.out.println("ID: " + s2.id + " | Name: " + s2.getName() + " | Fees: " + s2.getFees());
        System.out.println("ID: " + s3.id + " | Name: " + s3.getName() + " | Fees: " + s3.getFees());
    }
}