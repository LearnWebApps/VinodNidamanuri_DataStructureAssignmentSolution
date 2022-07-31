package question1;

import java.util.ArrayList;
import java.util.Scanner;

public class skyscraperApp {

	public static void main(String[] args) 
	{
		ArrayList<Integer> floorList = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building : ");
        int numflrs = input.nextInt();
        
        int count = 0;
        do {
        	System.out.println("enter the floor size given on day : " + (count + 1));
			int flrnum = input.nextInt();
			if (flrnum > 0)
			{	
				if (floorList.contains(flrnum))
				{
					System.out.println("duplicate floor number, pl enter the floor size greater than 0 that is not entered given on day");
				}else
				{
					floorList.add(flrnum);
					count++;
				}
			}else
			{
				System.out.println("invalid floor number, pl enter the floor size greater than 0 given on day");
			}
			
		}while(count < numflrs);
        input.close();
        
        getfloors.unblocked(numflrs, floorList);

	}

}
