public class Test{
	public static void main(String[] arg){
		Car1 asd=new Car1(324);
		asd.carModel();
		asd.carType();
		System.out.println(asd.fn(6.5));
		System.out.println(asd.fn(9.8));
	}
}


/*
[danieeel@greeny 06]$ java Test
Audi A8
Sedan
21.060000000000002
31.752000000000006
*/