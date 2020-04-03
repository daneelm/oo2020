public class Kaivitaja1{
	public static void main(String[] arg) throws Exception{
<<<<<<< HEAD
		TekstiUurija t=(TekstiUurija)Class.forName("TekstiUurijaRobin").newInstance();
=======
		TekstiUurija t=(TekstiUurija)Class.forName("TekstiUurijaSandra").newInstance();
>>>>>>> 698b953e7ae370bafc026c34c437dd25ad84f7a4
		System.out.println(t.loenda("Ahoi", 'i'));
	}
}