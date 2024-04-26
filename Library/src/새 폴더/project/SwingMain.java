package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class SwingMain {
	public static void main(String[] args) {
		JFrame f = new JFrame("도서 관리 프로그램");
		f.setBounds(200,20,1500,1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JPanel container = new JPanel();
		container.setBounds(330,0,700,50);
	
		
		JButton button1 = new JButton("대여");
		button1.setBounds(50,0,100,50);
		JButton button2 = new JButton("도서");
		button2.setBounds(150,0,100,50);
		JButton button3 = new JButton("회원");
		button3.setBounds(250,0,100,50);
		JButton button4 = new JButton("종료");
		button4.setBounds(350,0,100,50);
		
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4);
		
		f.add(container);
		
		// 화면 축소,확대 막기
		//f.setResizable(false);
		
		//-----------------------------------------------------
		
		Object[][] data = {{"1","asdFF","asd","asd","asd"},{"2","asd","asd","asd","asd"}};
		
		String[] bookarr = {"도서제목","회원명","대여일자","반납예정일","대여여부"};
		
		JPanel jp = new JPanel();
		jp.setSize(900,800);
	
		
		
		JTable table = new JTable(data,bookarr);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0,100,900,700);
		jp.add(scrollPane);
		
		f.add(jp);
		
		//------------------------------------------------------
		
		
	
        JPanel memberInformation = new JPanel();
        JLabel title1 = new JLabel("회원 정보");
        title1.setBounds(0,0,30,30);
        
        memberInformation.add(title1);
        memberInformation.setBounds(1000, 200, 200, 100);
        f.add(memberInformation);
		

		JPanel imagePanel = new JPanel();
        ImageIcon icon = new ImageIcon("C:\\Users\\admin\\Desktop\\project\\project\\image\\default.png");
        JLabel label = new JLabel(icon);
        imagePanel.add(label);
        f.add(imagePanel);
		
		
		
		
		
		
        
	  
	}

	
	
}


