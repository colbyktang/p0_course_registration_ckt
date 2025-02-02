package src.com.revature.main;
import java.util.Scanner;

import src.com.revature.user.Student;

public class Main {
    public static void main (String[] args) {
        System.out.println(
            "Welcome to Course Registration by Colby Tang!"
        );
        boolean isLoggedIn = false;
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (!isLoggedIn) {
                LoginMenu();
                System.out.println(
                    "Please choose an option: "
                );
                input = scanner.nextLine();
                switch (input) {
                    case "1":
                        isLoggedIn = true;
                        break;
                    case "2":
                        break;
                    case "3":
                        scanner.close();
                        return;
                }
            }
            else {

            }
        }
    }

    public static void LoginMenu () {
        System.out.println("Login Menu");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
    }

    public static void StudentMenu () {
        System.out.println("Student Menu");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
    }

    public static void FacultyMenu () {
        System.out.println("Faculty Menu");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
    }
}

/*
 * Minimum features
 * Use of custom data structures (do not use java.util Collection types!)
 * Basic validation of user input (e.g. no registration for classes outside of registration window, no negative deposits/withdrawals, no overdrafting, etc.)
 * Unit tests for all business-logic classes
 * All exceptions are properly caught and handled
 * Proper use of OOP principles
 * Documentation (all classes and methods have basic documentation)
 * Database is 3rd Normal Form Compliant
 * Referential integrity (e.g. if a class is removed from the catalog, no students should be registered for it)
 * Logging messages and exceptions to a file using a custom logger
 * Generation of basic design documents (e.g. relational diagram, class diagram, flows, etc.)
 */

/*
 *  As any kind of user, I can:
    - login with my existing credentials

    As a faculty member I can:
    - add new classes to the registration catalog
    - change the registration details for a class
    - remove a class from the registration catalog (this should unregister all registered students)
    
    As a student, I can:
    - register a new account with the system (must be secured with a password)
    - view classes available for registration
    - register for an open and available class
    - cancel my registration for a class (if within window)
    - view the classes that I have registered for
 */