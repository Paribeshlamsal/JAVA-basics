class Demo {
    public void mul(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(n * i);
        }
    }
}

class MyThread extends Thread {
    private int n;

    public MyThread(int n) {
        this.n = n;
    }

    public void run() {
        Demo classObj = new Demo();
        classObj.mul(n);
    }

    public static void main(String args[]) throws InterruptedException {
        MyThread thread = new MyThread(5); 
        thread.start();
        Thread.sleep(100);
    }
}
