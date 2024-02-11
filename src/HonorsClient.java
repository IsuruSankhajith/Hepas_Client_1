import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.rmi.Naming;
import java.util.concurrent.CompletableFuture;

public class HonorsClient {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainForm mainForm = new MainForm();
            JFrame frame = new JFrame("Honors Client");
//            frame.setLocationRelativeTo(frame);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(mainForm);
            frame.pack();
            frame.setSize(1000, 600);
            frame.setVisible(true);
        });
    }
}
