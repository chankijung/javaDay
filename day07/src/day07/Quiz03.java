package day07;

public class Quiz03 {
	public static void main(String[] args) {
		   //1. arr배열에 저장 10, 17, 3, 9, 27, 10, 8, 9, 13, 21
		   int[] arr = new int[] {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		   
		   //2. invert_arr배열에 거꾸로 저장 후 출력
		   int[] invert_arr = new int[arr.length];
		   int size = arr.length;
		   for(int num : arr) {
		      invert_arr[--size] = num;
		   }
		   for(int num : invert_arr) {
		      System.out.print(num+", ");
		   }
		   System.out.println();
		   
		   //3. arr배열에 저장되어 있는 인덱스 짝수번째의 값 -(빼기) 홀수번째의 값, 연산 후 resultArr배열에 저장 후 출력
		   int[] resultArr = new int[arr.length/2];
		   int odd=1;
		   int even = 0;
		   for(int i=0;i<resultArr.length; i++) {
		      resultArr[i] = arr[even] - arr[odd];
		      even+=2; odd+=2;
		   }
		   System.out.println("짝수번째 - 홀수번째");
		   for(int re : resultArr) {
		      System.out.print(re+", ");
		   }
		   System.out.println();
		   //4. arr배열에 저장되어 있는 인덱스 짝수번째의 합 - 홀수번째의 합, 결과 result변수에 저장 후 출력
		   int result = 0, oddSum=0, evenSum=0;
		   odd=1;
		   even = 0;
		   for(int i=0;i<resultArr.length; i++) {
		      evenSum += arr[even];
		      oddSum += arr[odd];
		      even+=2; odd+=2;
		   }
		   System.out.println("짝수 합 - 홀수 합 = "+(evenSum-oddSum));
		   
		}
}

