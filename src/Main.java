public class Main {
    public static void main(String[] args) {
        Solution solucion = new Solution();

        System.out.println("Ejemplo 1: " + solucion.toCamelCase("omar-Ari-Evelyn-ruth_Alvaro"));
        System.out.println("Ejemplo 2: " + solucion.toCamelCase("Omar-ari-Evelyn-ruth_Alvaro"));
        System.out.println("Ejemplo 3: " + solucion.toCamelCase("Omar-ari-Evelyn_Ruth_Alvaro"));
        System.out.println("Ejemplo 4: " + solucion.toCamelCase("omar-Ari-evelyn_ruth_Alvaro"));
    }
}