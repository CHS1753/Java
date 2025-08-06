package day2;

// 객체 만들어보기 성계도 만듬

class human{
    String name;
    int age;
    String address;
    void insa() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
    }
}
// 저기에 나오는 new는 객체를 만들어라이다
// 설계도가 있어 오타나 오류가 있으면 에러가 바로 나옴 안정성이 좋다.
public class Example04 {
    public static void main(String[] args) {
        human ob = new human();
        ob.name = "홍길동";
        ob.age = 14;
        ob.address = "인천 서구";
        ob.insa();


    }
}
