public class KaivitajaDaniel{
	public static void main(String[] arg) throws Exception{
		if(arg.length==2){
 		  TekstiUurija t=(TekstiUurija)Class.forName(arg[0]).newInstance();
          //System.out.println(t.loenda(arg[1], arg[2].charAt(0)));
          System.out.println(t.t2htedeArv(arg[1]));
		}
	}
}

/*
[danieeel@greeny oo2020_alamklassid]$ java KaivitajaDaniel TekstiUurijaDaniel taishaalik
10

*/