interface Cars{
	public void carModel();
	public void carType();
}

interface FuelConsumption{
	public double fn(double a);
}

public class Car1 implements Cars, FuelConsumption{
	public void carModel(){
		System.out.println("Audi A8");
	}
	public void carType(){
		System.out.println("Sedan");
	}

	double distance;
	public Car1(double udistance){
		distance=udistance;
	}

	public double fn(double liter){
		return distance/100*liter;
	}
}