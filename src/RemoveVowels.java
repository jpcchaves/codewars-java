public class RemoveVowels {
    public static void main(String[] args) {

        System.out.println(removeVowels("Atirei o pau no gato aaeellleedWeFda"));
    }

    public static String removeVowels(String rawString) {
        return rawString.replaceAll("[aeiouwAEIOUW]", "");
    }
}