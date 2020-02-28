import java.util.stream.*;

public class Arvutus{
    public static double geomKeskmine(double arv1, double arv2){
        return Math.sqrt(arv1*arv2);
    }
    public static double geomKeskmine2(double[] arvud) {
        double korrutis=1;
        /*for(double i : arvud) {
            korrutis *= i;
        }*/
        double pikkus=arvud.length;
        for (int i = 0; i < pikkus; i++) {
            korrutis = arvud[i] * korrutis;
          }
        
        return Math.pow(korrutis, 1/pikkus);
    }
    public static void main(String[] arg){
        System.out.println(geomKeskmine(4, 9));
        double[] arvud = {5,2,3,4,8,20};
        System.out.println(geomKeskmine2(arvud));
    }
}


