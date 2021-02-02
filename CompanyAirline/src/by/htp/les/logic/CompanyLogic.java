package by.htp.les.logic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import by.htp.les.bean.AirLine;

public class CompanyLogic {

	public List<AirLine> search(List<AirLine> airline, String desctination) {
		List<AirLine> result = new ArrayList<>();

		for (AirLine currentAirline : airline) {
			if (currentAirline.getDesctination().equals(desctination)) {
				result.add(currentAirline);
			}
		}

		return result;
	}

	public List<AirLine> search(int daysOfTheWeek, List<AirLine> airline) {
		List<AirLine> result = new ArrayList<>();

		for (AirLine currentAirline : airline) {
			if (currentAirline.getCalendarDays() == daysOfTheWeek) {
				result.add(currentAirline);
			}
		}

		return result;
	}

	public List<AirLine> search(List<AirLine> airline, Calendar calendar) {
		List<AirLine> result = new ArrayList<>();

		for (AirLine currentAirline : airline) {
			if (currentAirline.getCalendarYear() == calendar.get(Calendar.YEAR)) {

				if (currentAirline.getCalendarMonth() == calendar.get(Calendar.MONTH)) {

					if (currentAirline.getCalendarDayOfMonth() == calendar.get(Calendar.DAY_OF_MONTH)) {

						if (currentAirline.getCalendarHour() > calendar.get(Calendar.HOUR_OF_DAY)) {

							result.add(currentAirline);

						} else if (currentAirline.getCalendarMinutes() > calendar.get(Calendar.MINUTE)) {

							result.add(currentAirline);
						} else {

						}

					}
				}

			}
		}

		return result;
	}
}
