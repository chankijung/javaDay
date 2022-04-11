package day16;

import java.util.Scanner;

class A사람1 implements 공방{
	   public void 총알장전() {
	      System.out.println("총알 장전");
	   }
	   public void attack() {
	      총알장전();
	      System.out.println("돌격앞으로 총쏜다");
	   }
	   public void defense() {
	      
	   }
	}
	class B사람1 implements 공방{
	   public void 비행기출격() {
	      System.out.println("비행기 탑승합니다");
	   }
	   public void attack() {
	      attack1();attack2();
	      비행기출격();
	      System.out.println("비행기가 공격 합니다");
	   }
	   public void attack1() {
	      System.out.println("비행기 정비 합니다");
	   }
	   public void attack2() {
	      System.out.println("비행기 주유합니다");
	   }
	   public void attack3() {
	      System.out.println("비행기 총알 장전");
	   }
	   public void attack4() {
	      비행기출격();
	      System.out.println("비행기가 공격 합니다");
	   }
	   public void attack5() {
	      비행기출격();
	      System.out.println("비행기가 공격 합니다");
	   }
	   public void defense() {
	      
	   }
	}
	public class Ex07 {
	public static void main(String[] args) {
	   B사람1 b = new B사람1();
	   A사람1 a = new A사람1();
	   공방 aaa = new B사람1();
	   aaa.attack();
	  
	}
	}
