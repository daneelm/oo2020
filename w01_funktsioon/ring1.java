import java.lang.Math.*;
public class ring1{
    public static void main(String[] arg){
        if(arg.length!=1){
            System.out.println("Palun sisesta ringi raadius");
            return;
        }
        int arv=Integer.parseInt(arg[0]);
        double S = 0;
        double P = 0;
        S = Math.PI * arv * arv;
        P = Math.PI * 2 * arv;
        System.out.println("Ringi pindala on " + S);
        System.out.println("Ringi raadius on " + P);
    }
}

[danieeel@greeny 01]$ java ring1 8
Ringi pindala on 201.06192982974676
Ringi raadius on 50.26548245743669