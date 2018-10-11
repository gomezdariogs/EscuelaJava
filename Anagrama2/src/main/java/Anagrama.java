import java.util.Arrays;

public class Anagrama {
    private boolean estado;

    public boolean sonAnagrama(String palabra1, String palabra2) {

        if (palabra1.length() != palabra2.length()) {
            this.estado = false;
        } else {
            char[] palabra1Array = palabra1.toLowerCase().toCharArray();
            char[] palabra2Array = palabra2.toLowerCase().toCharArray();
            Arrays.sort(palabra1Array);
            Arrays.sort(palabra2Array);
            if (Arrays.equals(palabra1Array,palabra2Array)) {
                this.estado = true;
            }
        }
        return estado;
    }
}
