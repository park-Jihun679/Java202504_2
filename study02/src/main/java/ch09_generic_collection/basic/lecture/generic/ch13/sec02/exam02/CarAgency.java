package ch09_generic_collection.basic.lecture.generic.ch13.sec02.exam02;

// 타입변수 P를 Car로 대체
public class CarAgency implements Rentable<Car>{

    @Override
    public Car rent() {

        return new Car();
    }
}
