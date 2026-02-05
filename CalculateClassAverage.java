public class CalculateClassAverage {
    public static double calculateClassAverage (double score1, double score2 ){
        double average = (score1 + score2)/2;
        return calculateClassAverage (score1, score2);

    }
}
