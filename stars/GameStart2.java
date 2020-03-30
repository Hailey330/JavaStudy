package stars;

abstract class Protoss { // 추상 class
	abstract String getName(); // setName 만들지 않은 이유 : name은 final 이니까

	abstract int getHp();

	abstract void setHp(int hp);

	abstract int getAttack();

	abstract void setAttack(int attack);
}

class 질럿 extends Protoss {
	private final String NAME;
	private int hp;
	static int attack = 10;

	public 질럿(String name) {
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

class 드라군 extends Protoss {
	private final String NAME;
	private int hp;
	static int attack = 15;
	
	public 드라군(String name) {
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

class 다크템플러 extends Protoss {
	private final String NAME;
	private int hp;
	static int attack = 50;
	
	public 다크템플러(String name) {
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

class 리버 extends Protoss {
	private final String NAME;
	private int hp;
	static int attack = 70;

	public 리버(String name) {
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
		System.out.println(u2.getName() + "이 공격 당하고 있습니다.");
		System.out.println(u2.getName() + "의 체력은 " + u2.getHp() + "입니다");
	}

	public static void main(String[] args) {
		// 공격력 업그레이드 하기
		질럿.attack++;
		// 질럿 생성하기
		질럿 z1 = new 질럿("1번 질럿");

		질럿 z2 = new 질럿("2번 질럿");

		드라군 d1 = new 드라군("1번 드라군");

		드라군 d2 = new 드라군("2번 드라군");

		다크템플러 dt1 = new 다크템플러("1번 다크템플러");

		다크템플러 dt2 = new 다크템플러("2번 다크템플러");

		리버 r1 = new 리버("1번 리버");

		리버 r2 = new 리버("2번 리버");
		

		// 공격하기
		attack(z1, d1);
		attack(z1, d1);

		attack(d1, z1); // 매개변수 타입이 다르기 때문에 실행 X -> 오버로딩 하기

		attack(z1, z2); // 질럿 -공격> 질럿
		attack(d1, d2); // 드라군 -공격> 드라군

		attack(dt1, z1); // 다크템플러 -공격> 질럿
		attack(dt1, d1); // 다크템플러 - 공격> 드라군
		attack(dt1, dt2); // 다크템플러 -공격> 다크템플러
		attack(dt1, r1); // 다크템플러 -공격> 리버

		attack(r1, z1); // 리버 -공격> 질럿
		attack(r1, d1); // 리버 - 공격> 드라군
		attack(r1, dt1); // 리버 -공격> 다크템플러
		attack(r1, r2); // 리버 -공격> 리버

	}
}
