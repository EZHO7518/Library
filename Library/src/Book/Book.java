package Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Book {
    private static ArrayList<String> bookList = new ArrayList<>(); // 도서 목록을 저장할 리스트

    public static void main(String[] args) {
        // 프레임 생성
        JFrame f = new JFrame("도서 관리 프로그램");
        f.setBounds(200, 20, 1500, 1000);
        f.setLayout(null);
        f.setVisible(true);

        // 컨테이너 패널 생성
        JPanel container = new JPanel();
        container.setBounds(330, 0, 700, 100);
        f.add(container); // 프레임에 컨테이너 패널 추가

        // 버튼 생성
        JButton rentButton = new JButton("대여");
        rentButton.setBounds(250, 20, 100, 50);
        JButton bookButton = new JButton("도서");
        bookButton.setBounds(350, 20, 100, 50);
        JButton memberButton = new JButton("회원");
        memberButton.setBounds(450, 20, 100, 50);
        JButton exitButton = new JButton("종료");
        exitButton.setBounds(550, 20, 100, 50);

        // 도서 목록 출력 영역 생성 (JTextArea 사용)
        JTextArea bookTextArea = new JTextArea(15, 40);
        JScrollPane scrollPane = new JScrollPane(bookTextArea);
        scrollPane.setBounds(200, 200, 300, 300);

        // 버튼 액션 리스너 추가
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 도서 목록 보여주는 메서드 호출
                showBookList(bookTextArea);
            }
        });

        // 컨테이너 패널에 버튼 추가
        container.add(rentButton);
        container.add(bookButton);
        container.add(memberButton);
        container.add(exitButton);

        // 프레임에 컨테이너 패널 추가
        f.add(container);
        // 프레임에 도서 목록 출력 영역 추가
        f.add(scrollPane);
    }

    // 도서 목록 보여주는 메서드
    private static void showBookList(JTextArea bookTextArea) {
        // 간단한 도서 목록 배열을 가정합니다.
        String[] bookList = {
                "도서 1: 자바 프로그래밍 입문",
                "도서 2: 데이터베이스 설계와 구현",
                "도서 3: 알고리즘과 자료구조"
        };

        // 도서 목록을 JTextArea에 표시합니다.
        bookTextArea.setText("도서 목록:\n");
        for (String book : bookList) {
            bookTextArea.append(book + "\n");
        }
    }
}
