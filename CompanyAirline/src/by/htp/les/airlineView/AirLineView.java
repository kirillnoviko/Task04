
package by.htp.les.airlineView;

import java.util.List;

import by.htp.les.bean.AirLine;

public class AirLineView {

	public void printAirLine(List<AirLine> airline, String message) {
		System.out.println(message + "---------------------------");
		for (AirLine currentAirline : airline) {

			System.out.println(currentAirline.getDesctination() + " --- " + currentAirline.getCalendar().getTime());

		}

		System.out.println("------------------------------------------------------");

	}
}
