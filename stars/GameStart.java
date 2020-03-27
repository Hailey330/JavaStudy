package stars;

class Zealot { // 이름은 변하지 않고, hp와 공격력은 변함
	final String NAME; // 상수. 불변 데이터는 final로 체크
	int hp; // 변수
	static int attack = 10; // 변수

	public Zealot(String name) { // 질럿 자체의 속성을 초기화- 생성자
		this.NAME = name;
		this.hp = 100; // 선언할 때부터 초기화
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

//다크템플러 DarkTempler 2마리 (공격력 50), 리버 River 2마리(공격력 70)
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

	// 질럿 -공격> 드라군
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 드라군 -공격> 질럿 "오버 로딩"
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 질럿 -공격> 질럿 "오버 로딩"
	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 드라군 -공격> 드라군 "오버 로딩"
	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 다크템플러 -공격> 질럿 "오버 로딩"
	static void attack(DarkTempler u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 다크템플러 -공격> 드라군 "오버 로딩"
	static void attack(DarkTempler u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 다크템플러 -공격> 다크템플러 "오버 로딩"
	static void attack(DarkTempler u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 다크템플러 -공격> 리버 "오버 로딩"
	static void attack(DarkTempler u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 리버 -공격> 질럿 "오버 로딩"
	static void attack(River u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 리버 -공격> 드라군 "오버 로딩"
	static void attack(River u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 리버 -공격> 다크템플러 "오버 로딩"
	static void attack(River u1, DarkTempler u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	// 리버 -공격> 리버 "오버 로딩"
	static void attack(River u1, River u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME + "이 공격 당하고 있습니다.");
		System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다");
	}

	public static void main(String[] args) {
		// 공격력 업그레이드 하기
		Zealot.attack++;
		// 질럿 생성하기
		Zealot z1 = new Zealot("1번 질럿");
		System.out.println(Zealot.attack);

		Zealot z2 = new Zealot("2번 질럿");
		System.out.println(Zealot.attack);

		Dragoon d1 = new Dragoon("1번 드라군");
		System.out.println(Dragoon.attack);

		Dragoon d2 = new Dragoon("2번 드라군");
		System.out.println(Dragoon.attack);

		DarkTempler dt1 = new DarkTempler("1번 다크템플러");
		System.out.println(DarkTempler.attack);

		DarkTempler dt2 = new DarkTempler("2번 다크템플러");
		System.out.println(DarkTempler.attack);

		DarkTempler r1 = new DarkTempler("1번 리버");
		System.out.println(DarkTempler.attack);

		DarkTempler r2 = new DarkTempler("2번 리버");
		System.out.println(DarkTempler.attack);

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
