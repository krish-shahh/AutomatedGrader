import java.util.Scanner;
import java.util.Arrays; 

//Automated Grader.java
// Krish Shah
// 03-04-2021

public class AutomatedGrader {
    public static void main(String []args){
    
     int mc;  
     int frqQ;

    Scanner name = new Scanner(System.in);
    String assessmentName;
    System.out.print("Enter Assessment Name: ");
    assessmentName = name.nextLine();
         
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the number of multiple choice questions: ");  
    mc=sc.nextInt();  
    
    Scanner mcWeight = new Scanner(System.in);
    String mcQuestionWeight;
    System.out.print("Enter Points each question is worth: ");
    mcQuestionWeight = mcWeight.nextLine();
    
    int[] arrayMC = new int[10];  
    System.out.println("Enter the correct answers for the multiple choice questions: ");  
      for(int i=0; i<mc; i++){  
         arrayMC[i]=sc.nextInt();  
   } 
      /*System.out.println("Your Answers" + Arrays.toString(arrayMC)); 
      System.out.println("Do you need to change anything (y/n)?");  */   
   
    Scanner frq = new Scanner(System.in);  
    System.out.print("Enter the number of free response questions: ");  
    frqQ=frq.nextInt();  
    
    Scanner frqWeight = new Scanner(System.in);
    String frqQuestionWeight;
    System.out.print("Enter Points each question is worth: ");
    frqQuestionWeight = frqWeight.nextLine();

    int[] arrayFRQ = new int[10];  
    System.out.println("Enter the correct answers for the free response questions: ");  
      for(int i=0; i<frqQ; i++){  
         arrayFRQ[i]=frq.nextInt();  
   } 
      /*System.out.println("Your Answers" + Arrays.toString(arrayFRQ)); 
      System.out.println("Do you need to change anything (y/n)?"); */

//Student Name and Answers
    Scanner studentName = new Scanner(System.in);
    String nameOfStudent;
    System.out.print("Enter Student's Name: ");
    nameOfStudent = studentName.nextLine(); 

    int[] arrayStudentMCAnswers = new int[10];  
    System.out.println("Enter the student answers for the multiple choice questions: ");  
      for(int i=0; i<mc; i++){  
         arrayStudentMCAnswers[i]=sc.nextInt();
      } 
    
    int[] arrayStudentFRQAnswers = new int[10];  
    System.out.println("Enter the student answers for the multiple choice questions: ");  
      for(int i=0; i<frqQ; i++){  
         arrayStudentFRQAnswers[i]=frq.nextInt(); 
      }

//Cross-Check Student Answers with Correct Answers



//Result Printing:
System.out.println(studentName + "---" assessmentName);
System.out.println("Multiple Choice Score: " finalMCScore);
System.out.println("Free Response Question Score: " finalFRQScore);
   /*
   if(arrayMC == arrayFRQ) {
      System.out.println("Same");
      }
      else {
      System.out.println("Not same");
      } 

    
    /*System.out.println("Enter " + studentTests + " scores: ");
        for (int i = 0; i < studentTests; i++) {
        studentScores[i] = studentInput.nextInt();
    } */
    
}
/*
     public static void compareArrays(String[] array1, String[] array2) {
         boolean b = false;
        for(String str1 : array1){
            for(String str2 : array2){
                if(str1 == str2){
                    b = true;
                }
            }
        }
    } */
}