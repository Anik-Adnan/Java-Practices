package day_07;



public class Payment {
    public static void main(String[] args) {
        paymentHere(new Bikash(),1000.00);

    }
    static void paymentHere(PaymentApi api,double amount){
        api.payment(amount);
    }
}


interface PaymentApi{
    void payment(double amount);
}
class Bikash implements PaymentApi{
    @Override
    public void payment(double amount) {
        System.out.println(" some  informations!!");
        System.out.println("Payment done by Bikash");
    }
}
class Nagad implements PaymentApi{
    @Override
    public void payment(double amount) {
        System.out.println(" some  informations!!");
        System.out.println("Payment done by Nagad");
    }

}