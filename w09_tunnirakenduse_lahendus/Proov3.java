public class Proov3{
    public static void main(String[] arg){
        PunktmassiPaar paar1=new PunktmassiPaar(
           new Punktmass(5, 3),
           new Punktmass(2, 10)
        );
        System.out.println(paar1.massikeseX());

        PunktmassiPaar paar2=new PunktmassiPaar(
           paar1,
           new Punktmass(10, 15)
        );
        System.out.println(paar2.massikeseX());
        System.out.println(paar2.tekstina(0));
    }
}