import java.util.Scanner;
public class Test1{
	public static void main(String[] arg){
        //Kliides hallloom=new Kilpkonnatyyp2();
        //hallloom.tyyp([0][2],"ida");

        Scanner in = new Scanner(System.in);
        System.out.println("sisesta esimese kilpkonna x ");
        int x1 = in.nextInt();
        System.out.println("sisesta esimese kilpkonna y ");
        int y1 = in.nextInt();
        in.close();
        Kliides hallloom=new Kilpkonnatyyp3();
        int koordinaadid2[][] = {{x1,y1}};
        hallloom.tyyp1(koordinaadid2,"ida");


        System.out.println(hallloom+" hallloom");
        hallloom.edasi();
        hallloom.edasi();
        System.out.println(hallloom+" hallloom");
    }
}

/*
[danieeel@greeny asd]$ java Test1
sisesta esimese kilpkonna x
2
sisesta esimese kilpkonna y
1
2 1 ida hallloom
4 1 ida hallloom
*/