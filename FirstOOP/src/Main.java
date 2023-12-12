public class Main {
    public static void main(String[] args) {

        /*
        Car car = new Car();
        car.describeCar();
        car.setMake("Porsche");
        car.setColor("Blue");
        car.setConvertible(true);
        car.setDoors(2);
        car.setModel("Cayenne");


        Car lambo = new Car();
        lambo.setMake("Lamborgini");
        lambo.setModel("Gallordo");
        lambo.setColor("Black");
        lambo.setConvertible(true);
        lambo.setDoors(2);

         */

     //   Account account = new Account();
      //  account.depositFunds(500.0);
      //  account.withDrawFunds(100.0);

    //    Account account = new Account("1234",200.0,"customer","deneme@gmail.com","0521456");

        // Constructor içerisinde constructor çağırma örneği aşağıdaki gibidir.
      //  Account account = new Account();

     //   account.depositFunds(500.0);
      //  account.withDrawFunds(100.0);



     //   System.out.println("Make = " + lambo.getMake() + " model = " + lambo.getModel());


    //    System.out.println("make = " + car.getMake() + " model = " + car.getModel() +
     //           " color = " + car.getColor() + " doors = " + car.getDoors() + " convertible = " + car.isConvertible());
        // Getter metoduyla yukarıdaki gibi eriştik.

        Customer customer = new Customer("Ferhat",15000.0,"ferhat@gmail.com");
        System.out.println("Name : " + customer.getName() + " Limit : " + customer.getCreditLimit() + " Email : " + customer.getEmail());

        Customer secondCustomer = new Customer("Ali","ali@gmail.com");
        System.out.println("Name : " + secondCustomer.getName() + " Limit : " + secondCustomer.getCreditLimit() +" Email : " + secondCustomer.getEmail());

        Customer thirdCustomer = new Customer();
        System.out.println("Name : " + thirdCustomer.getName() + " Limit : " + thirdCustomer.getCreditLimit() + " Email : " + thirdCustomer.getEmail());
    }
}
