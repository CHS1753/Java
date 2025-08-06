package day1;//      타입 변환
//      자동 변환: 넓은 쪽으로 변환은 자바가 해줌
//      수동 변환: 좁은 쪽으로 변환은 개발자가 한다.
//      int 와 int를 연산하면 타입은 int

public class Example09 {
    public static void main(String[] args) {
        long a = 10;
        int b =(int)a;
        double c = 3.99;
        int d =(int)c;
        System.out.println(d);



    }
}
