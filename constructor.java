class Blueprint{
    int wheels;
    int door;
    String ownername;
    String brand;

    Blueprint(int wheels, int door, String ownername,String brand){
          this.wheels = wheels;
          this.door = door;
          this.ownername = ownername;
          this.brand = brand;

    }

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

public class constructor {
    public static void main(String[] args) {
        Blueprint thar = new Blueprint(5,4,"kartik","Mahindra");
        thar.carstart(1);
        System.out.println(thar.wheels);
        
        
    }
}
