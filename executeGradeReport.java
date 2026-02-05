public class executeGradeReport{
    public static void executeGradeReport(double score){
        boolean isValid = validateScore(score);
        if(!isValid){
            System.out.println("Invalid Score");
            return;
        }
char grade= calculateLetterGrade(score);
        displayPerformanceMessage(grade);
    }
}

