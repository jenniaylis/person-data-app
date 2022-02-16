import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PersonData {

    JPanel textPanel, panelForTextFields;
    JLabel titleLabel, nameLabel, ageLabel, streetLabel, postcodeLabel, cityLabel;
    JTextField nameField, ageField, streetField, postcodeField, cityField;
    JButton submitButton;
    static ArrayList<Person> persones = new ArrayList<Person>();

    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
        totalGUI.setBackground(new Color(175,238,238));

        titleLabel = new JLabel("Add new person");
        titleLabel.setLocation(0,0);
        titleLabel.setSize(290, 30);
        titleLabel.setHorizontalAlignment(0);
        totalGUI.add(titleLabel);

        // Label Panel Container
        textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setLocation(10, 35);
        textPanel.setSize(70, 200);
        textPanel.setBackground(new Color(175,238,238));
        totalGUI.add(textPanel);

        // Name Label
        nameLabel = new JLabel("Name");
        nameLabel.setLocation(0, 0);
        nameLabel.setSize(70, 40);
        nameLabel.setHorizontalAlignment(4);
        textPanel.add(nameLabel);

        // Age Label
        ageLabel = new JLabel("Age");
        ageLabel.setLocation(0, 40);
        ageLabel.setSize(70, 40);
        ageLabel.setHorizontalAlignment(4);
        textPanel.add(ageLabel);

        // Street Label
        streetLabel = new JLabel("Street");
        streetLabel.setLocation(0, 80);
        streetLabel.setSize(70, 40);
        streetLabel.setHorizontalAlignment(4);
        textPanel.add(streetLabel);

        // Postcode Label
        postcodeLabel = new JLabel("Postcode");
        postcodeLabel.setLocation(0, 120);
        postcodeLabel.setSize(70, 40);
        postcodeLabel.setHorizontalAlignment(4);
        textPanel.add(postcodeLabel);

        // City Label
        cityLabel = new JLabel("City");
        cityLabel.setLocation(0, 160);
        cityLabel.setSize(70, 40);
        cityLabel.setHorizontalAlignment(4);
        textPanel.add(cityLabel);

        // TextFields Panel Container
        panelForTextFields = new JPanel();
        panelForTextFields.setLayout(null);
        panelForTextFields.setLocation(110, 40);
        panelForTextFields.setSize(100, 200);
        panelForTextFields.setBackground(new Color(175,238,238));
        totalGUI.add(panelForTextFields);

        // Name Textfield
        nameField = new JTextField(8);
        nameField.setLocation(0, 0);
        nameField.setSize(100, 30);
        panelForTextFields.add(nameField);

        // Age Textfield
        ageField = new JTextField(8);
        ageField.setLocation(0, 40);
        ageField.setSize(100, 30);
        panelForTextFields.add(ageField);

        // Street Textfield
        streetField = new JTextField(8);
        streetField.setLocation(0, 80);
        streetField.setSize(100, 30);
        panelForTextFields.add(streetField);

        // Postcode Textfield
        postcodeField = new JTextField(8);
        postcodeField.setLocation(0, 120);
        postcodeField.setSize(100, 30);
        panelForTextFields.add(postcodeField);

        // City Textfield
        cityField = new JTextField(8);
        cityField.setLocation(0, 160);
        cityField.setSize(100, 30);
        panelForTextFields.add(cityField);

        // Button for Submitting the information given
        submitButton = new JButton("Submit");
        submitButton.setLocation(130, 240);
        submitButton.setSize(80, 30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int postcode, age;
                age=20;
                postcode = 89; // (dont know, how to turn this textfield into integer value...)
                Address newAddress = new Address(streetField.toString(), postcode, cityField.toString());
                persones.add(new Person(nameField.toString(), age, newAddress));
            }
        });
        totalGUI.add(submitButton);

        totalGUI.setOpaque(true);    
        return totalGUI;
    }
    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Person Form App");

        PersonData demo = new PersonData();
        frame.setContentPane(demo.createContentPane());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
    public static void main( String args[] ){
        createAndShowGUI();
    }
}