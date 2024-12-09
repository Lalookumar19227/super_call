package super_call;

public class Vehicle {
	int x=12;
	private int y=50;
	
	public void start()
	{
		System.out.println("Start the Vehicle");
	}
	
	Vehicle()
	{
		System.out.println("Vehicle No arg Constructor");
	}
	Vehicle(int x)
	{
		System.out.println("Vehicle int arg Constructor");
	}
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		
	}
	
	
	
	
	

}
