package exam.ex03;

public class MultiDimension { // 다차원 @@ 배우는것

	public int[][] nums = new int[100][];

	public static void main(String[] arge) {
		MultiDimension md = new MultiDimension();
		// 다차원 배열의 초기화 시작
		for (int i = 0; i < md.nums.length; i++) {
			md.nums[i] = new int[i + 1];
			System.out.println(i + "층의 방갯수 : " + md.nums[i].length);
		}
		// 다차원 배열의 초기화 끝
		int a = 1; // 방의 들어가는 값 (1부터여서 1로 선언)
		for (int i = 0; i < md.nums.length; i++) { // 층 수 호출
			for (int j = 0; j < md.nums[i].length; j++) { // 방 번호 호출
				md.nums[i][j] = a; // i층 j방의 값을 집어 넣는다
				a++; // 1을 더해 값을 증가
				System.out.println(i + "층의 " + j + "방의 사람 수 =" + md.nums[i][j]);
				// 콘솔에 띄어주는
			}

		}
	}

}
