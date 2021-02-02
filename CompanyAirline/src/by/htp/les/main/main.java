package by.htp.les.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import by.htp.les.airlineView.AirLineView;
import by.htp.les.bean.AirLine;
import by.htp.les.bean.Company;
import by.htp.les.logic.CompanyLogic;

public class main {

	public static void main(String[] args) {

		Company com = new Company();

		com.add(new AirLine("Minsk", 2010, 11, 23, 4, 14, 20));
		com.add(new AirLine("Minsk", 2010, 11, 23, 4, 14, 20));
		com.add(new AirLine("Minsk", 2010, 11, 23, 4, 14, 20));
		com.add(new AirLine("Moskow", 2010, 11, 23, 4, 14, 20));
		com.add(new AirLine("Moskow", 2010, 11, 23, 4, 14, 20));
		com.add(new AirLine("Moskow", 2010, 11, 23, 4, 14, 20));
		com.add(new AirLine("Kiev", 2010, 11, 23, 4, 15, 20));
		com.add(new AirLine("Kiev", 2010, 11, 23, 4, 14, 22));

		CompanyLogic log = new CompanyLogic();

		List<AirLine> result = new ArrayList<>();
		result = log.search(com.getAirline(), "Minsk");

		AirLineView view = new AirLineView();
		view.printAirLine(result, "DESCTINATION");

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.DAY_OF_MONTH, 23);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		calendar.set(Calendar.HOUR_OF_DAY, 14);
		calendar.set(Calendar.MINUTE, 20);

		result = log.search(com.getAirline(), calendar);

		view.printAirLine(result, "TIME");

	}

}
