public class Proov{
    
    public static void main(String[] arg){
        Jook j1=new Jook("vesi", 0.4, 0.5);
        Joogipudel p1=new Joogipudel(0.5, "klaas", 0.2, 0.1, j1);
        Joogipudel p2=new Joogipudel(0.5, "plast", 0.05, 0.1, null);
        System.out.println(j1.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.kysiMass());
        System.out.println(p2.kysiMass());
        System.out.println(p1.kysiOmahind());
        System.out.println(p2.kysiOmahind());

        Jook j2=new Jook("limonaad", 0.2, 1.1);
        Joogivaat v1=new Joogivaat(50, 15, j2);
        System.out.println(v1.toString());
        Joogipudel p3=new Joogipudel(1.5, "plast", 0.07, 0.1, null);
        System.out.println(p3);
        v1.taida(p3);
        System.out.println(v1);
        System.out.println(p3);

        Joogipudel[] pd=new Joogipudel[10];
        for(int i=0; i<pd.length; i++){
            pd[i]=new Joogipudel(1.5, "plast", 0.07, 0.1, null);
        }
        for(int i=0; i<pd.length; i++){
            v1.taida(pd[i]);
            System.out.println(pd[i]);
        }
        System.out.println(v1);
    }
}