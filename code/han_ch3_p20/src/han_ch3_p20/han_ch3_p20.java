package han_ch3_p20;
public class han_ch3_p20 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas =-10;
		car1.show();
	}
}
//Car���O
class Car
{
	int num;
	double gas;
	
	void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
