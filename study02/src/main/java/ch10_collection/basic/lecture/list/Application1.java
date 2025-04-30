package ch10_collection.basic.lecture.list;

import java.time.LocalDateTime;
import java.util.*;

public class Application1 {

    public static void main(String[] args) {
        /*
        컬렉션 프레임워크는 크게 3가지 인터페이스 중 한가지를 상속받아 구현
        List 인터페이스
        - 순서가 있음, 중복저장 허용
        - Vector, ArrayList, LinkedList, Stack, Queue
        Set 인터페이스
        - 순서가 없음, 중복 불가
        - HashSet, TreeSet
        Map 인터페이스
        - 키와 값이 한 쌍으로 이루어진 데이터 집합 (순서 x, 중복된 키 불가)
        - HashMap, TreeMap, HashTable, Properties
         */

        // 가변적이고 요소의 추가,수정,삭제를 메소드로 제공해줌
        ArrayList<Object> alist = new ArrayList<>();
        List<Object> list = new ArrayList<>();

        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(LocalDateTime.now());

        System.out.println(list);

        list.add(1, "banana");
        System.out.println(list);

        list.set(1, true);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        /*
        LinkedList
        - 저장한 요소가 순서를 유지하지 않고 저장됨
        - 요소들 사이를 링크로 연결하여 구성해 마치 연결된 리스트처럼 만듦
        - 요소의 저장과 삭제가 빈번히 일어날 때 성능면에서 ArrayList보다 우수
         */
        List<String> strList = new LinkedList<>();
        strList.add("c");
        strList.add("b");
        strList.add("a");
        strList.add("d");
        System.out.println(strList);


        Iterator<String> iterator = strList.iterator();

        while(!iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
