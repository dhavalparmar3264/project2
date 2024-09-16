import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your ESE Marks: ");
        int marks = sc.nextInt();

        if (marks >= 23 && marks <= 27) {
            System.out.println("DD");
        } else if (marks >= 28 && marks <= 34) {
            System.out.println("CD");
        } else if (marks >= 35 && marks <= 41) {
            System.out.println("CC");
        } else if (marks >= 42 && marks <= 48) {
            System.out.println("BC");
        } else if (marks >= 49 && marks <= 55) {
            System.out.println("BB");
        } else if (marks >= 56 && marks <= 62) {
            System.out.println("AB");
        } else if (marks >= 63 && marks <= 70) {
            System.out.println("AA");
        } else if (marks < 23) {
            System.out.println("Sorry You're Fail!");
        } else {
            System.out.println("Invalid Marks");
        }
    }
}