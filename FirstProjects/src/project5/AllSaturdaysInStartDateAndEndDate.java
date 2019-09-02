package project5;

import java.text.ParseException;
import java.util.Scanner;

public class AllSaturdaysInStartDateAndEndDate {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		String beginDate = "";
		String endDate = "";
		
		
		boolean check = true;
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean check4 = false;
		
		int dBegin = 0;
		int mBegin = 0;
		int yBegin = 0;
		int dEnd = 0;
		int mEnd = 0;
		int yEnd = 0;
		
		while(check) {
			System.out.print("Begin date: ");
			beginDate = sc.nextLine();
			System.out.print("End date: ");
			endDate = sc.nextLine();
			check1 = IsValidDate.checkDate(beginDate, endDate);
			if(check1 == false) {
				System.out.println("The date is invalid");
				System.out.println("Re-Enter Date");
			} else {
				String[] splitStringDateBegin = beginDate.split("/");
				
				dBegin = Integer.parseInt(splitStringDateBegin[1]);
				mBegin = Integer.parseInt(splitStringDateBegin[0]);
				yBegin = Integer.parseInt(splitStringDateBegin[2]);
				
				String[] splitStringDateEnd1 = endDate.split("/");
				
				dEnd = Integer.parseInt(splitStringDateEnd1[1]);
				mEnd = Integer.parseInt(splitStringDateEnd1[0]);
				yEnd = Integer.parseInt(splitStringDateEnd1[2]);
				
				check3 = IsValidDate.isValidDate(dBegin, mBegin, yBegin);
				check4 = IsValidDate.isValidDate(dEnd, mEnd, yEnd);
				
				if(check3 && check4) {
					check2 = IsValidDate.compareDate(beginDate, endDate);
					if(check2 == false) {
						System.out.println("The end date must be after the start date");
						System.out.println("Re-Enter Date");
					} else
						check = false;
				} else {
					System.out.println(" y > 0 && (d > 0 && d < 32) && (m > 0 && m < 13). Re-Enter !!!");
				}
			}
		}
		
		FindSaturdays.getDates(beginDate, endDate);
		FindSaturdays.calculatesSatDate();
		sc.close();
	}
}
