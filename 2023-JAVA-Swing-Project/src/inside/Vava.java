package inside;

import java.awt.Image;

public class Vava {

	private Image image; // �ٹ� �̹���

	// �ٹ� ũ�� �� ��ǥ
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int height = 0;

	// �ٹ� ����
	private int hp = 1000; // �ٹ� ü��
	private int alpha = 255; // �ٹ� ����

	private int big = 0; // �Ŵ�ȭ ���� �ð�
	private int fast = 0; // ����ȭ ���� �ð�

	private int countJump = 0; // ���� Ƚ��

	private boolean invincible = false; // ���� ����
	private boolean fall = false; // ���� ����
	private boolean jump = false; // ���� ����

	public Vava(Image image) {
		this.setImage(image);
	}

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

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}

	public int getBig() {
		return big;
	}

	public void setBig(int big) {
		this.big = big;
	}

	public int getFast() {
		return fast;
	}

	public void setFast(int fast) {
		this.fast = fast;
	}

	public int getCountJump() {
		return countJump;
	}

	public void setCountJump(int countJump) {
		this.countJump = countJump;
	}

	public boolean isInvincible() {
		return invincible;
	}

	public void setInvincible(boolean invincible) {
		this.invincible = invincible;
	}

	public boolean isFall() {
		return fall;
	}

	public void setFall(boolean fall) {
		this.fall = fall;
	}

	public boolean isJump() {
		return jump;
	}

	public void setJump(boolean jump) {
		this.jump = jump;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}