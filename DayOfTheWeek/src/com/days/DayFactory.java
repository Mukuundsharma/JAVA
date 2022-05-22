package com.days;

import com.days.friday.Friday;
import com.days.monday.Monday;
import com.days.saturday.Saturday;
import com.days.sunday.Sunday;
import com.days.thrusday.Thrusday;
import com.days.tuesday.Tuesday;
import com.days.wednesday.Wednesday;

public class DayFactory {
	
	Day d1;

	public Day displayDay(int day) {
		{
			if (day == 1) {
				d1 = new Monday();
			}
			if (day == 2) {
				d1 = new Tuesday();
			}
			if (day == 3) {
				d1 = new Wednesday();
			}
			if (day == 4) {
				d1 = new Thrusday();
			}
			if (day == 5) {
				d1 = new Friday();
			}
			if (day == 6) {
				d1 = new Saturday();
			}
			if (day == 7) {
				d1 = new Sunday();
			}
			return d1;
		}
	}
}
