import java.util.*; 
import java.lang.Math; 

public class kt{

    public static double vahe(double arv1, double arv2){
        double vastus;
        vastus = arv1 - arv2;
        double aVahe;
        vastus = vastus;
        if(vastus < 0){
            vastus = vastus * (-1);
        }

        System.out.println("vahe absoluutväärtus: " + "|" + vastus +"|");



        if(arv1>arv2){
            
            int i = 1;
            /*if(arv1 % 10 < arv2 % 10 & arv1 > 10){
                System.out.printf("%7s\n", ".");}
            if(arv1 % 100 < arv2 % 100 & arv1 > 100){
                System.out.printf("%6s\n", ".");}
            if(arv1 % 1000 < arv2 % 1000 & arv1 > 1000){
                System.out.printf("%5s\n", ".");}
            if(arv1 % 10000 < arv2 % 10000 & arv1 > 10000){
                System.out.printf("%4s\n", ".");}*/
            while(i<5){
                if(arv1 % Math.pow(10, i) < arv2 % Math.pow(10, i) & arv1 > Math.pow(10, i)){
                    System.out.printf("%"+(8-i)+"s \n", ".");
                }
                i++;
            }
                
            System.out.printf("%10.1f\n",arv1);
            System.out.printf("%10.1f\n",arv2);
            System.out.printf("%10.1f\n",vastus);
        }else{
            int i = 1;
            /*if(arv2 % 10 < arv1 % 10 & arv2 > 10){
                System.out.printf("%7s\n", ".");}
            if(arv2 % 100 < arv1 % 100 & arv2 > 100){
                System.out.printf("%6s\n", ".");}
            if(arv2 % 1000 < arv1 % 1000 & arv2 > 1000){
                System.out.printf("%5s\n", ".");}
            if(arv2 % 10000 < arv1 % 10000 & arv2 > 10000){
                System.out.printf("%4s\n", ".");}*/
                        
            while(i<5){
                if(arv2 % Math.pow(10, i) < arv1 % Math.pow(10, i) & arv2 > Math.pow(10, i)){
                    System.out.printf("%"+(8-i)+"s \n", ".");
                }
                i++;
            }                    
                
            
             
            System.out.printf("%10.1f\n",arv2);
            System.out.printf("%10.1f\n",arv1);
            System.out.printf("%10.1f\n",vastus);
        }

 
        return vastus;
    }

    public static void main(String[] arg){
        Scanner input = new Scanner (System.in);
        System.out.print("sisesta esimene number ");
        double arv1 = input.nextDouble();
        System.out.print("sisesta teine number ");
        double arv2 = input.nextDouble();
        vahe(arv1,arv2);
    }
}