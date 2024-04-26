package Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Book2 {
    private static ArrayList<String> bookList = new ArrayList<>();

    public static void main(String[] args) {
        // JFrame 설정
        JFrame frame = new JFrame("도서 관리 프로그램");
        frame.setBounds(200, 20, 1500, 1000);
        frame.setLayout(null);
        frame.setVisible(true);

        // 컨테이너 패널 설정
        JPanel container = new JPanel();
        container.setBounds(330, 20, 700, 100);
        frame.add(container);

        // 버튼 생성
        JButton rentButton = new JButton("대여");
        rentButton.setBounds(50, 0, 200, 50);
        JButton bookButton = new JButton("도서");
        bookButton.setBounds(350, 0, 100, 50);
        JButton memberButton = new JButton("회원");
        memberButton.setBounds(450, 0, 100, 50);
        JButton exitButton = new JButton("종료");
        exitButton.setBounds(550, 0, 100, 50);

        // 버튼 이벤트 처리
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // "도서 목록" 창 열기
                showBookList(frame);
            }
        });

        // 컨테이너에 버튼 추가
        container.add(rentButton);
        container.add(bookButton);
        container.add(memberButton);
        container.add(exitButton);

        // 프레임 표시
        frame.setVisible(true);
    }

    // "도서 목록" 창 표시 메서드
    private static void showBookList(JFrame parentFrame) {
        // JDialog 생성
        JDialog dialog = new JDialog(parentFrame, "도서 목록", true);
        dialog.setLayout(new BorderLayout());
        dialog.setSize(400, 300);

        // JTextArea 생성 및 설정
        JTextArea bookTextArea = new JTextArea(15, 30);
        JScrollPane scrollPane = new JScrollPane(bookTextArea);
        dialog.add(scrollPane, BorderLayout.CENTER);

        // "도서 등록" 버튼 및 이벤트 처리
        JButton registerButton = new JButton("도서 등록");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // "도서 등록" 창 열기
                String bookName = JOptionPane.showInputDialog(parentFrame, "도서 이름을 입력하세요:");
                if (bookName != null && !bookName.trim().isEmpty()) {
                    bookList.add(bookName.trim());
                    updateBookList(bookTextArea);
                }
            }
        });
        
        // 패널에 "도서 등록" 버튼 추가
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(registerButton);
        dialog.add(buttonPanel, BorderLayout.SOUTH);

        // "도서 목록" 업데이트
        updateBookList(bookTextArea);

        // 다이얼로그 표시
        dialog.setVisible(true);
    }

    // "도서 목록" 업데이트 메서드
    private static void updateBookList(JTextArea bookTextArea) {
        bookTextArea.setText("도서 목록:\n");
        for (String book : bookList) {
            bookTextArea.append(book + "\n");
        }
    }
}
