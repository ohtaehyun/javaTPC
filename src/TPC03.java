import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
    public static void main(String[] args) {
        //관계를 이해하라
        //vo: Value Object  값을 저장하기 위한 객체
        //dto: Data Transfer Object를 이동하기 위한 객체
        Book myBook = new Book("javaTCP","taehyun oh",10000,367);
        System.out.println(myBook);

        PersonVO person = new PersonVO("oh tae hyun",28,100f,181f);

    }
}
