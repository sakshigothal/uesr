package sakshigothal;

class employee{
	int salary=15000;
}

public class DeveloperSingleInheritanceEx {//extends employee {
	int bonus=5000;
	public static void main(String[] args) {
		employee e=new employee();
		DeveloperSingleInheritanceEx d=new DeveloperSingleInheritanceEx();
		//System.out.println("salary="+d.salary+" " + "Bonus=" + d.bonus);// with extend keyword
		System.out.println("salary="+e.salary+" " + "Bonus=" + d.bonus);//without using extend keyword but creating super class object.variable_name
	}

}
