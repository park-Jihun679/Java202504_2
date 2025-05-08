package ch12_stream.basic.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("홍길동", 10),
            new Student("신용권", 20),
            new Student("유미선", 30)
        );

        // 1. 단계별로 변수에 담아 처리

        // 1) List<Student> -> Stream<Student>로 변환
        Stream<Student> studentStream = list.stream();

        // 2) Student 의 score만 추출
        IntStream scoreStream = studentStream
            .mapToInt(s -> s.score);

        // 3) 평균을 계산 (average()) 하고 Optional에서 double 값을 꺼냄
        double avg1 = scoreStream
            .average()  // 평균을 계산 OptionalDouble 반환

            // Optional (없을 경우에 대한 예외처리)
            .orElseThrow(() -> new IllegalStateException("점수 없음"));

        System.out.println("평균 점수 : " + avg1);

        // 파이프라인 스타일 (체이닝)
        double avg2 = list.stream()
            .mapToInt(s -> s.score)
            .average()
            .orElse(0.0);

        System.out.println("평균 점수 : " + avg2);
    }
}
