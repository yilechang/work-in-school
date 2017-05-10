
public class TimeTest {
	
	    public static void main(String[] args) {
	        Time time1 = new Time(2012,5,3);
	        Time time2 = new Time(2012,5,24,18,10,0);
	        Time time3 = new Time(2012,3,29,18,11,11);
	        time1.setHour(18);
	        time1.setMinute(15);
	        time1.setSecond(10);
	        System.out.println("Time1: "+time1);  // call toString() in class Time
	        System.out.println("Time2: "+time2);
	        System.out.println("Time3: "+time3);
	    }
}

