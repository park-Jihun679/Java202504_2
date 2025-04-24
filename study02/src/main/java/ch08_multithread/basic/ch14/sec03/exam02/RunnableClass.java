package ch08_multithread.basic.ch14.sec03.exam02;

import java.awt.Toolkit;

public class RunnableClass implements Runnable{

    @Override
    public void run() {
        // 스레드한테 시킬 일
        // Toolkit 도구 모음 클래스
        // beep()

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // 예외가 발생한 위치 경로를 알려줌
                e.printStackTrace();;
            }
        }
    }
}
