package sakshigothal;

public class EnumExample {
	enum season{
		WINTER,RAINY,SUMMER,SPRING;
	}
	enum weekdays{
		MODAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
public static void main(String[] args) {
	System.out.println(season.SPRING);
	System.out.println(season.values());
	for(season s:season.values()) { //always use for each loop for enum
		System.out.println(s+" " + s.ordinal());//ordinal used for numbering
	}
	System.out.println(season.valueOf("SPRING").ordinal());
	System.out.println(weekdays.values());
	for(weekdays w:weekdays.values()) {
		System.out.println(w.ordinal()+" " + w);
	}
	System.out.println(weekdays.valueOf("SUNDAY").ordinal());
}
}
