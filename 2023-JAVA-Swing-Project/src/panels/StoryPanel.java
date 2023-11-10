package panels;

import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Main;

public class StoryPanel extends JPanel{
	JFrame superFrame;
	CardLayout cardLayout;
	Main main;
	
	ImageIcon[] storyImages;
	int currentImageIndex;

	public StoryPanel(JFrame superFrame, CardLayout cardLayout, Object o) {
		this.superFrame = superFrame;
		this.cardLayout = cardLayout;
		this.main = (Main) o;
		
		requestFocus();
		
		storyImages = new ImageIcon[] {
				new ImageIcon("img/story/story0.jpg"),
				new ImageIcon("img/story/story1.jpg"),
				new ImageIcon("img/story/story2.jpg"),
				new ImageIcon("img/story/story3.jpg"),
				new ImageIcon("img/story/story4.jpg"),
				new ImageIcon("img/story/story5.jpg"),
				new ImageIcon("img/story/story6.jpg"),
				new ImageIcon("img/story/story7.jpg"),

		};
		
		currentImageIndex=0;
		addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // mousePressed �̺�Ʈ�� �߻���  ���� ���丮 �̹����� ��ȯ
                currentImageIndex++;
                if (currentImageIndex < storyImages.length) {
                    repaint(); // ȭ�� �ٽ� �׸���
                } else {
                    // ���丮�� ������ �� ���� ȭ������ ��ȯ�ϴ� �ڵ�
                    cardLayout.show(superFrame.getContentPane(), "nextPanelName");
                }
            }
        });
	}
		@Override
		protected void paintComponent(Graphics g) {
		    super.paintComponent(g);
		    
		    // ���� ���丮 �̹��� �׸���
		    if (currentImageIndex < storyImages.length) {
		        ImageIcon currentImage = storyImages[currentImageIndex];
		        g.drawImage(currentImage.getImage(), 0, 0, getWidth(), getHeight(), this);
		    }
 	}
}