public class Proov3Kuvamine{
	public static void kuva(Arvutatav a){
		for(int i=1; i<=5; i++){
			System.out.print(a.f(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] arg){
		Arvutatav[] ad=new Arvutatav[6];
        ad[0]=new RingiPindala();
		ad[1]=new RistkylikuPindala(3);
        ad[2]=new RistkylikuPindala(8);
        ad[3]=new RistkylikuPindala(5);

        ad[4]=new RisttahukaRuumala(32, 14);
        ad[5]=new RisttahukaRuumala(56, 81);

		for(int i=0; i<ad.length; i++){
			kuva(ad[i]);
		}
	}
}

/*
[danieeel@greeny 06]$ java Proov3Kuvamine
3.141592653589793 12.566370614359172 28.274333882308138 50.26548245743669 78.53981633974483
3.0 6.0 9.0 12.0 15.0
8.0 16.0 24.0 32.0 40.0
5.0 10.0 15.0 20.0 25.0
448.0 896.0 1344.0 1792.0 2240.0
4536.0 9072.0 13608.0 18144.0 22680.0
*/