import java.lang.StringBuilder;
public class Solution {

    /**
     * Este metodo hace un camel case de un string separado por "-" o "_" o una mezcla de ambos tomando como separador estos caracteres,
     * el metodo respeta la primera letra de la primera palabra, sea mayuscula o minuscula y convierte el resto de palabras.
     * @param s el parametro es un string
     * @return retorna el string covertido a camel case
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
