import java .util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of subjects:-");
        int numSubjects = input.nextInt();
        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter subject marks:-" + i + "(out of 100): ");
            int marks = input.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid !, you must enter marks between 0 and 100..");
                i--;
                continue;
            }
            totalMarks += marks;
        }
        double average = (double) totalMarks / numSubjects;
         String grade =null;
        if (average >= 90) {
            grade="A";
        } else if (average >= 80) {
            grade="B";
        } else if (average >= 70) {
            grade="C";
        } else if (average >= 60) {
            grade="D";
        } else {
            System.out.println("work hard");
        }
        System.out.println("\n------Result-----");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage is ="+ average);
        System.out.println("Grade = " + grade);
        input.close();
    }
    }
