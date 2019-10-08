interface Vehicle{
    public void accelerates();
    public void mileage();
}

class Activa implements Vehicle{
    public void accelerates(){
        System.out.println("Activa accelerates @ 0-60 km/hr in 10 seconds");
    }

    public void mileage(){
        System.out.println("Activa gives a mileage of 60 km/l");
    }
}
class Wego implements Vehicle{
    public void accelerates(){
        System.out.println("Wego acceleartes @ 0-60 km/hr in 8.81 seconds");
    }

    public void mileage(){
        System.out.println("Wego gives a mileage of 70 km/l");
    }

    public void speed(){
        System.out.println("Speeding up...");
    }
}

class driver_class{
    public static void main(String args[]){
        Activa scooty = new Activa();
        scooty.accelerates();
        scooty.mileage();

        Wego bike = new Wego();
        bike.accelerates();
        bike.mileage();
        bike.speed();
    }
}