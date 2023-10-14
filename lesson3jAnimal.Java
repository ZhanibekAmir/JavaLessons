import java.util.*;

public class Main {
    public static void main(String[] args) {
      Animal animals[]= new Animal[5];
      animals[0] = new Animal(10);
      animals[1] = new Animal(15);
      animals[2] = new Animal(100);
      animals[3] = new Animal(2);
        System.out.println("Hello, World!");
      for(int i=0;i < 4; i++) {
        System.out.println(animals[i].speed);
      }      
      
  }
}
