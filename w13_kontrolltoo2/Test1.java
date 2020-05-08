import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
public class Test1{
    Letter t;
    @Test
	  public void occurrence1(){
      assertEquals(2, t.occurrence("pere", 'e'));
    }
    @Test
    public void occurrence2(){
      assertEquals(0, t.occurrence("pere", 'a'));
    }
    @Test
    public void occurrence3(){
      assertEquals(1, t.occurrence("pere", 'p'));
    }
    
    
}