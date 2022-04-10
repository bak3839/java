package week3;

public class Date {
	private int year;
	private int day;
	private String month;
	
    public Date() {
		this(1900,"1¿ù",1);
	}
    
    public Date(int year) {
		this(year,"1¿ù", 1);
	}
    
	public Date(int year, String month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return "Date [year="+year+", month="+month+", day="+day+"]";
	}
}
