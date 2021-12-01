import javax.swing.*;


public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton ConvertButton;
    private JLabel farhenheitLabel;

    public CelsiusConverterGUI(String title) {
        //call JFrame construtor
        super(title);
        // ctrl click the method to see what it does, too long to explain here
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set panel to mainPanel
        this.setContentPane(mainPanel);
        ConvertButton.addActionListener(e -> {
            // grab the text from the celsiusTextField
            //convert to a Double
            //update the farhenheitLabel
            int tempFahr =(int)((Double.parseDouble(celsiusTextField.getText())) * 1.8 + 32);
            farhenheitLabel.setText((tempFahr + "Fahrenheit"));
        });
    }

    public static void main(String[] args){
        JFrame frame = new CelsiusConverterGUI("My Celsius Converter");
        frame.setVisible(true);
        //set size of the frame
        frame.setSize(300,200);
    }
}
