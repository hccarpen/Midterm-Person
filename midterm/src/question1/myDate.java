package question1;

public class myDate {
	private int month,
		day,
		year;
	
	private String[] months = {
			"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
	};
	
	public myDate(int month, int day, int year) {
		if (month <= 12 && month >= 1)
			this.month = month;
		this.day = day;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return months[this.month] + " " + this.day + ", " + this.year;
	}

}
