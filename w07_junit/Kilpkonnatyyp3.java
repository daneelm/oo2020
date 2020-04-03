public class Kilpkonnatyyp3 implements Kliides{
    int koordinaadid[][];
    String suund;
    public void tyyp1(int ukoordinaadid[][], String usuund){
        koordinaadid = ukoordinaadid;
        suund=usuund;
    }

    public String toString(){
        return koordinaadid[0][0] + " " + koordinaadid[0][1] + " " + suund;
    }


    public int kysiX(){return koordinaadid[0][0];}
    public int kysiY(){return koordinaadid[0][1];}
    

    
    public void paremale(){
        if(suund.equals("ida")){suund="lõuna";}
        else if(suund.equals("lõuna")){suund="lääs";}
        else if(suund.equals("lääs")){suund="põhi";}
        else {suund="ida";}
    }
    public void edasi(){
        int x = koordinaadid[0][0];
        int y = koordinaadid[0][1];
        if(suund.equals("ida")){x++; koordinaadid[0][0] = x;}
        if(suund.equals("lõuna")){y++; koordinaadid[0][1] = y;}
        if(suund.equals("lääs")){x--; koordinaadid[0][0] = x;}
        if(suund.equals("põhi")){y--; koordinaadid[0][1] = y;}
    }
}