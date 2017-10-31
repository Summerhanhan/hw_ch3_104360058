package han_ch3_p9;

import han_ch3_p9.Car;

public class han_ch3_p9 {
	public static void main(String[] args) {
	
		Car car1;
		car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		

		
	}
}

//Car類別
class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
		
	}
}
