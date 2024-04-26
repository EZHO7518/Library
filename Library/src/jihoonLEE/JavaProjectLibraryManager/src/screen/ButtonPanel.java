package screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Map;

public class ButtonPanel extends JPanel {
    public ButtonPanel(Map<String, JTextField> fields) {
        JButton saveBtn = new JButton("회원 저장");
        saveBtn.addActionListener(e -> saveAction(fields));
        add(saveBtn);

        JButton exitBtn = new JButton("취소");
        exitBtn.addActionListener(e -> System.exit(0));
        add(exitBtn);
    }

    private void saveAction(Map<String, JTextField> fields) {
        fields.forEach((label, textField) -> System.out.println(label + ": " + textField.getText()));
    }
}