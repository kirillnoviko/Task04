package by.htp.les.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Company implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<AirLine> airline;

	public Company() {
		this.airline = new ArrayList<>();
	}

	public AirLine getAirline(int index) {
		return airline.get(index);
	}

	public List<AirLine> getAirline() {
		return airline;
	}

	public void setAirline(List<AirLine> airline) {
		this.airline = airline;
	}

	public boolean add(AirLine airline) {
		return this.airline.add(airline);
	}

	public boolean remove(AirLine airline) {
		return this.airline.remove(airline);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airline == null) ? 0 : airline.hashCode());
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
		Company other = (Company) obj;
		if (airline == null) {
			if (other.airline != null)
				return false;
		} else if (!airline.equals(other.airline))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company [airline=" + airline + "]";
	}

}
