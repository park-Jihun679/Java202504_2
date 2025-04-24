package ch08_multithread.advanced.ch14.exam;

public class MusicRunnable implements Runnable {

    @Override
    public void run() {

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("음악을 재생합니다.");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
