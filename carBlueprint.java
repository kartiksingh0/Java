class Blueprint{
    int wheels;
    int door;
    String ownername;
    String brand;

    void carstart(int key){
        if (key==1){
            System.out.println("Welcome " + ownername+ "!");
            
            System.out.println("car started sucessfully");
        }
        else{
            System.out.println("can cannot start");
        }
    }
}

public class carBlueprint {
      public static void main(String[] args) {
        Blueprint thar = new Blueprint();
        thar.wheels = 5;
        thar.door = 4;
        thar.ownername = "kartik";
        thar.carstart(1);

      }
    
}