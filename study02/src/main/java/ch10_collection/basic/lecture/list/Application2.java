package ch10_collection.basic.lecture.list;

import java.util.Stack;

public class Application2 {

    public static void main(String[] args) {
        /*
        Stack
        선형 메모리 공간에 데이터를 저장하며 후입선출(LIFO) 방식의 자료구조
         */

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);
        System.out.println("integerStack.search(5) : " + integerStack.search(5));   // 1 출력됨
        // peek() : 가장 상단에 (마지막에) 있는 요소 반환
        // pop() : 가장 상단에 (마지막에) 있는 요소 반환 후 제거

        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);


        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
    }
}
