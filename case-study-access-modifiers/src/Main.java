import com.os.laptop.Asus;
import com.os.laptop.Laptop;
import com.os.laptop.Lenovo;

public class Main {
    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[2];
        /*
        We can't instantiate a new laptop object with the constructor because we defined it's constructor as "protected". Only it's children can use the parents constructor. We can't access it outside.
         */
        // laptops[0] = new Laptop("Intel i7", "Nvidia RTX 2080", 16, 512);

        laptops[0] = new Asus("Intel i7", "Nvidia RTX 2080", 16, 512, "ROG Zephyrus");
        laptops[1] = new Lenovo("Intel i5", "Nvidia GTX 1050", 8, 256, "Fingerprint Scanner");

        for (Laptop laptop : laptops) {
            /*
            We can't access printSpecs() method through the laptop object because we defined it as "protected". It can be only called inside the Laptop class and it's children.
             */
           // laptop.printSpecs();
            laptop.print();
            System.out.println();
        }

        /*
        We can't use the enum we created outside it's package because when we don't specify any access modifier, it will be "default" by default which can be only accessible inside it's package created. In this case, "com.os.laptop" since "Main" class is outside of the "com.os.laptop" package.
         */
        // System.out.println(LaptopCategory.WORK);
    }
}
