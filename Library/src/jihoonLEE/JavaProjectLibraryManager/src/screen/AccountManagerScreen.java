package screen;

import javax.swing.*;
import java.awt.*;

public class AccountManagerScreen extends JFrame {
    public AccountManagerScreen() {
        setTitle("회원가입 정보입력");
        setBounds(200, 20, 1500, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        // 이미지 패널 생성
        ImagePanel imagePanel = new ImagePanel("C:\\\\Users\\\\admin\\\\Desktop\\\\JavaProjectLibraryManager\\\\src\\\\images/Library.jpg");

        // 회원정보 입력 패널 및 버튼 패널 생성
        InputPanel inputPanel = new InputPanel();
        ButtonPanel buttonPanel = new ButtonPanel(inputPanel.getFields());
        inputPanel.add(buttonPanel);
        // JSplitPane을 사용하여 이미지 패널과 입력 패널을 나누어 배치
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, imagePanel, inputPanel);
        splitPane.setResizeWeight(0.63); // 이미지 패널과 입력 패널의 크기 비율 조정
        splitPane.setContinuousLayout(true); // 컨테이너 크기 변경 시 실시간으로 레이아웃을 업데이트
        
        // 전체 화면의 반만 차지하도록 설정
        int mainFrameWidth = getWidth();
        int mainFrameHeight = getHeight();
        splitPane.setPreferredSize(new Dimension(mainFrameWidth / 2, mainFrameHeight));

        // 프레임에 JSplitPane 추가

        add(splitPane);
        setLocationRelativeTo(null); // 화면 중앙에 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AccountManagerScreen::new);
        
    }
}