package day1;// 같은 타입을 연산하면 결과도 그 타입


public class Example10 {
    public static void main(String[] args) {
        int kor = 75;
        int eng = 70;
        int math = 70;
        int result = kor + eng + math;
        double avg = (double)result/3;
//        double avg = (double)(result/3); -> 이러면 (tot/3) 결과가 먼저 나온다.
//        result/3은 int로 생성되니깐 71로 됨 -> 아니 내가 그리 말했는데...............
        System.out.println(result);
        System.out.println(avg);





    }
}