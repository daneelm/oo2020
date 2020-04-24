public class Joogipudel{
    double maht;
    String pudelityyp;
    double mass;
    double taaraMaksumus;
    Jook pudeliSisu;
    public Joogipudel(double umaht, String upudelityyp, double umass, double utaaraMaksumus, Jook upudeliSisu){
        maht = umaht;
        pudelityyp = upudelityyp;
        mass = umass;
        taaraMaksumus = utaaraMaksumus;
        pudeliSisu = upudeliSisu;
    }
    public String toString(){
        return maht + " " +  pudelityyp + " " + mass + "kg " + taaraMaksumus + "eur " + pudeliSisu;
    }

    public double kysiMass(){
        if(pudeliSisu==null){return mass;}
        return mass+maht*pudeliSisu.kysiErikaal();
    }

    public double kysiOmahind(){
        if(pudeliSisu==null){return taaraMaksumus;}
        return taaraMaksumus+maht*pudeliSisu.kysiOmahind();
    }

    public double kysiMaht(){return maht;}
    public Jook kysiSisu(){return pudeliSisu;}
    public void uusSisu(Jook j){pudeliSisu=j;}
}