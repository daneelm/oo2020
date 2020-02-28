import java.time.LocalDateTime;
 
public class Kommentaar{
    Kasutaja kasutaja;
    String kommentaar;
    LocalDateTime aeg = LocalDateTime.now();
 
    public Kommentaar(Kasutaja ukasutaja, String ukommentaar)
    {
        kasutaja = ukasutaja;
        kommentaar = ukommentaar;
    }

    public String toString()
    {
        return String.format(aeg.getDayOfMonth() + "." + aeg.getMonthValue() + "." + aeg.getYear() + " " + aeg.getHour() + ":" + aeg.getMinute() + " " + kasutaja.toString() + " kirjutas: " + kommentaar);
    }
}