package inside;

import java.awt.Image;

public class Obstacle {

	private Image image; // ��ֹ� �̹���

	// ��ֹ� ũ�� �� ��ǥ
	private int x;
	private int y;
	private int width;
	private int height;

	// ��ֹ� ����
	private int speed = 0; // death ��ֹ� �ӵ�
	private int countAttack = 0; // 2�� ��ֹ��� ���ݹ��� Ƚ�� ī��Ʈ

	private boolean death = false; // death ��ֹ� ����

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCountAttack() {
		return countAttack;
	}

	public void setCountAttack(int countAttack) {
		this.countAttack = countAttack;
	}

	public boolean isDeath() {
		return death;
	}

	public void setDeath(boolean death) {
		this.death = death;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
