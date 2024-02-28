class Car{
    private String make;
    private String model;

   public Car(String make, String model){
    this.make = make;
    this.model = model;
   }

   public String getMake(){
    return make;
   }
   public String getModel(){
    return model;
   }

   public void setMake(String make){
    this.make=make;
   }
   
   public void setModel(String model){
    this.model=model;
   }
}

public class CarTester{
    public static void main(String[] args) {
        Car myCar1 = new Car("Honda", "NSX");
        Car myCar2 = new Car(null,null);
        System.out.println("Make of the Car 1:" + myCar1.getMake() +"\nModel of the Car 1:" + myCar1.getModel());
        System.out.println("Make of the Car 2:" + myCar2.getMake()+"\nModel of the Car 2:" + myCar2.getModel());
        myCar2.setMake("Porsche");
        myCar2.setModel("911");
        System.out.println("Updated Values of the Car 2:");
        System.out.println("Make of the Car 2:" + myCar2.getMake()+"\nModel of the Car 2:" + myCar2.getModel());
    }
}

