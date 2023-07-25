package qAmith;

import java.util.Scanner;

public class DateDiff {

	static int[] DAYS_IN_MONTH = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	static boolean isValidDate(int day, int month, int year) {
		if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > 31)
			return false;

		if (month == 2 && isLeapYear(year))
			return day <= 29;
		else
			return day <= DAYS_IN_MONTH[month];
	}

	static int dayOfYear(int day, int month, int year) {
		int days = day;
		for (int i = 1; i < month; i++) {
			days += DAYS_IN_MONTH[i];
			if (i == 2 && isLeapYear(year))
				days++; // Add an extra day for February in a leap year
		}
		return days;
	}

	static int daysBetweenYears(int startYear, int endYear) {
		int days = 0;
		if (startYear < endYear) {
			for (int year = startYear; year < endYear; year++) {
				days += isLeapYear(year) ? 366 : 365;
			}
		} else {
			for (int year = endYear; year < startYear; year++) {
				days += isLeapYear(year) ? 366 : 365;
			}
		}
		return days;
	}

	static int totalDays(int[] startDate, int[] endDate) {

		int startDay = startDate[0];
		int startMonth = startDate[1];
		int startYear = startDate[2];

		int endDay = endDate[0];
		int endMonth = endDate[1];
		int endYear = endDate[2];

		if (!isValidDate(startDay, startMonth, startYear) || !isValidDate(endDay, endMonth, endYear)) {
			throw new IllegalArgumentException("Invalid date input.");
		}

		int days = daysBetweenYears(startYear, endYear);
		days += dayOfYear(endDay, endMonth, endYear) - dayOfYear(startDay, startMonth, startYear);

		return days;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] date1 = new int[3];
		int[] date2 = new int[3];

//		int[] date1 = {30, 12, 2012};  9176
//		int[] date2 = {10,1,2013};;   9086 -- 
		
		System.out.println("Enter date 1 (DD,MM,YY)");
		for (int i = 0; i < 3; i++)
			date1[i] = s.nextInt();
		System.out.println("Enter date 2 (DD,MM,YY)");
		for (int i = 0; i < 3; i++)
			date2[i] = s.nextInt();

		System.out.println("Total days between " + date1[0] + "/" + date1[1] + "/" + date1[2] + " and " + date2[0] + "/"
				+ date2[1] + "/" + date2[2] + " are " + totalDays(date1, date2));

		s.close();
	}
}
