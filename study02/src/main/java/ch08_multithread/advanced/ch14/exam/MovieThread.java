package ch08_multithread.advanced.ch14.exam;

public class MovieThread extends Thread {

    @Override
    public void run() {

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("동영상을 재생합니다.");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
