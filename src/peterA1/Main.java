package peterA1;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {

    HashMap < String, String > hardware = new HashMap<>();
      hardware.put("CPU","Intel i6700K");
      hardware.put("RAM", "16GB 3200MHz DDR4 (1x16");
      hardware.put("GPU", "integrated graphics");
      hardware.put("Mainboard", "Asus x170 Mx8H");
      hardware.put("Storage", "Samsung 960Evo 500GB NVMe.M2 SSD");

    System.out.println(hardware);

      hardware.replace("GPU","Nvidia Geforce GTX1080 A8G");

    String cpu = hardware.get("CPU");
    System.out.println(cpu);

    if (hardware.containsKey("RAM")) {
            hardware.replace("RAM","32GB 3200MHz DDR4 (2x16)");
    }
    System.out.println(hardware.get("RAM"));
    System.out.println(hardware);
  }
}
