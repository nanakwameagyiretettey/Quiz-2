public class Version3 {
    public static double calculateClassAverage (double[] scores){
        double sum = 0.0;

        for (int i = 1; i < scores.length; i++ ){
            sum += scores[i];
        }
        return sum/scores.length;
    }
}
