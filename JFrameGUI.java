import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JFrameGUI {
    public static void main(String[] args) {
        System.out.println("JFrame is used to build GUI Java application");
        JFrame jFrame = new JFrame("JFrame Example");

        // to get the input from user: JTextField
        // to display any message to user: JLabel
        // to perform any action by click on the button: JButton

        JLabel userWeightLabel = new JLabel("Enter your weight in kg");
        userWeightLabel.setBounds(150, 50, 300, 30);
        jFrame.add(userWeightLabel);

        JTextField userWeightTextField = new JTextField();
        userWeightTextField.setBounds(150, 80, 200, 30);
        jFrame.add(userWeightTextField);

        JLabel userHeightLabel = new JLabel("Enter your height in m");
        userHeightLabel.setBounds(150, 120, 200, 30);
        jFrame.add(userHeightLabel);

        JTextField userHeightTextField = new JTextField();
        userHeightTextField.setBounds(150, 150, 200, 30);
        jFrame.add(userHeightTextField);

        JButton calculatebmi = new JButton("Calculate BMI");
        calculatebmi.setBounds(150, 190, 200, 30);
        jFrame.add(calculatebmi);

        JLabel bmiLabel = new JLabel("Your BMI is: ");
        bmiLabel.setBounds(150, 230, 200, 30);
        jFrame.add(bmiLabel);

        calculatebmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                float weight = Float.parseFloat(userWeightTextField.getText());
                float height = Float.parseFloat(userHeightTextField.getText());
                float bmiValue = weight / (height * height);
                if(userHeightLabel.getText().isEmpty() || userWeightLabel.getText().isEmpty()){
                  bmiLabel.setText("Please enter the values");
                  bmiLabel.setForeground(Color.RED);
                  return;
                }
                else if(bmiValue<18.5){
                  bmiLabel.setText("You are very Underweight");
                  bmiLabel.setForeground(Color.RED);
                }
                else if(bmiValue>18.5 && bmiValue<24.9){
                  bmiLabel.setText("You are Normal");
                  bmiLabel.setForeground(Color.GREEN);
                }
                else if(bmiValue>24.9 && bmiValue<29.9){
                  bmiLabel.setText("You are Overweight");
                  bmiLabel.setForeground(Color.ORANGE);
                }
                else{
                  bmiLabel.setText("You are Obese");
                  bmiLabel.setForeground(Color.RED);
                }
            }
        });

        jFrame.setLayout(null);

        // to add the size in frame
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}