package ch08_multithread.basic.ch14.sec03.syncronization;

public class Example {

    public static void main(String[] args) {
        Account account = new Account();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(1000);
                System.out.println("Thread 1 출금 후 잔액 : " + account.getBalance());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(1000);
                System.out.println("Thread 2 출금 후 잔액 : " + account.getBalance());
            }
        });

        t1.start();
        t2.start();
    }
}
