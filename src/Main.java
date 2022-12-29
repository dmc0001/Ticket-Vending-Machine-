import java.awt.*;
import javax.swing.*;

public class Main extends JFrame  {

    private JTextField ticketPriceField;
    private JTextField ticketQuantityField;
    private JTextField paymentField;
    private JButton purchaseButton;
    private JLabel ticketPriceLabel;
    private JLabel ticketQuantityLabel;
    private JLabel paymentLabel;
    private JLabel balanceLabel;
    private JLabel ticketsRemainingLabel;

    public Main() {
// Set the title and layout
        setTitle("Ticket Vending Machine");
        setLayout(new FlowLayout());

        // Initialize variables
        ticketPriceField = new JTextField(5);
        ticketQuantityField = new JTextField(5);
        paymentField = new JTextField(5);
        purchaseButton = new JButton("Purchase");
        ticketPriceLabel = new JLabel("Ticket price:");
        ticketQuantityLabel = new JLabel("Ticket quantity:");
        paymentLabel = new JLabel("Payment:");
        balanceLabel = new JLabel("Balance: 0");
        ticketsRemainingLabel = new JLabel("Tickets remaining: 10");

        // Add components to the frame
        add(ticketPriceLabel);
        add(ticketPriceField);
        add(ticketQuantityLabel);
        add(ticketQuantityField);
        add(paymentLabel);
        add(paymentField);
        add(purchaseButton);
        add(balanceLabel);
        add(ticketsRemainingLabel);

        // Set the size and visibility of the frame
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}