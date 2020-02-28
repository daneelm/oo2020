import java.io.*;
public class Palgad1{
    public static void main(String[] arg) throws Exception{
        double[] koefd=new double[5];
        BufferedReader br1=new BufferedReader(new FileReader("palksis.txt"));
        double puhver=1;
        for(int i=0; i<koefd.length; i++){
            koefd[i]=Double.parseDouble(br1.readLine());
            puhver=puhver*koefd[i];
        }
        double palk=Double.parseDouble(br1.readLine());
        double tingpalk=palk;
        double keskkoef=Math.pow(puhver, 1.0/koefd.length);
        br1.close();
        PrintWriter pw1=new PrintWriter("palkval.txt");
        pw1.println(palk+" "+keskkoef);
        for(int i=0; i<koefd.length; i++){
            palk=palk*koefd[i];
            tingpalk*=keskkoef;
            pw1.println(koefd[i]+" "+palk+" "+tingpalk);
        }
        pw1.close();
    }
}