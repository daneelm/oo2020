public class Proov1{
	public static void main(String[] arg){
		Arvutatav a=new RingiPindala();
        System.out.println(a.f(2));
        Arvutatav b=new RuuduPindala();
        System.out.println(b.f(2));
        Arvutatav c=new RuuduPindala();
        System.out.println(c.f(67));
        Arvutatav d=new RuuduPindala();
        System.out.println(d.f(32));
	}
}

/*
[danieeel@greeny 06]$ java Proov1
12.566370614359172
4.0
4489.0
1024.0
*/