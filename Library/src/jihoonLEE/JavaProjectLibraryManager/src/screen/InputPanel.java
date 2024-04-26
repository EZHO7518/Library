package screen;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class InputPanel extends JPanel {
    private Map<String, JTextField> fields;

    public InputPanel() {
        setLayout(new GridLayout(13, 1));
        fields = new HashMap<>();

        addField("아이디", new JTextField());
        addField("비밀번호 입력", new JPasswordField());
        addField("비밀번호 확인", new JPasswordField());
        addField("이름", new JTextField());
        addField("주소", new JTextField());
        addField("전화번호 입력", new JTextField("-를 제외한 나머지만 입력하세요."));

        // 패널 크기 설정
        setPreferredSize(new Dimension(300, getHeight())); // 폭 300, 높이 전체 화면 크기
    }

    private void addField(String label, JTextField field) {
        add(new JLabel(label));
        add(field);
        fields.put(label, field);
    }
    
 // 비밀번호 확인 메소드
    public boolean checkPasswordMatch() {
        JTextField passwordField = fields.get("비밀번호 입력");
        JTextField confirmPasswordField = fields.get("비밀번호 확인");
        
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        
        // 입력된 비밀번호와 비밀번호 확인 값이 같은지 확인
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "비밀번호가 일치하지 않습니다.", "경고", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }


    public Map<String, JTextField> getFields() {
        return fields;
    }
    
    public void setFields(Map<String, JTextField> fields) {
		this.fields = fields;
	}
    
    
}