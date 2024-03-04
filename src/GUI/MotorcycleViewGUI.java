package GUI;
import Controller.MotorcycleController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MotorcycleViewGUI extends JFrame {
    private JLabel brandLabel, markLabel, priceLabel;
    private JTextField brandField, markField, priceField;
    private JButton updateButton;
    private MotorcycleController controller;

    public MotorcycleViewGUI(MotorcycleController controller) {
        this.controller = controller;
        setTitle("Motorcycle Details");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        setLayout(new GridLayout(4, 2));

        add(brandLabel);
        add(brandField);
        add(markLabel);
        add(markField);
        add(priceLabel);
        add(priceField);
        add(new JLabel()); // Placeholder for spacing
        add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String brand = brandField.getText();
                String mark = markField.getText();
                double price = Double.parseDouble(priceField.getText());

                controller.setMotorcycleBrand(brand);
                controller.setMotorcycleMark(mark);
                controller.setMotorcyclePrice(price);
                controller.updateView();
            }
        });

        setVisible(true);
    }

    private void initComponents() {
        brandLabel = new JLabel("Brand:");
        markLabel = new JLabel("Model:");
        priceLabel = new JLabel("Price:");

        brandField = new JTextField(controller.getMotorcycleBrand());
        markField = new JTextField(controller.getMotorcycleMark());
        priceField = new JTextField(String.valueOf(controller.getMotorcyclePrice()));

        updateButton = new JButton("Update");
    }
}
