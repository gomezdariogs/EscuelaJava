public class Anagrama {




    public boolean sonAnagrama(String palabra1, String palabra2) {
        boolean estado = false;
        int contador = 0;
        String palabra1SinCase = palabra1.toLowerCase();
        String palabra2SinCase =palabra2.toLowerCase();
        if (palabra1.length() != palabra2.length()) {
            estado = false;
        } else {
            for (int i = 0; i < palabra1.length(); i++) {
                for (int j = 0; j < palabra2.length(); j++) {
                    if (palabra1SinCase.charAt(i) == palabra2SinCase.charAt(j)) {
                        contador++;
                        break;
                    }
                }
            }
        }
        if (palabra1.length() == contador) {
            estado = true;
        }
        return estado;
    }
}
