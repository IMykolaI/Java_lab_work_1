public class Main {
    public static void main(String[] args) {
        MilkPackage.numberOfIngredients = 2;
        MilkPackage.printStaticNumberOfIngredients();
        MilkPackage Standart = new MilkPackage();
        Standart.toString();
        MilkPackage Galychanske = new MilkPackage("Galychyna", 2.5, 873.79, 51.70);
        Galychanske.toString();
        Galychanske.resetValues("Changed", 5, 800,40.5);
        Galychanske.toString();
        MilkPackage Yagotynske = new MilkPackage("Yagonysk's butter factory", 2.6, 873.79, 53.00, 2.80, 4.70, 2.60, 22.30);
        Yagotynske.toString();
        Yagotynske.resetValues("Changed 2.0", 50, 900, 500, 0.03, 10, 1.7, 800.5);
        Yagotynske.toString();
        Yagotynske.printNumberOfIngredients();
    }
}