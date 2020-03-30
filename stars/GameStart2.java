package stars;

abstract class Protoss { // �߻� class
	abstract String getName(); // setName ������ ���� ���� : name�� final �̴ϱ�

	abstract int getHp();

	abstract void setHp(int hp);

	abstract int getAttack();

	abstract void setAttack(int attack);
}

class ���� extends Protoss {
	private final String NAME;
	private int hp;
	static int attack = 10;

	public ����(String name) {
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
	}

}

class ��� extends Protoss {
	private final String NAME;
	private int hp;
	static int attack = 15;
	
	public ���(String name) {
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
	}

	
}

class ��ũ���÷� extends Protoss {
	private final String NAME;
	private int hp;
	static int attack = 50;
	
	public ��ũ���÷�(String name) {
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
	}

}

class ���� extends Protoss {
	private final String NAME;
	private int hp;
	static int attack = 70;

	public ����(String name) {
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
	}
}

public class GameStart2 {

	static void attack(Protoss u1, Protoss u2) {
		u2.setHp(u2.getHp()-u1.getAttack());
		System.out.println(u2.getName() + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.getName() + "�� ü���� " + u2.getHp() + "�Դϴ�");
	}

	public static void main(String[] args) {
		// ���ݷ� ���׷��̵� �ϱ�
		����.attack++;
		// ���� �����ϱ�
		���� z1 = new ����("1�� ����");

		���� z2 = new ����("2�� ����");

		��� d1 = new ���("1�� ���");

		��� d2 = new ���("2�� ���");

		��ũ���÷� dt1 = new ��ũ���÷�("1�� ��ũ���÷�");

		��ũ���÷� dt2 = new ��ũ���÷�("2�� ��ũ���÷�");

		���� r1 = new ����("1�� ����");

		���� r2 = new ����("2�� ����");
		

		// �����ϱ�
		attack(z1, d1);
		attack(z1, d1);

		attack(d1, z1); // �Ű����� Ÿ���� �ٸ��� ������ ���� X -> �����ε� �ϱ�

		attack(z1, z2); // ���� -����> ����
		attack(d1, d2); // ��� -����> ���

		attack(dt1, z1); // ��ũ���÷� -����> ����
		attack(dt1, d1); // ��ũ���÷� - ����> ���
		attack(dt1, dt2); // ��ũ���÷� -����> ��ũ���÷�
		attack(dt1, r1); // ��ũ���÷� -����> ����

		attack(r1, z1); // ���� -����> ����
		attack(r1, d1); // ���� - ����> ���
		attack(r1, dt1); // ���� -����> ��ũ���÷�
		attack(r1, r2); // ���� -����> ����

	}
}
