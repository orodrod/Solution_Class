import java.lang.StringBuilder;
public class Solution {

    /**
     * Este metodo es una prueba.
     * @param s
     * @return
     */
    static String toCamelCase(String s){
        String letras[] = s.split("");
        String texto = "";
        boolean mayus = false;
        for (String str: letras){
            if(str.equals("-") || str.equals("_")){
                mayus = true;
            }else{
                if(mayus){
                    texto = texto + str.toUpperCase();
                    mayus = false;
                }else{
                    texto = texto + str;
                }
            }
        }
        return texto;
    }

}
