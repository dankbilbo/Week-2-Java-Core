import java.lang.Math;
public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        s.start();
        int[] arr = new int[100000];
        for(int i = 0; i< 100000; i ++){
            arr[i] = (int)(100 * Math.random());
        }
        arr = SelectionSort.selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        s.stop();
        System.out.println();
        System.out.println("Start time : " + s.getStartTime());
        System.out.println("End time : " + s.getEndTime());
        System.out.println("Elapsed time : " + s.getElapsedTime());
    }
}
