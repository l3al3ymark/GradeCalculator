package th.co.mfec.chaiyapong.gradecalculator;

/**
 * Created by chaiyapong Pipithanachoti on 10/7/2016 AD.
 * MFEC PCL co., ltd
 */
public class GradeConverter {
    public String convert(int score) {
        if(score >= 80) {
            return "A";
        } else if(score >= 70) {
            return "B";
        } else if(score >= 60) {
            return "C";
        } else if(score >=50) {
            return "D";
        }
        return "F";
    }
}
