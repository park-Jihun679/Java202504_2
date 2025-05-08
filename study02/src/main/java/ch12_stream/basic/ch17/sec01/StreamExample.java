package ch12_stream.basic.ch17.sec01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

    /*
    스트림 : 컬렉션, 배열같이 자바에서 데이터 소스를 편하게 다루기 위한 문법
    스트림 특징
    1. 원본데이터를 변형시키지 않는다.
    2. 일회용이기 때문에 최종연산 이후에는 다시 스트림을 생성해야한다.
    3. 작업을 내부적으로 반복처리한다.
    4. 병렬처리가 가능하다.
     */

    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        strSet.add("홍길동");
        strSet.add("김자바");
        strSet.add("신용권");

        System.out.println(" ------------------- 향상된 for 문 사용 -------------------");
        for (String s : strSet) {
            System.out.println(s);
        }

        System.out.println(" ------------------- Stream 사용 -------------------");
        Stream<String> strStream = strSet.stream();
        strStream.forEach(System.out::println);

        // set에서도 forEach 사용가능
        strSet.forEach(System.out::println);

        System.out.println(" ------------------- Stream 사용 -------------------");
        strSet.stream()
            // 정렬 (역순)
            .sorted(Comparator.reverseOrder())
            // 앞에서 부터 크기만큼 자르기
            .limit(2)
            .forEach(System.out::println);
    }
}
