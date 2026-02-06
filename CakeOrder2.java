import java.util.Scanner;

public class CakeOrder2 {
    static Scanner scan = new Scanner(System.in);

    public static String selectFlavor() {
        String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Lemon", "Red Velvet"};

        for (int i = 0; i < flavors.length; i++)
        {
            System.out.println("Press " + (i + 1) + " for " + flavors[i]);
        }
        while (true) {
            System.out.print("Enter a flavor number: ");
            int choice = scan.nextInt();

            if (choice >= 1 && choice <= flavors.length) {
                return flavors[choice - 1];

            }
        }
    }

    public static void main(String[]args) {
        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.println("Press 3 to order Pudding");
        System.out.print("Enter an option: " );

        int option = scan.nextInt();
        System.out.println();

        if (option == 1) {

            String flavor = selectFlavor();
            System.out.println();

            scan.nextLine();
            System.out.print("Enter a message: ");
            String message = scan.nextLine();

            System.out.print("How many pounds: ");
            double pound = scan.nextDouble();
            System.out.println();

            BirthdayCake cake = new BirthdayCake(message, pound, flavor, 350);

            System.out.println(cake.toString());

        } else if (option == 2) {
            String flavor = selectFlavor();
            System.out.println();

            System.out.print("How many pieces: ");
            int pieces = scan.nextInt();

            CupCake cupcake = new CupCake(pieces, flavor, 70);

            System.out.println(cupcake.toString());

        }
        else if (option == 3) {

            String flavor = selectFlavor();
            System.out.println();

            System.out.print("How many cups: ");
            int cup = scan.nextInt();

            Pudding pudding = new Pudding(cup, flavor, 70);

            System.out.println(pudding.toString());
        }
        else {
            System.out.println("Wrong option!! Try again!!");
        }
    }
}
