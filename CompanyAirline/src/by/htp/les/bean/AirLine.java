package by.htp.les.bean;

import java.io.Serializable;
import java.util.Calendar;

public class AirLine implements Serializable {

	private static final long serialVersionUID = -4194806233121431300L;

	private String desctination;
	private String typeAirplane;

	private int numberLine;

	private Calendar calendar;

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public void setCalendar(int year, int month, int dayOfMonth, int day, int hour, int minute) {
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.DAY_OF_WEEK, day);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
	}

	public int getCalendarYear() {
		return calendar.get(Calendar.YEAR);
	}

	public boolean setCalendarYear(int year) {
		if (year < 0) {
			return false;
		}
		calendar.set(Calendar.YEAR, year);
		return true;
	}

	public int getCalendarMonth() {
		return calendar.get(Calendar.MONTH);
	}

	public boolean setCalendarMonth(int month) {
		if (month >= 12 || month < 0) {
			return false;
		}
		calendar.set(Calendar.MONTH, month);
		return true;
	}

	public int getCalendarDayOfMonth() {
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	public boolean setCalendarDayOfMonth(int dayOfMonth) {
		if (dayOfMonth > 31 || dayOfMonth < 0) {
			return false;
		}
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		return true;
	}

	public int getCalendarDays() {
		return calendar.get(Calendar.DAY_OF_WEEK);
	}

	public boolean setCalendarDays(int day) {
		if (day < 1 || day > 7) {
			return false;
		}
		calendar.set(Calendar.DAY_OF_WEEK, day);
		return true;
	}

	public int getCalendarHour() {
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	public boolean setCalendarHour(int hour) {
		if (hour < 0 || hour > 23) {
			return false;
		}
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		return true;
	}

	public int getCalendarMinutes() {
		return calendar.get(Calendar.MINUTE);
	}

	public boolean setCalendarMinutes(int minute) {
		if (minute < 0 || minute > 59) {
			return false;
		}
		calendar.set(Calendar.MINUTE, minute);
		return true;
	}

	public AirLine() {

	}

	public AirLine(String desctination, int year, int month, int dayOfMonth, int day, int hour, int minute) {
		this.desctination = desctination;
		calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.DAY_OF_WEEK, day);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);

	}

	public AirLine(String desctination, Calendar calendar) {
		this.desctination = desctination;
		this.calendar = calendar;

	}

	public AirLine(String desctination, Calendar calendar, int numberLine, String typeAirplane) {
		this(desctination, calendar);
		this.numberLine = numberLine;
		this.typeAirplane = typeAirplane;
	}

	public AirLine(String desctination, int year, int month, int dayOfMonth, int day, int hour, int minute,
			int numberLine, String typeAirplane) {
		this(desctination, year, month, dayOfMonth, day, hour, minute);
		this.numberLine = numberLine;
		this.typeAirplane = typeAirplane;
	}

	public String getDesctination() {
		return desctination;
	}

	public void setDesctination(String desctination) {
		this.desctination = desctination;
	}

	public String getTypeAirplane() {
		return typeAirplane;
	}

	public void setTypeAirplane(String typeAirplane) {
		this.typeAirplane = typeAirplane;
	}

	public int getNumberLine() {
		return numberLine;
	}

	public void setNumberLine(int numberLine) {
		this.numberLine = numberLine;
	}

	@Override
	public String toString() {
		return "AirLine [desctination=" + desctination + ", typeAirplane=" + typeAirplane + ", numberLine=" + numberLine
				+ ", calendar=" + calendar + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calendar == null) ? 0 : calendar.hashCode());
		result = prime * result + ((desctination == null) ? 0 : desctination.hashCode());
		result = prime * result + numberLine;
		result = prime * result + ((typeAirplane == null) ? 0 : typeAirplane.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirLine other = (AirLine) obj;
		if (calendar == null) {
			if (other.calendar != null)
				return false;
		} else if (!calendar.equals(other.calendar))
			return false;
		if (desctination == null) {
			if (other.desctination != null)
				return false;
		} else if (!desctination.equals(other.desctination))
			return false;
		if (numberLine != other.numberLine)
			return false;
		if (typeAirplane == null) {
			if (other.typeAirplane != null)
				return false;
		} else if (!typeAirplane.equals(other.typeAirplane))
			return false;
		return true;
	}

}
