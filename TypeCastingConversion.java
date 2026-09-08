public class TypeCastingConversion {
    public static void main(String[] args) {
        int number = 10;
        double conversion = number; // automatic conversion

        double decimal = 9.8;
        int casting = (int) decimal; // explicit casting

        System.out.println("Conversion: " + conversion);
        System.out.println("Casting: " + casting);
    }
}
