package main.car;

public class CarDemo {
    public static void main(String[] args) {
      Car c =  getCar(3);
       System.out.println(c.accelerator());
       System.out.println(c.brake());
       System.out.println(c.clutch());

    }

    public static Car getCar(int a){
        if(a==1){
            return new Benz();
        }
        else{
            return new Bmw();
        }
    }
}
