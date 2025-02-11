import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();
        {
            System.out.println("Choose a mail delivery method");
            System.out.println("1 - DHL");
            System.out.println("2 - Email");
            System.out.println("3 - Pigeon");
            int choice = scanner.nextInt();
            scanner.close();

            switch (choice) {
                case 1:
                    MailDeliveryService service = new DHL();
                    break;
                case 2:  service = new Email();
                    break;
                case 3:
                    service = new Pigeon();
                    break;

            }
        }
    }
}



