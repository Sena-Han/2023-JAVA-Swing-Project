package panels;

import java.awt.Image;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//import main.Main;
import inside.Obstacle;
import inside.Vava;

public class GamePanel extends JPanel {

	private Image bufferImage;
	private Graphics bufferg;

	private ImageIcon obstacle1; // 1ĭ ��ֹ� (1�� ����)
	private ImageIcon obstacle2; // 2ĭ ��ֹ� (2�� ����)
	private ImageIcon obstacleDeath; // death ��ֹ�

	private List<Obstacle> obstacleList = new ArrayList<>(); // ��ֹ� ����Ʈ
	
	Vava v1; // �ٹ� ��ü
}