package inside;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VavaControl implements KeyListener {
    private boolean canDoubleJump = false; // 2�� ���� ���� ���θ� ����
    private boolean isJumping = false; // ���� ���� ������ ���θ� ����

    public VavaControl() {
        // Default constructor
    }

    public VavaControl(boolean canDoubleJump, boolean isJumping) {
        this.canDoubleJump = canDoubleJump;
        this.isJumping = isJumping;
    }

    public boolean isCanDoubleJump() {
        return canDoubleJump;
    }

    public void setCanDoubleJump(boolean canDoubleJump) {
        this.canDoubleJump = canDoubleJump;
    }

    public boolean isJumping() {
        return isJumping;
    }

    public void setJumping(boolean jumping) {
        isJumping = jumping;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
            if (!isJumping) {
                // 1�� ����
                jump();
                System.out.println("1�� ����");
            } else if (canDoubleJump) {
                // 2�� ����
                jump();
                System.out.println("2�� ����");
                canDoubleJump = false;
            }
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            // ����Ű�� ����
            attack();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Ű�� �� ��
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Ű�� Ÿ������ ��
    }

    // ĳ������ ���� ������ ó��
    private void jump() {
        // ���� ������ ���⿡ �ۼ�
        // isJumping ���¸� �����ϰ� ���� �ִϸ��̼� ���� ó��
    }

    // ĳ������ ���� ������ ó��
    private void attack() {
        // ���� ������ ���⿡ �ۼ�
        // �� ����, �ִϸ��̼� ���� ó��
    }
}