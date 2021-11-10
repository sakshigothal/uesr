package sakshigothal;
class vehicle{
	void drive() {
		System.out.println("It is use for tavelling");
	}}
class twowheeler extends vehicle{
	int wheels=2;
	void horn() {
		System.out.println("Bicycle is two wheeler vehicle");
	}}
class fourwheeler extends twowheeler {
	int wheel=4;
	void breakk() {
		System.out.println("Honda is a four wheeler vehicle");
	}}
public class HierachicalInheritance {
	public static void main(String[] args) {
		fourwheeler f=new fourwheeler();
		f.drive();
		f.breakk();
		System.out.println("Honda have " + f.wheel + " "+ "wheels");
		twowheeler t=new twowheeler();
		t.drive();
		t.horn();
		System.out.println("Bicycle have "+t.wheels+" " + "wheels");
	}}
