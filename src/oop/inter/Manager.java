package oop.inter;

public class Manager implements Work {

	@Override
	public void goOffice() {
		System.out.println("매니저가 출근합니다");

	}

	@Override
	public void working() {
		System.out.println("매니저가 일합니다,");

	}

	@Override
	public void goHome() {
		System.out.println("매니저가 퇴근합니다,");

	}

	@Override
	public void eat() {
		System.out.println("매니저가 밥을 먹습니다.");

	}

}
