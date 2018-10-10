public class Main {
    public static void main(String[] args){
        System.out.println("Son anagramas? " + sonAnagrama("holaaah","haaolha"));
    }


    public static boolean sonAnagrama(String palabra1, String palabra2){
        boolean estado = false;
        int contador = 0;
        if (palabra1.length() != palabra2.length()){
            estado= false;
        }else{
            for (int i = 0; i < palabra1.length(); i++) {
                for (int j = 0; j < palabra2.length(); j++) {
                    if (palabra1.charAt(i) == palabra2.charAt(j)) {
                        contador++;
                        break;
                    }
                }
            }
        }
        if (palabra1.length() == contador){
            estado = true;
        }
        return estado;
    }

    }

