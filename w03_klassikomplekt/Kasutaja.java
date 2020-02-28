public class Kasutaja{
    String eesNimi;
    String pereNimi;
 
    public Kasutaja(String ueesNimi, String upereNimi)
    {
        eesNimi = ueesNimi;
        pereNimi  = upereNimi;
    }

    public String toString()
    {
        return "("+eesNimi+" "+pereNimi+")";
    }
}