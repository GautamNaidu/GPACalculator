import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

	public class Bot {
		
		Bot(int creditHourArray[],double gpaArray[], int classNumber)
		{
			int totalCreditHours; //Total number of credit hours.
			int t; //Counter Variable Starting from Zero.
			double percentClass;
			double overallGPA;
			double gpaCalculation[] = new double[classNumber];
			
					totalCreditHours = IntStream.of(creditHourArray).sum(); //Sums creditHourArray to find total number of credit hours.
					for (t=0;t<classNumber;t++)
					{
						percentClass = ((double)creditHourArray[t])/totalCreditHours; //Calculates how much each class affects GPA
						gpaCalculation[t] = percentClass * gpaArray[t]; //Now incorporates GPA values with percentClass variable.
					}
					
					//Display Final GPA
					overallGPA = DoubleStream.of(gpaCalculation).sum(); //Final 
					System.out.println("\nYour overall GPA comes out to: "+overallGPA+"\nHave a good day!");
				
		}

	}



