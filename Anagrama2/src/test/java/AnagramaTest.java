import org.junit.Assert;
import org.junit.Test;

public class AnagramaTest {

    @Test
    public void testAnagrama1() {
        Anagrama anagrama = new Anagrama();
        Assert.assertTrue(anagrama.sonAnagrama("hola", "ohla"));
    }

    @Test
    public void testAnagrama2() {
        Anagrama anagrama = new Anagrama();
        Assert.assertTrue(anagrama.sonAnagrama("Hoolaaa", "aloohaa"));
    }

    @Test
    public void testAnagramaFallido1() {
        Anagrama anagrama = new Anagrama();
        Assert.assertFalse(anagrama.sonAnagrama("perro", "ropero"));
    }

    @Test
    public void testAnagramaFallido2() {
        Anagrama anagrama = new Anagrama();
        Assert.assertFalse(anagrama.sonAnagrama("perro", "perpo"));
    }
}
