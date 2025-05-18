import java.util.Arrays;
import java.util.Random;

public class SortTimer {
    public static void main(String[] args) {
        int size = 100000;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        System.out.println("Thời gian bắt đầu (startTime): " + stopWatch.getStartTime() + " ms");

        Arrays.sort(array);

        stopWatch.stop();
        System.out.println("Thời gian kết thúc (stopTime): " + stopWatch.getStopTime() + " ms");

        System.out.println("Thời gian thực thi Arrays.sort() cho " + size + " số: " +
                stopWatch.getElapsedTime() + " milliseconds");

        System.out.print("10 phần tử đầu sau khi sắp xếp: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
