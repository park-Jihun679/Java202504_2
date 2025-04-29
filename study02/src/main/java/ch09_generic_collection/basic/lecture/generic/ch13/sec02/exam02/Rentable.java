package ch09_generic_collection.basic.lecture.generic.ch13.sec02.exam02;

public interface Rentable<P> {

    // 반환타입 P인 rent라고 하는 추상메서드
    P rent();
}
