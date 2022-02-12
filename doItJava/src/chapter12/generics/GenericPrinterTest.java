package chapter12.generics;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();

        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
//        System.out.println(powderPrinter);
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
//        System.out.println(plasticPrinter);
        plasticPrinter.printing();
    }
}
