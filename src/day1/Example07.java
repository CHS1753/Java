package day1;

public class Example07 {
    public static void main(String[] args) {
      System.out.println(1000000000);
//     자바의 기본 정수 타입은 int
//     오른쪽 숫자는 이름없는 값: 리터럴(literal) -> 값을 바로 적는 것
//     리터럴과 변수는 다른 영역에 생성된다. 자바에서 리터럴은 타입을 가진다.
//     int보다 큰 숫자를 지정할 때는 숫자 옆에 L을 붇인다. 물론 대입할 값도 long으로 만들어야함

//     long b = 1000000000000;            //오류
//     정수 리터럴의 기본 타입은 int 이다.

//     double c = 1000000000000L;         //오류
//     자바에서 표현범위가 넓은 값을 좁은 변수에 대입할 수 없다.


     long a = 1000000000000000000L;
      System.out.println(a);
    }
}
