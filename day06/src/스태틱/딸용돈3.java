package ����ƽ;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ���뵷3 {
	int dongCount;
	int sonCount;
	
	public ���뵷3() {
		JFrame f = new JFrame("�� �뵷 �׷���");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(350, 750);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		Scanner sc = new Scanner(System.in);
				
		JLabel l1 = new JLabel("�� �̸�");
		l1.setFont(new Font("����", Font.PLAIN, 27));
		JTextField name = new JTextField(10);
		name.setFont(new Font("����", Font.PLAIN, 27));
		f.getContentPane().add(l1);
		f.getContentPane().add(name);
		
		
		JLabel l2 = new JLabel("�� ����");
		l2.setFont(new Font("����", Font.PLAIN, 27));
		JTextField age = new JTextField(10);
		age.setFont(new Font("����", Font.PLAIN, 27));
		f.getContentPane().add(l2);
		f.getContentPane().add(age);
		
		
		JButton daddy = new JButton("�ƺ� �뵷 �ּ���");
		JLabel l3 = new JLabel("�ܾ�: " + ���뵷wallet.wallet + "��");
		daddy.setBackground(Color.CYAN);
		daddy.setForeground(Color.BLUE);
		daddy.setFont(new Font("����", Font.PLAIN, 35));
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				if (s1.equals("ȫ�浿")) {
					dongCount++;
				} else if(s1.equals("ȫ���")) {
					sonCount++;
				} else {
					System.out.println("�ش� �� �̸� ����");
				}
				
				
				String s2 = age.getText();
				int agei = Integer.parseInt(s2);
				
				���뵷wallet ��1 = new ���뵷wallet(s1, agei);
				���뵷wallet.wallet = ���뵷wallet.wallet - 1000;
				int result = ���뵷wallet.wallet;
				
				l3.setText("�ܾ�" + result + "��");
				
				JOptionPane.showMessageDialog(null, (dongCount * 1000) + "��");
				JOptionPane.showMessageDialog(null, (sonCount * 1000) + "��");
				
			}
		});
		f.getContentPane().add(daddy);
		
		l3.setFont(new Font("����", Font.PLAIN, 27));
		f.getContentPane().add(l3);
		
		
//		JLabel l4 = new JLabel("ȫ�浿: " + (dongCount * 1000) +"��");
//		l4.setText("ȫ�浿: " +(dongCount * 1000) +"��");
//		f.add(l4);
//		
//		JLabel l5 = new JLabel("ȫ���: " + (sonCount*1000)+"��");
//		f.add(l5);
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		���뵷3 name = new ���뵷3();
		
		
	}

}
