package oop.inter;

public class Developer implements Work {

	@Override
	public void goOffice() {
		System.out.println("개발자가 출근합니다");
	}

	@Override
	public void working() {
		System.out.println("개발자가 일을합니다.");

	}

	@Override
	public void goHome() {
		System.out.println("개발자가 퇴근합니다,");

	}

	@Override
	public void eat() {
		System.out.println("개발자가 밥을먹습니다.");

	}

}
