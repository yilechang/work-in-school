
public class Q2Time extends Q2Date{
	protected int hour, minute, second ;
	
	public Q2Time(int year, int month, int day) {
		super(year, month, day) ;
	}

	public  Q2Time(int year, int month, int day, int hour, int minute, int second) {
		super(year, month, day) ;
		this.hour = hour ;
		this.minute = minute ;
		this.second = second ;
	}

	

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	@Override
	public String toString() {
		return "" + year + "/" + month + "/" + day + " " + hour + ":" + minute
				+ ":" + second + "";
	}
	
}
