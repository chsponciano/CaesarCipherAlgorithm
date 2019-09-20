/**
 *
 * @author Carlos Ponciano & Vinicius Luis
 */
public abstract class CodingAlgorithm {

    public static String encryption(final String text, final int rotation) {
        String out = "";
        char aux;
        
        for (int i = 0; i < text.toCharArray().length; i++) {
            aux = text.charAt(i);
            
            if (Character.isLetter(aux)){
                aux += rotation;
            }
            
            out += String.valueOf(aux);
        }

        return out;
    }

    public static String deciphering(final String encryption, final int rotation) {
        String out = "";
        char aux;
        
        for (int i = 0; i < encryption.toCharArray().length; i++) {
            aux = encryption.charAt(i);
            
            if (Character.isLetter(aux)){
                aux -= rotation;
            }
            
            out += String.valueOf(aux);
        }

        return out;
    }
}
