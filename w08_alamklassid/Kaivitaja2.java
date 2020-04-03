public class Kaivitaja2{
	public static void main(String[] arg) throws Exception{
		if(arg.length==3){
 		  TekstiUurija t=(TekstiUurija)Class.forName(arg[0]).newInstance();
		  System.out.println(t.loenda(arg[1], arg[2].charAt(0)));
		}
	}
	//Koostage omanimeline käivitaja (nt. KaivitajaJaagup), kuhu 
	//käsurealt antakse ette soovitud uuriva klassi nimi ning üks sõna
	//Klassi eksemplari töö abiga väljastatakse selle sõna tähtede arv
}

/*
[jaagup@greeny oo2020_alamklassid]$ java Kaivitaja2 TekstiUurijaSilver kuulilennuteetunneliluuk u
6

*/