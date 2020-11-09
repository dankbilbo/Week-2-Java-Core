public class StopWatch {
    private long startTime;
    private long endTime;
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return (endTime - startTime) / 1000;
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
}
