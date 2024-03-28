//20040968D Dinesh Gautam
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopWatch extends JFrame implements Runnable, ActionListener {
    private TextField tfSecond, tfMinute;
    private Label lbSecond, lbMinute;
    private Button btStart, btStop, btReset, btMyName;
    private Thread clockThread = null;
    private int second, minute;
    private JPanel p1, p2;

    public static void main(String[] args) {
        StopWatch frame = new StopWatch();
        frame.setTitle("StopWatch!");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Constructor for setting up UI and add event listeners
    public StopWatch() {
        setLayout(new GridLayout(2, 1, 0, 0));
        p1 = new JPanel();
        p2 = new JPanel();
        add(p1);
        add(p2);

        lbMinute = new Label("Minute:");
        lbSecond = new Label("Second:");
        tfMinute = new TextField(2);
        tfSecond = new TextField(2);
        btStart = new Button("Start");
        btStop = new Button("Stop");
        btReset = new Button("Reset");
        btMyName = new Button("DINESH Gautam");

        p1.add(lbMinute);
        p1.add(tfMinute);
        p1.add(lbSecond);
        p1.add(tfSecond);
        p1.add(btStart);
        p1.add(btStop);
        p1.add(btReset);
        p2.add(btMyName);

        btStart.addActionListener(this);
        btStop.addActionListener(this);
        btReset.addActionListener(this);

        tfMinute.setText(String.valueOf(minute));
        tfSecond.setText(String.valueOf(second));
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                Thread.sleep(1000); // Sleep for 1 second
                timeTick(); // Increment time
                SwingUtilities.invokeLater(() -> { // Update GUI
                    tfMinute.setText(String.valueOf(minute));
                    tfSecond.setText(String.valueOf(second));
                });
            }
        } catch (InterruptedException e) {
            // Thread interrupted
        }
    }

    // This method will be called when any of the buttons in the GUI is pressed.
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btStart) {
            if (clockThread == null) { // Start the clock thread only if not already running
                clockThread = new Thread(this);
                clockThread.start();
            }
        } else if (e.getSource() == btStop) {
            if (clockThread != null) { // Interrupt the clock thread to stop it
                clockThread.interrupt();
                clockThread = null;
            }
        } else if (e.getSource() == btReset) {
            reset();
        }
    }

    private void timeTick() {
        second = (second + 1) % 60;
        if (second == 0)
            minute = (minute + 1) % 60;
    }

    private void reset() {
        second = 0;
        minute = 0;
        tfMinute.setText("0");
        tfSecond.setText("0");
        if (clockThread != null) { // If clock is running, interrupt it to reset
            clockThread.interrupt();
            clockThread = new Thread(this); // Start a new thread for the reset clock
            clockThread.start();
        }
    }
}
