package super_call;

public class ElectricCar extends Car{
	ElectricCar()
	{
		super(12);
		System.out.println("Electriccar No arg Constructor");
	}
	ElectricCar(int x)
	{
		super(34);
		System.out.println("Electriccar int arg Constructor");
	}

}
