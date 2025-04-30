package ch10_collection.basic.lecture.map;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Application1 {

    public static void main(String[] args) {
        /*
        Map
        -> Collection 인터페이스들과는 다른 저장방식
        key, value 쌍으로 저장하는 방식

        key란?
        - 값을 찾기 위한 이름 역할의 객체
        - 키는 중복을 허용하지 않음, 키가 다르면 중복되는 값은 저장 가능
         */

        HashMap<Integer, String> hashMap = new HashMap();

        hashMap.put(1, "java8");
        hashMap.put(2, "oracle");
        hashMap.put(3, "jdbc");
        hashMap.put(4, "html5");
        hashMap.put(5, "css3");
        hashMap.put(6, "css3");
        // hashMap.put(6, "maria");

        System.out.println(hashMap);

        // 삭제
        hashMap.remove(1);
        System.out.println("hashMap : " + hashMap);

        // getOrDefault(key, DefaultValue)
        // 지정한 키가 맵에 없을 때 기본값을 반환, 있을때는 해당 키의 value를 반환
        System.out.println("getOrDefault 테스트 : " + hashMap.getOrDefault(7, "empty") );

    }
}
