public class Wrappers {
    public static void main(String[] args) {

        Integer wInteger = Integer.valueOf(1323);
        Boolean wBoolean = Boolean.valueOf(true);
        Character wCharacter = Character.valueOf('%');
        Double wDouble = Double.valueOf(0.554285);
        String toStringDouble = wDouble.toString();

        System.out.println(toStringDouble);
    }
}

