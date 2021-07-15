package CursoPOOUber.Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");    
        UberX uberX = new UberX("INTEL233", new Account("Marko", "MR343")  , "Nissan", "N343");
        uberX.setPassenger(4);
        //uberX.passenger=3; 
        uberX.printDataCar();
        //car.driver= "Maruko";
        //car.license = "AMD112";
       // car.printDataCar();

       // Car car2 = new Car("INTEL231",new Account("Vilu", "VL355"));

        //car2.driver = "Vilu";
        //car2.license = "INTEL234";
       // car2.printDataCar();        
        //System.out.println("La licencia es: "+car.license);

    }
    
}
