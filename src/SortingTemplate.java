public abstract class SortingTemplate {
    private long bestTime = Long.MAX_VALUE;
    private long worstTime = 0;
    private long totalTime = 0;
    private int timesCount = 0;

    public void sortAndMeasure(String[] array) {
        long startTime = System.currentTimeMillis();
        
        sort(array);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        bestTime = Math.min(bestTime, elapsedTime);
        worstTime = Math.max(worstTime, elapsedTime);
        totalTime += elapsedTime;
        timesCount++;

        System.out.println(this.getClass().getSimpleName() + "execution time: " + elapsedTime + " ms");
    }

    protected abstract void sort(String[] text);

    public long getBestTime() {
        return bestTime;
    }

    public long getWorstTime() {
        return worstTime;
    }

    public double getAverageTime() {
        return timesCount > 0 ? totalTime / (double) timesCount : 0;
    }

}