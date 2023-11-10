package main;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


import panels.IntroPanel;
import panels.StoryPanel;
import main.ListenAdapter;


public class Main extends ListenAdapter {
	private JFrame frame; // â�� ���� ���� ������
	private IntroPanel introPanel; // ��Ʈ��
	private StoryPanel storyPanel; //�ٹ� ����
	private CardLayout cardLayout;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Main() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500); // â ������ (100,100��ǥ�� �Ʒ��� frame.setLocationRelativeTo(null) ������ �ǹ̰� ��������)
		frame.setLocationRelativeTo(null); // â�� ȭ�� �߾ӿ� ��ġ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ư�� ������ ����
		
		cardLayout = new CardLayout(0, 0); // ī�巹�̾ƿ� ��ü ����
		frame.getContentPane().setLayout(cardLayout); // �������� ī�巹�̾ƿ����� ����

		introPanel = new IntroPanel();
		introPanel.addMouseListener(this); // intro�г��� ���⼭ �ٷ� �ִ� ������� ���콺�����ʸ� �߰���.
		storyPanel = new StoryPanel(frame, cardLayout, this);
		storyPanel.addMouseListener(this);
		
		introPanel.setLayout(null);
		
		// �����ӿ� �гε��� �߰��Ѵ�.(ī�� ���̾ƿ��� ���� �гε�)
		frame.getContentPane().add(introPanel, "intro");
		frame.getContentPane().add(storyPanel, "story");
		}
	@Override
	public void mousePressed(MouseEvent e) { // mouseClicked�� ���氡��
		if (e.getComponent().toString().contains("IntroPanel")) { // IntroPanel���� ���콺�� �����ٸ�
			try {
				Thread.sleep(300);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			cardLayout.show(frame.getContentPane(), "story"); // select�г��� ī�巹�̾ƿ� �ֻ������ ����
			storyPanel.requestFocus(); // �����ʸ� select�гο� ������ ��
			
			
		} 				
	}

}