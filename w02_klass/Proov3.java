public class Proov3{
    public static void main(String[] arg){
        Kodutöö2 tööline1=new Kodutöö2("Maali", "Maasikas", 25, "müüja", "tööl", 1354.70);
        Kodutöö2 tööline2=new Kodutöö2("Juku", "Juurikas", 18, "töötu", "poes", 320.20);
        System.out.println(tööline1.toString());
        tööline1.koht("kodus");
        tööline1.palk(832.40);
        System.out.println(tööline1);
        System.out.println(tööline2);
        tööline2.poesKäik(12);
        tööline2.töö("ehitaja");
        tööline2.koht("Soomes");
        System.out.println(tööline2);
    }
}

[danieeel@greeny oo]$ java Proov3
(Maali, Maasikas, 25, müüja, tööl, 1354.7)
(Maali, Maasikas, 25, müüja, kodus, 2187.1)
(Juku, Juurikas, 18, töötu, poes, 320.2)
(Juku, Juurikas, 18, ehitaja, Soomes, 308.2)
