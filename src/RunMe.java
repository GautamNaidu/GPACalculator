import java.util.Scanner;

public class RunMe 
	{

		public static void main(String[] args) 
		{
			System.out.println("Hello User!\nMy name is Clippy and i'm a bot designed to help you calculate your GPA.\nI was created by a CS110 student named Gautam Naidu. \n");
			
			// Variable Initialization. Note that certain variables are initialized later as they're dependent on user input.
			Scanner input = new Scanner(System.in); //Defining object for Scanner.
			int classNumber1; //Number of Classes User is taking.
			int t; //Counter Variable Starting from Zero.
			int n; //Counter Variable Starting from One.
			
			
			
			// How Many Classes is User Taking? Array Initialization.
			System.out.println("To start off, how many classes are you taking this semester?\nIf your labs are graded seperately than from lecture, put them down as a seperate course.\nExample: 5");
			classNumber1 = input.nextInt();
			int creditHourArray1[]=new int[classNumber1];
			double gpaArray1[]=new double[classNumber1];
			
			
			
			// How Many Credit Hours is Each Class?
			for (t=0;t<classNumber1;t++)
			{
				n=t+1;
				System.out.println("\nWhat is the number of credit hours for class "+n+"?" );
				creditHourArray1[t]=input.nextInt();
			}
			
			
			// What grades did you get in each class?
			for (t=0;t<classNumber1;t++)
			{
				n=t+1;
				System.out.println("\nWhat was the grade you recieved in class "+n+"?\nEnter in terms of 4.0 scale." );
				gpaArray1[t]=input.nextDouble();	
			}
			
			
			// GPA Calculations
			Bot gpaCalculatorBot = new Bot(creditHourArray1,gpaArray1,classNumber1);
		
		
		}

	}


