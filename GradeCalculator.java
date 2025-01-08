package OOP_array_midterm;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println(calculateGrade(85)); // A
        System.out.println(calculateGrade(73)); // B
        System.out.println(calculateGrade(50)); // D
    }

    public static char calculateGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }
}

