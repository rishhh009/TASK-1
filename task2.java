package task_2;

import java.util.*;
public class GradeCalculator {


  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int numSubjects = 5;
    System.out.println ( " Enter the number of subjects :");
    numSubjects  = scanner.nextInt();
    int[] marks = new int[numSubjects];
    for(int i =0; i < numSubjects; i++){
      System.out.println(x:"\n");
      System.out.println("Enter the marks for subject" + (i + 1)  + " : ");
      marks[i] = scanner.nextInt();
    }
    int totalMarks = 0;
    for(int mark : marks){
      totalMarks += mark;
    }
    double averagePercentage  = (double) totalMarks / (numSubjects);
    String grade;
    if(averagePercentage >= 90){
      grade = "A";
    } else if(averagePercentage >= 80){
      grade = "B";
    } else if(averagePercentage >= 70){
      grade = "C";
    } else if(averagePercentage >= 60){
      grade = "D";
    } else {
      grade = "F";
    }
    System.out.println("\n");
    Syestem.out.println("Total marks" + totalMarks);
    System.out.println("\n");
    System.out.println("Average Percentage " + averagePercentage + "%");
    
      System.out.println("grade" + grade);
    scanner.close();
  }
}
