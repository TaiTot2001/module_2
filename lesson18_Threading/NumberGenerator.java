public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        // In ra 10 số tự nhiên đầu tiên, cách nhau 500ms
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " - Number: " + i + " - HashCode: " + this.hashCode());
            try {
                Thread.sleep(500); // Dừng 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread bị gián đoạn: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Tạo 2 đối tượng NumberGenerator
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        // Tạo 2 thread, mỗi thread chạy một generator
        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Đặt tên cho luồng để dễ quan sát
        thread1.setName("Generator-1");
        thread2.setName("Generator-2");

        // Bắt đầu chạy cả hai luồng
        thread1.start();
        thread2.start();
    }
}
