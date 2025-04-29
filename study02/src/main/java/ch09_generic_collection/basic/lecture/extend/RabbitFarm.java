package ch09_generic_collection.basic.lecture.extend;

// 인터페이스 타입으로 제한할 시 에도 extends를 사용
// T 타입변수는 Rabbit 타입 혹은 Rabbit 하위 타입들만 가능
public class RabbitFarm<T extends Rabbit> {

    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
