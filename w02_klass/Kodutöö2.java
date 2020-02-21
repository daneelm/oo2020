public class Kodutöö2{
    String nimi;
    String perenimi;
    int vanus;
    String amet;
    String asukoht;
    double raha;

    public Kodutöö2(String unimi, String uperenimi, int uvanus, String uamet, String uasukoht, double uraha){
        nimi=unimi;
        perenimi=uperenimi;
        vanus=uvanus;
        amet=uamet;
        asukoht=uasukoht;
        raha=uraha;
    }

    public String toString(){
        return "("+nimi+", "+perenimi+", "+vanus+", "+amet+", "+asukoht+", "+raha+")";
    }
    
    public void koht(String uusasukoht){
        asukoht = uusasukoht;
    }
    public void töö(String uusamet){
        amet = uusamet;
    }

    public void poesKäik(double arve){
        
        if(raha<arve){
            System.out.println("pole nii palju raha  "+this.toString());
        }
        else{
            raha = raha - arve;
        }
    }

    public void palk(double ülekanne){
        raha = raha + ülekanne;
    }
}