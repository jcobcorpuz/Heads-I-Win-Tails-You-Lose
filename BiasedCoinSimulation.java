import java.util.Random;

public class BiasedCoinSimulation {
    public static int runTrial(int n, double p){
        Random random = new Random();
        int heads = 0;
        for(int i = 0; i < n; i++){
            if (random.nextDouble() < p) {
                heads++;
            }
        }
        return heads;
    }


    public static void main(String[] args){
        int [] flipCounts = {10, 100, 1000, 5000, 10000};
        double[] probabilities = {0.25, 0.5, 0.75};
        int trials = 10;
        System.out.printf("%-20s%-20s%-30s%-20s\n", "Number of Flips (n)", "Trial # (m)", "Probability of Heads (p)", "Number of Heads");

        for (int i = 0; i < flipCounts.length; i++){
            int n = flipCounts[i];
            for (int j = 0; j < probabilities.length; j++){
                double p = probabilities[j];
                for (int m = 1; m <= trials; m++){
                    int heads = runTrial(n, p);
                    System.out.printf("%-20d%-20d%-30.2f%-20d\n", n, m, p, heads);
                }
            }
        }
    }
}
