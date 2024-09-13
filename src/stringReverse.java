public class stringReverse {
    public static void main(String[] args) {
        String original = "exemplo";
        String invertida = inverterString(original);
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        char[] invertida = new char[caracteres.length];

        for (int i = 0; i < caracteres.length; i++) {
            invertida[caracteres.length - 1 - i] = caracteres[i];
        }

        return new String(invertida);
    }
}
