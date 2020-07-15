package peter;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap < String, String > hardware = new HashMap<>();
      hardware.put("CPU","Intel i6700K");
      hardware.put("RAM", "32GB 3200MHz DDR4 (2x16");
      hardware.put("GPU", "Nvidia Geforce GTX1080 A8G");
      hardware.put("Mainboard", "Asus x170 Mx8H");
      hardware.put("Storage", "Samsung 960Evo 500GB NVMe.M2 SSD");

    System.out.println(hardware);
  }
}
