public abstract class SortingTemplate {
    private String name = "";
    private long bestTime = Long.MAX_VALUE;
    private long worstTime = 0;
    private long totalTime = 0;
    private int timesCount = 0;

    public SortingTemplate(String name) {
        this.name = name;
    }

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

    public double getAverageTime() {
        return timesCount > 0 ? totalTime / (double) timesCount : 0;
    }

    public void printResults() {
        double best = this.bestTime;
        double worst = this.worstTime;
        double avg = this.getAverageTime();
        
        System.out.println(this.name + " Results:");
        System.out.printf("Best: %.3f ms\n", best);
        System.out.printf("Worst: %.3f ms\n\n", worst);
        System.out.printf("Average: %.3f ms\n\n", avg);
      }
}