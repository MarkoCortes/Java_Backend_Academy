package CursoPOOUber.Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;
    
    public Car(String license, Account driver){
        this.license=license;
        this.driver=driver;

    }
    public void setPassenger(Integer passenger){
        if(passenger==4) this.passenger=passenger;
        else{
            System.out.println("No. pasajero no es 4");
        }

    }
    public Integer getPassenger(){
        return this.passenger;
    }
    void printDataCar(){
        System.out.println("El nombre diriver: "+this.driver.name+" con placa: "+this.license + " Con asientos: "+this.passenger);
        
    }
    
}
