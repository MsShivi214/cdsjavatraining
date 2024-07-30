import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AdditionGame extends JFrame {
    private JTextField answerField;
    private JLabel questionLabel;
    private JLabel scoreLabel;
    private JLabel timerLabel;
    private int num1;
    private int num2;
    private int score;
    private Timer timer;
    private int timeLeft;

    public AdditionGame() {
        setTitle("Addition Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 1));

        questionLabel = new JLabel("", SwingConstants.CENTER);
        add(questionLabel);

        answerField = new JTextField();
        add(answerField);

        JButton nextButton = new JButton("Next");
        add(nextButton);

        scoreLabel = new JLabel("Score: 0", SwingConstants.CENTER);
        add(scoreLabel);

        timerLabel = new JLabel("Time left: 60", SwingConstants.CENTER);
        add(timerLabel);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                generateQuestion();
                resetTimer();
            }
        });

        generateQuestion();
        startTimer();

        setVisible(true);
    }

    private void generateQuestion() {
        Random rand = new Random();
        num1 = rand.nextInt(100);
        num2 = rand.nextInt(100);
        questionLabel.setText("What is " + num1 + " + " + num2 + "?");
    }

    private void checkAnswer() {
        try {
            int answer = Integer.parseInt(answerField.getText());
            if (answer == (num1 + num2)) {
                score++;
            }
            scoreLabel.setText("Score: " + score);
        } catch (NumberFormatException e) {
            // If the user input is not a valid number, do nothing
        }
        answerField.setText("");
    }

    private void startTimer() {
        timeLeft = 60; // 60 seconds for each round
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                timerLabel.setText("Time left: " + timeLeft);
                if (timeLeft <= 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Time's up! Your score is " + score);
                    System.exit(0);
                }
            }
        });
        timer.start();
    }

    private void resetTimer() {
        timeLeft = 60;
        timer.restart();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdditionGame();
            }
        });
    }
}
