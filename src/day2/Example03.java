package day2;

// 수동 타입 변환 -> cast, casting
public class Example03 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;


        double y = 1.25346;
        int c = (int)y;

//      boolean은 타입 변환 안됨 고립된 타입
//        boolean d =true;
//        int e = (int)d;
//        당연하지 않을 수 있다. true+true가 존재하나보네 어딘가에는 -> 자바 스크립트에 있더라
//        System.out.println(true+true);

    }
}
