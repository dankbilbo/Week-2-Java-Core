public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        s.start();
        int[] arr = {1, 2, 3, 5, 7, 23, 123, 5, 1, 123, 123, 23, 35565, 23, 123, 6, 357, 7};
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
