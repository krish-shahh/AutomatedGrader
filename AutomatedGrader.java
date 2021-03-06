// AutomatedGrader.java
// Krish Shah
// 03-05-2021

import java.util.Scanner;
import java.util.Arrays;

public class AutomatedGrader
{
	// declare array objects.
	char A[][],K[], A1[][], K1[];
	int S[], S1[], n, mcQ, mcWeight, frqQ, frqQWeight;
    public static String assessmentName;
    public static String nameOfStudent;
    Scanner fr, sc;

	void userInput()
	{
        //Input Assessment Name
        Scanner name = new Scanner(System.in);
        System.out.print("Enter Assessment Name: ");
        assessmentName = name.nextLine();
        
        // enter number of Questions
		Scanner mc = new Scanner(System.in);
		System.out.print("Enter number of multiple choice questions : ");
		mcQ = mc.nextInt();

        Scanner weight = new Scanner(System.in);
		System.out.print("Enter points per multiple choice question : ");
		mcWeight = weight.nextInt();

        Scanner sc = new Scanner(System.in);

		// Array to store answer key
		K = new char[mcQ]; 

        //Answer Key MC
        System.out.println("\nEnter Correct Multiple Choice Answers : ");
		for(int i = 0; i<mcQ; i++)
		{
			K[i] = sc.next().charAt(0);
		}

		Scanner mcReenter = new Scanner(System.in);
		System.out.println("Are these the multiple choice values you entered: " + Arrays.toString(K) + " Want to re-enter the answers (y/n)");
		String mcEnter = mcReenter.nextLine();
			if(mcEnter.equals("y")) {
			System.out.println("\nEnter Correct Multiple Choice Answers : ");
				for(int i = 0; i<mcQ; i++){
					K[i] = sc.next().charAt(0);
				}
			}

        //Section for User FRQ Input
        Scanner frq = new Scanner(System.in);
		System.out.print("Enter number of free response questions : ");
		frqQ = frq.nextInt();

        Scanner frqWeight = new Scanner(System.in);
		System.out.print("Enter points per free response question : ");
		frqQWeight = frqWeight.nextInt();

        Scanner fr = new Scanner(System.in);
 
		// Array to store answer key
		K1 = new char[frqQ]; 

        //Answer Key MC
        System.out.println("\nEnter Correct Free Response Answers : ");
		for(int i = 0; i<frqQ; i++)
		{
			K1[i] = fr.next().charAt(0);
		}

		Scanner frqReenter = new Scanner(System.in);
		System.out.println("Are these the free response values you entered: " + Arrays.toString(K1) + " Want to re-enter the answers (y/n)");
		String frqEnter = frqReenter.nextLine();
			if(frqEnter.equals("y")) {
			System.out.println("\nEnter Correct Free Response Answers : ");
				for(int i = 0; i<frqQ; i++){
					K1[i] = sc.next().charAt(0);
				}
			}

	}
    
    void studentInput() {

        //Student input Name
        Scanner studentName = new Scanner(System.in);
        System.out.print("Enter Student's Name: ");
        nameOfStudent = studentName.nextLine();

        //Student input MC
        A = new char[1][mcQ];
		S = new int[1];
        Scanner sc = new Scanner(System.in); 
        for(int i = 0; i<1; i++)
		{
			System.out.println("Enter Student Multiple Choice Answers: ");
			for(int j=0; j<mcQ; j++)
			{
				A[i][j] = sc.next().charAt(0);
			}
		}

        //Student input FRQ
		A1 = new char[1][frqQ];
		S1 = new int[1];
        Scanner fr = new Scanner(System.in);
        for(int i = 0; i<1; i++)
		{
			System.out.println("Enter Student Free Response Answers: ");
			for(int j=0; j<frqQ; j++)
			{
				A1[i][j] = fr.next().charAt(0);
			}
		}
    }

    void printNames() {
        System.out.println("-----------------------------------"); 
        System.out.println("Student Name: " + AutomatedGrader.nameOfStudent + " --- " + "Assessment Name: "  + AutomatedGrader.assessmentName);
		  System.out.println();
    }

	// Function to calculate score Students.
	void mcCalcScore() 
	{
		for(int i = 0; i<1; i++)
		{
			S = new int[mcQ];
			S[i] = 0;
			for(int j=0; j<mcQ; j++)
			{
				// matching the students answers with correct answer.
				if(A[i][j] == K[j]) 
				{
					S[i]++;
				}
			}
            int mcCorrect = (S[i] * mcWeight); 
            int mcTotal = (mcQ * mcWeight);
            double finalMCScore = (mcCorrect * 100 / mcTotal);
            System.out.println("Multiple Choice Score: " + finalMCScore + "%");
			System.out.println("Multiple Choice Correct: " + S[i]);
		}
        System.out.println();
	}

    void frqCalcScore() 
	{
		for(int i = 0; i<1; i++)
		{
			S1 = new int[frqQ];
			S1[i] = 0;
			for(int j=0; j<frqQ; j++)
			{
				// matching the students answers with correct answer.
				if(A1[i][j] == K1[j]) 
				{
					S1[i]++;
				}
			}
            int frqCorrect = (S1[i] * mcWeight); 
            int frqTotal = (frqQ * mcWeight);
            double finalFRQScore = (frqCorrect * 100 / frqTotal);
            System.out.println("Free Response Score: " + finalFRQScore + "%");
			System.out.println("Free Response Correct: " + S1[i]);
		}
        System.out.println();
	}
	public static void main(String args[])
	{
		AutomatedGrader ob = new AutomatedGrader();
		ob.userInput();
        ob.studentInput();
        ob.printNames();
		ob.mcCalcScore();
		ob.frqCalcScore();
        Scanner mcSameKey = new Scanner(System.in);
        System.out.print("Want to use the same multiple choice key to grade another quiz? (y/n): ");
           String mcKey = mcSameKey.nextLine();
           if(mcKey.equals("y")) {
             ob.studentInput();
			 ob.printNames();
			 ob.mcCalcScore();
			 ob.frqCalcScore();
           }
           else if(mcKey.equals("n")){
             return;
         } 
	}
}