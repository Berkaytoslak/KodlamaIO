import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        Student student = new Student();
        if (id.equals(student.login1.getId()) && password.equals(student.login1.getPassword())) {
            FirstMenu firstMenu = new FirstMenu();
            firstMenu.FirstMenuShow();
        } else System.out.println("Şifre veya ID yanlış...");
    }
}
