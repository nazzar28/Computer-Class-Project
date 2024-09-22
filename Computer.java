public class Computer {
    private String brand;
    private String model;
    private String processor;
    private int ram;

    public Computer() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.processor = "Unknown";
        this.ram = 0;
    }

    public Computer(String brand, String model, String processor, int ram) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
    }

    public void displayInfo() {
        System.out.println("Computer Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
    }

    public void upgradeRam(int additionalRam) {
        this.ram += additionalRam;
        System.out.println("RAM updated. New RAM: " + this.ram + " GB");
    }
}
