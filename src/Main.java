import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JSpinner");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 100, height = 100;
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
        JPanel panel = new JPanel ();
        JLabel label = new JLabel("0");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton button = new JButton("Ответить");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        JSpinner spinner = new JSpinner();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(String.valueOf(spinner.getValue())); // Считываем значение из спиннера
            }
        });
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Задаем менеджер для выравнивания
        panel.add(Box.createVerticalStrut(20)); // Между компонентами добавляем пустые промежутки
        panel.add(spinner);
        panel.add(Box.createVerticalStrut(20));
        panel.add(button);
        panel.add(Box.createVerticalStrut(20));
        panel.add(label);
        panel.add(Box.createVerticalStrut(20));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}