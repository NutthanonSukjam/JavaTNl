import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor  : ");
        String flavor = scanner.next();
        System.out.print("How many pounds : ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);

        System.out.println(order1);
        System.out.println();
        System.out.println();

        System.out.println("Cup Cake's Details:");
        System.out.print("Enter a flavor  : ");
        flavor = scanner.next();
        System.out.print("How many piece  : ");
        int piece = scanner.nextInt();

        CupCake order2 = new CupCake(piece,flavor,65);

        System.out.println(order2);
        System.out.println();


        System.out.println("Pudding's Details:");
        System.out.print("Enter a flavor  : ");
        flavor = scanner.next();
        System.out.print("How many cup [Get 1 if you buy 10!!!] : ");
        int cup = scanner.nextInt();


        Pudding order3 = new Pudding(cup,flavor,200);
        System.out.println(order3);
        System.out.println();

        System.out.println("Total price = " + (order1.calculateTotalPrice() + order2.calculateTotalPrice() + order3.calculateTotalPrice()));
    }
}
