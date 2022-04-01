package day08;

public class Ex01 {
	public static void main(String[] args) {
		//ArrayList에 대한 설명
		int arr[][] = new int[][] {{1,2},{20,30},{30,45},{32,54},{12,111}};
		int ars[][] = new int[][] {
							{1, 2, 3, 4, 5},
							{20,30,40,50,60},
							{30,45,60,75,90}
							};
		//인덱스가 두개인 2차원 배열
		//행렬식으로 이해 
		// arr[1][4] = 10
		// 다차원이 생기면 이해가 오히려 어려워 짐
		//int ard[][][]= new int[][][] {{{1,2,3},{2}},{20,30},{30,45}};
		// 콤마를 기준으로 0 1 2 이런식으로 숫자를 세보면 됨
		//System.out.println(arr[2][1]);
		for(int i = 0; i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
		//for each문으로 표현해보기
		
		
		System.out.println("--------------------------");
		for(int[]a: arr) {
			for(int k: a) {
				System.out.print(k+", ");
			}
			System.out.println();
		}
		
		/*
		 * for(int[] a : arr) { for(int k : a) { System.out.print(k+", "); }
		 * System.out.println(); }
		 */

							
		
	}
	
	
	

}
