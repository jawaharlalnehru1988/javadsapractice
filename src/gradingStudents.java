import java.util.ArrayList;
import java.util.List;

public class gradingStudents {
    public static List<Integer> gradeStudent(List<Integer> grades){
        List<Integer> roundedGrades = new ArrayList<>();
        for (int grade: grades){
            if(grade < 38 || grade % 5 < 3){
                roundedGrades.add(grade);
            } else {
            int multipleOf5 = (grade/5 + 1) * 5;
            roundedGrades.add(multipleOf5);
            }
            }
        return  roundedGrades;
        }
        public static void main(String[] args){
        List<Integer> originalGrades = List.of(73, 67, 38, 33);
        List<Integer> roundedGrades = gradeStudent(originalGrades);
        System.out.println("Original Grades: " + originalGrades);
        System.out.println("Rounded Grades: " + roundedGrades);
        }

}
