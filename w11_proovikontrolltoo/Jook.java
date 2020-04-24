public class Jook{
    String nimetus;
    double liitriHind;
    double erikaal;

    public Jook(String unimetus, double uliitriHind, double uerikaal){
        nimetus = unimetus;
        liitriHind = uliitriHind;
        erikaal = uerikaal;
    }

    public String toString(){
        return nimetus + " " +  liitriHind + " " + erikaal;
    }

    public String kysiNimetus(){return nimetus;}
    public double kysiOmahind(){return liitriHind;}
    public double kysiErikaal(){return erikaal;}
}