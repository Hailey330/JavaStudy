package stars;

class Zealot { // �̸��� ������ �ʰ�, hp�� ���ݷ��� ����
	final String NAME; // ���. �Һ� �����ʹ� final�� üũ
	int hp; // ����
	static int attack = 10; // ����

	public Zealot(String name) { // ���� ��ü�� �Ӽ��� �ʱ�ȭ- ������
		this.NAME = name;
		this.hp = 100; // ������ ������ �ʱ�ȭ
	}

}

class Dragoon {
	final String NAME;
	int hp;
	static int attack = 15;

	public Dragoon(String name) {
		this.NAME = name;
		this.hp = 100;
	}

}

//��ũ���÷� DarkTempler 2���� (���ݷ� 50), ���� River 2����(���ݷ� 70)
class DarkTempler {
	final String NAME;
	int hp;
	static int attack = 50;

	public DarkTempler(String name) {
		this.NAME = name;
		this.hp = 100;
	}
}

class River {
	final String NAME;
	int hp;
	static int attack = 70;

	public River(String name) {
		this.NAME = name;
		this.hp = 100;
	}

}

public class GameStart {

	// ���� -����> ���
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ��� -����> ���� "���� �ε�"
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ���� -����> ���� "���� �ε�"
	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ��� -����> ��� "���� �ε�"
	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ��ũ���÷� -����> ���� "���� �ε�"
	static void attack(DarkTempler u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ��ũ���÷� -����> ��� "���� �ε�"
	static void attack(DarkTempler u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ��ũ���÷� -����> ��ũ���÷� "���� �ε�"
	static void attack(DarkTempler u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ��ũ���÷� -����> ���� "���� �ε�"
	static void attack(DarkTempler u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ���� -����> ���� "���� �ε�"
	static void attack(River u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ���� -����> ��� "���� �ε�"
	static void attack(River u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ���� -����> ��ũ���÷� "���� �ε�"
	static void attack(River u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	// ���� -����> ���� "���� �ε�"
	static void attack(River u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "�� ���� ���ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�");
	}

	public static void main(String[] args) {
		// ���ݷ� ���׷��̵� �ϱ�
		Zealot.attack++;
		// ���� �����ϱ�
		Zealot z1 = new Zealot("1�� ����");
		System.out.println(Zealot.attack);

		Zealot z2 = new Zealot("2�� ����");
		System.out.println(Zealot.attack);

		Dragoon d1 = new Dragoon("1�� ���");
		System.out.println(Dragoon.attack);

		Dragoon d2 = new Dragoon("2�� ���");
		System.out.println(Dragoon.attack);

		DarkTempler dt1 = new DarkTempler("1�� ��ũ���÷�");
		System.out.println(DarkTempler.attack);

		DarkTempler dt2 = new DarkTempler("2�� ��ũ���÷�");
		System.out.println(DarkTempler.attack);

		DarkTempler r1 = new DarkTempler("1�� ����");
		System.out.println(DarkTempler.attack);

		DarkTempler r2 = new DarkTempler("2�� ����");
		System.out.println(DarkTempler.attack);

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
