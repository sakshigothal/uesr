package sakshigothal;

public class switchstatement {
public static void main(String[] args) {
	int i=3;
	String weeks="";
	switch(i){
	case 1:
		weeks="monday";
		//System.out.println("monday");
		break;
	case 2:
		weeks="tuesday";
		//System.out.println("tuesday");
		break;
	case 3:
		weeks="whensday";
		//System.out.println("whensday");
		break;
	case 4:
		weeks="thursday";
		//System.out.println("Thursday");
		break;
	case 5:
		weeks="friday";
		//System.out.println("Friday");
		break;
	case 6:
		weeks="saturday";
		//System.out.println("Saturday");
		break;
	case 7:
		weeks="sunday";
		//System.out.println("Sunday");
		break;
		default:
			System.out.println("invalid");

	}
	System.out.println(weeks);
	
	char alpha='b';
	switch(alpha) {
	case 'a':
		System.out.println('a');
		break;
	case 'b':
		System.out.println('b');
		break;
	case 'c':
		System.out.println('c');
		break;
		default:
			System.out.println("invalid");


	}
	for(char a='A';a<='Z';a++) {
		System.out.println(a);
	}
	

}

}
