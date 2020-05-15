class Punktmass extends AbstraktnePunktmass{
    double kg,x;
    public Punktmass(double kg, double x){
        this.kg=kg; this.x=x;
    }
    public double massikeseX(){return x;}
    public double kysiKg(){return kg;}
    //public String tekstina(int sygavus){return taane(sygavus)+x+" "+kysiKg()+" kg";}
}