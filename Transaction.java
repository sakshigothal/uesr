package sakshigothal;
abstract class bankk{
	abstract void getBalance();
}
class bankA extends bankk{
	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("In bank A $100 deposited.......");
	}}
class bankB extends bankk{
	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("In bank B $150 deposited........");
	}}
class bankC extends bankk{
	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("In bank C $200 deposited........");
	}}
public class Transaction {
public static void main(String[] args) {
	bankA a=new bankA();
	a.getBalance();
	bankB b= new bankB();
	b.getBalance();
	bankC c=new bankC();
	c.getBalance();
}
}
