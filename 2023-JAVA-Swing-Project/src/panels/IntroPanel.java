package panels;

import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IntroPanel extends JPanel {
	
	ImageIcon introImg = new ImageIcon("img/intro/intro.jpg"); // ��Ʈ�� �̹���
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // ȭ���� ����
		
		// ��Ʈ�� ȭ���� �׸���
		g.drawImage(introImg.getImage(), 0, 0, getWidth(), getHeight(), null);

	}

}