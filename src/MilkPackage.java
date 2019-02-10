public class MilkPackage {
    private String producerName;
    private double fatness;
    private double packageVolume;
    private double caloricContent;
    private double amountOfProteins;
    private double amountOfCarbohydrates;

    protected double amountOfFats;
    protected double price;

    public static int numberOfIngredients;

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public double getFatness() {
        return fatness;
    }

    public void setFatness(double fatness) {
        this.fatness = fatness;
    }

    public double getPackageVolume() {
        return packageVolume;
    }

    public void setPackageVolume(double packageVolume) {
        this.packageVolume = packageVolume;
    }

    public double getCaloricContent() {
        return caloricContent;
    }

    public void setCaloricContent(double caloricContent) {
        this.caloricContent = caloricContent;
    }

    public double getAmountOfProteins() {
        return amountOfProteins;
    }

    public void setAmountOfProteins(double amountOfProteins) {
        this.amountOfProteins = amountOfProteins;
    }

    public double getAmountOfCarbohydrates() {
        return amountOfCarbohydrates;
    }

    public void setAmountOfCarbohydrates(double amountOfCarbohydrates) {
        this.amountOfCarbohydrates = amountOfCarbohydrates;
    }

    public double getAmountOfFats() {
        return amountOfFats;
    }

    public void setAmountOfFats(double amountOfFats) {
        this.amountOfFats = amountOfFats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MilkPackage() {
        this("Unknown", 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

    public MilkPackage(String producerName, double fatness, double packageVolume, double caloricContent) {
        this(producerName, fatness, packageVolume, caloricContent, 0.0, 0.0, 0.0, 0.0);
    }

    public MilkPackage(String producerName, double fatness, double packageVolume, double caloricContent, double amountOfProteins, double amountOfCarbohydrates, double amountOfFats, double price) {
        setProducerName(producerName);
        setFatness(fatness);
        setPackageVolume(packageVolume);
        setCaloricContent(caloricContent);
        setAmountOfProteins(amountOfProteins);
        setAmountOfCarbohydrates(amountOfCarbohydrates);
        setAmountOfFats(amountOfFats);
        setPrice(price);
    }

    public String toString() {
        String string = null;
        System.out.print("Milk Package Information:\n\n");
        if (getProducerName().equals("Unknown")) {
            System.out.print("No information about this milk\n");
        } else if (!getProducerName().equals("Unknown")) {
            System.out.print("Producer Name: " + getProducerName() + "\nFatness: " + getFatness() + "%\nPackage Volume: " + getPackageVolume() + " ml\nCaloric Content(100g): " + getCaloricContent() + " kkal\n");
            if (getAmountOfProteins() != 0.0) {
                System.out.print("Number of ingredients: " + numberOfIngredients + "\nProtheins(100g): " + getAmountOfProteins() + " g\nCarbohydrates(100g): " + getAmountOfCarbohydrates() + " g\nFats(100g): " + getAmountOfFats() + " g\nPrice: " + getPrice() + " grn\n");
            }
        }
        System.out.print("-----------------------------------------------------\n");
        return string;
    }

    public static void printStaticNumberOfIngredients() {
        System.out.print("Number of ingredients in this type of milk: " + numberOfIngredients + "\n-----------------------------------------------------\n");
    }

    public void printNumberOfIngredients() {
        System.out.print("Number of ingredients in this milk: " + numberOfIngredients + "\n-----------------------------------------------------\n");
    }

    public void resetValues(String producerName, double fatness, double packageVolume, double caloricContent) {
        this.producerName = producerName;
        this.fatness = fatness;
        this.packageVolume = packageVolume;
        this.caloricContent = caloricContent;
    }

    public void resetValues(String producerName, double fatness, double packageVolume, double caloricContent, double amountOfProteins, double amountOfCarbohydrates, double amountOfFats, double price) {
        this.resetValues(producerName, fatness, packageVolume, caloricContent);
        this.amountOfProteins = amountOfProteins;
        this.amountOfCarbohydrates = amountOfCarbohydrates;
        this.amountOfFats = amountOfFats;
        this.price = price;
    }
}