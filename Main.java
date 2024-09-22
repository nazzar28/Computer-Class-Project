public class Main {
    public static void main(String[] args) {
        Computer defaultComputer = new Computer();
        defaultComputer.displayInfo();

        Computer myComputer = new Computer("Apple", "MacBook Pro", "Intel Core i7", 16);
        myComputer.displayInfo();

        myComputer.upgradeRam(8);
    }
}
