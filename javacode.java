import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // Preset username and password
        String validUsername = "adminastrator123";
        String validPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(validUsername) && inputPassword.equals(validPassword)) {
            System.out.println("Login successful. Welcome, " + inputUsername + "!");
        }
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
