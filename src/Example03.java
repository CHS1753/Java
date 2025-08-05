// type : 정수 실수 문자 참거짓
//              1byte       2byte       4byte       8byte
//정수            byte        short       int         long
//실수                                    float       double
//boolean       boolean
//char                       char

// 자바에서는 값은 기능을 가질 수 없다. 날짜는 클래스 단위
public class Example03 {
    public static void main(String[] args) {
//      정수 저장은 일정한 정수값을 저장한다. ex) -100~100  -> 표현범위 무한대니깐
        System.out.println(999999999+99999991);

//      실수는 근삿값, 실수는 저장이 안됨 그래서 근삿값
        System.out.println(0.2+0.1);

//      boolean 참 거짓
        System.out.println(5>9);

//      문자
        System.out.println('a');
//       얘는?
        System.out.println("apple");

    }
}
