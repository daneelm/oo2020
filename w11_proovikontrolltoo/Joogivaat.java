public class Joogivaat{
    double ruumala;
    double joogiKogus;
    Jook sisu;
    public Joogivaat(double uruumala, double ujoogiKogus, Jook usisu){
        ruumala = uruumala;
        joogiKogus = ujoogiKogus;
        sisu=usisu;
    }
    public String toString(){
        return ruumala + " " +  joogiKogus;
    }

    public void taida(Joogipudel p){
        if(p.kysiSisu()==null){
            if(p.kysiMaht()<=joogiKogus){
                p.uusSisu(sisu);
                joogiKogus-=p.kysiMaht();
            }
        }
    }
    public void taida(Joogipudel[] pudelid){
        for(int i=0; i<pudelid.length; i++){
            taida(pudelid[i]);
        }
    }
    
}