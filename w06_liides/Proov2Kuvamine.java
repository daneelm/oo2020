public class Proov2Kuvamine{
	public static void kuva(Arvutatav a){
		for(int i=1; i<=5; i++){
			System.out.print(a.f(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] arg){
        kuva(new RingiPindala());
        kuva(new RuuduPindala());
        Arvutatav[] ad=new Arvutatav[3];
        ad[0]=new RistkylikuPindala(5);

        ad[1]=new RisttahukaRuumala(10, 4);
        ad[2]=new RisttahukaRuumala(25, 17);

        for(int i=0; i<ad.length; i++){
			kuva(ad[i]);
		}
	}
}

/*
[danieeel@greeny 06]$ java Proov2Kuvamine
3.141592653589793 12.566370614359172 28.274333882308138 50.26548245743669 78.53981633974483
1.0 4.0 9.0 16.0 25.0
5.0 10.0 15.0 20.0 25.0
40.0 80.0 120.0 160.0 200.0
425.0 850.0 1275.0 1700.0 2125.0
*/