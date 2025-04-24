package ch08_multithread.basic.ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample2 {

    public static void main(String[] args) {

        // 익명 클래스 : 이름 없이 인터페이스나 추상클래스를 즉석해서 구현하는 클래스
        // 익명 객체 : 익명클래스로 만든 객체
        Thread thread = new Thread(new RunnableClass() {
                @Override
                public void run() {
                    Toolkit toolkit = Toolkit.getDefaultToolkit();
                    for (int i = 0; i < 5; i++) {
                        toolkit.beep();

                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                            // 예외가 발생한 위치 경로를 알려줌
                            e.printStackTrace();
                            ;
                        }

                    }
                }
            });

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // 예외가 발생한 위치 경로를 알려줌
                e.printStackTrace();;
            }
        }
    }
}
