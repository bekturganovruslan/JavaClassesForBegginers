public class Bike {
    String model;
    double price;
    int numOfTires;

    public void ride(){
        System.out.println(model+" Bike is riding");
    }

    public void stop(){
        System.out.println("bike is stoped");
    }

    public double getPrice(){
        return price;
    }

    public double change(double newPrice){
        price=newPrice;
        return getPrice();
    }
}


class Rider{
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.model="Ural";
        System.out.println("Price: "+(b1.price=1200));
        b1.ride();
        b1.stop();
        System.out.println("new price: "+b1.change(1588));


    }

        }
