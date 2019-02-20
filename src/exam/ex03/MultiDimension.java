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
//		md.nums = new int[10][]; // nullpointException 뜸 (2차원의 인덱스 값이 null이기떄문)
		// 다차원 배열의 초기화 끝
		int a = 1; // 방의 들어가는 값 (1부터여서 1로 선언)
		for (int i = 0; i < md.nums.length; i++) { // 층 수 호출
			System.out.print(i+"층 : ");
			for (int j = 0; j < md.nums[i].length; j++) { // 방 번호 호출
				md.nums[i][j] = a; // i층 j방의 값을 집어 넣는다
				a++; // 1을 더해 값을 증가
				System.out.print(md.nums[i][j]+", ");
			}
			System.out.println();

		}
	}

}
