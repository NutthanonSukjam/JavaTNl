import javax.swing.JOptionPane;

public class CakeOrder3 {

    public static void main(String[] args) {


        String poundStr = JOptionPane.showInputDialog(
                null,
                "How many pounds do you want?",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );
        if (poundStr == null) return;

        double pound = Double.parseDouble(poundStr);


        String flavor = JOptionPane.showInputDialog(
                null,
                "Enter a flavor birthday cake:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );
        if (flavor == null) return;


        String message = JOptionPane.showInputDialog(
                null,
                "Enter a message on cake:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );
        if (message == null) return;

        double totalPrice = pound * 400;

        boolean confirmed = false;


        while (!confirmed) {

            int option = JOptionPane.showConfirmDialog(
                    null,
                    "Thank you for your order!\n"
                            + flavor + " birthday cake (message=" + message + ")\n"
                            + "Total price of Birthday Cake = " + totalPrice + "\n\n"
                            + "Confirm this order?",
                    "Select an Option",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );


            if (option == JOptionPane.YES_OPTION) {

                JOptionPane.showMessageDialog(
                        null,
                        "Thank you for your order!\n"
                                + flavor + " birthday cake (message=" + message + ")\n"
                                + "Total price of Birthday Cake = " + totalPrice,
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );

                confirmed = true;
            }

            else if (option == JOptionPane.NO_OPTION) {

                message = JOptionPane.showInputDialog(
                        null,
                        "Enter a new message for changing:",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE
                );

                if (message == null) break;
            }

            else {
                break;
            }
        }
    }
}
