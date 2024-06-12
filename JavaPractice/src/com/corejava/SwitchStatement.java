package com.corejava;

import java.time.DayOfWeek;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
		switch (dayOfWeek) {
		case MONDAY: {
			System.out.println("Its MONDAY Today");
			break;
		}
		case THURSDAY: {
			System.out.println("Its THURSDAY Today");
			break;
		}
		case FRIDAY: {
			System.out.println("Its FRIDAY Today");
			break;
		}
		case WEDNESDAY: {
			System.out.println("Its WEDNESDAY Today");
			break;
		}
		default:
			System.out.println("Unexpected day of week");
			break;
		}
		
	}

}
