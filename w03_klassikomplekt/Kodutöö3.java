public class Kodutöö3{
    public static void main(String[] arg){
        Kasutaja k1=new Kasutaja("Juhan", "Tamm");
        Kommentaar l1=new Kommentaar(k1, "Tere");
        System.out.println(l1);
        Kasutaja k2=new Kasutaja("Maali", "Maasikas");
        Kommentaar l2=new Kommentaar(k2, "Kuidas ilm õues on?");
        System.out.println(l2);
        Kommentaar l3=new Kommentaar(k1, "Sajab vihma");
        System.ou
    }
}

/*
28.2.2020 12:33 (Juhan Tamm) kirjutas: Tere
28.2.2020 12:33 (Maali Maasikas) kirjutas: Kuidas ilm õues on?
28.2.2020 12:33 (Juhan Tamm) kirjutas: Sajab vihma
*/