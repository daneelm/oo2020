public class Kilpkonnatyyp2 implements Kliides{
    int x;
    int y;
    String suund;
    public void tyyp(int ux, int uy, String usuund){
        x=ux;
        y=uy;
        suund=usuund;
        if(!kasAsukohtSobib()){
            System.out.println("Sobimatu asukoht "+this.toString());
        }
    }

    public String toString(){
        return x + " " + y + " " + suund;
    }
    public boolean kasAsukohtSobib(){
        if(x<1){return false;}
        if(y<1){return false;}
        if(x>4){return false;}
        if(y>4){return false;}
        return true;
    }
    public int kysiX(){return x;}
    public int kysiY(){return y;}


    
    public void paremale(){
        if(suund.equals("ida")){suund="lõuna";}
        else if(suund.equals("lõuna")){suund="lääs";}
        else if(suund.equals("lääs")){suund="põhi";}
        else {suund="ida";}
    }
    public void edasi(){
        if(suund.equals("ida")){x++;}
        if(suund.equals("lõuna")){y++;}
        if(suund.equals("lääs")){x--;}
        if(suund.equals("põhi")){y--;}
    }
}