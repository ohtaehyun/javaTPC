public class TPC02 {
    public static void main(String[] args) {
        //프로그래밍의 3대 요소: 변수, 자료형(크기와 종류가 결정 되어야함), 할당
        int a,b,c; // 선언
        a=1;
        b=1;
        c=a+b;
        System.out.println(c);

        float f;
        f = 34.5f;// 자바는 기본 double로 실수를 인식해서 뒤에 f를 붙여야 함

        char d;
        d = 'A'; // char 자료형은 ''로 묶기

        boolean g;
        g = true;

        // 변수를 만들면 메모리에 Symbol Table이 만들어짐 그래서 없는 변수를 호출하면 can not find symbol 에러가 발생함
    }
}
