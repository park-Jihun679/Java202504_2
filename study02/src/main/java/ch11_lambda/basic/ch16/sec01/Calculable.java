package ch11_lambda.basic.ch16.sec01;

@FunctionalInterface
public interface Calculable {
    // 추상 메소드
    void calculate(int x, int y);
}
