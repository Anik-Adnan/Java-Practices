package day_8_9_10_examPreparation;

//static method don't follow method overriding concept,but follow method hidiing concept
//inside block,method,constructor,jvm don't give any default value
//assign privilegation increase always decrease does not allow
// public > protected > default > private            // left to right allow
public class PaymentAPI {
    public static void main(String[] args) {
        Bikash bikash=new Bikash();
        Nagad nagad=new Nagad();
        Rocket rocket=new Rocket();
        bikash.payment(bikash);
        nagad.payment(nagad);
        rocket.payment(rocket);

    }
}
interface PaymentagGetway {
    void payment(PaymentagGetway paymentagGetwy);
}

class Bikash implements PaymentagGetway {

    @Override
    public void payment(PaymentagGetway paymentagGetwy) {
//       payment( PaymentagGetway paymentagGetway=new Bikash() );
        System.out.println("Payment done by Bikash");
    }
}
class Nagad implements PaymentagGetway { //       payment( PaymentagGetway paymentagGetway=new Nagad() );
    @Override
    public void payment(PaymentagGetway paymentagGetwy) {
        System.out.println("Payment done by Nagad");
    }
}
class Rocket implements PaymentagGetway { //       payment( PaymentagGetway paymentagGetway=new Rocket() );
    @Override
    public void payment(PaymentagGetway paymentagGetway) {
        System.out.println("Payment done by Rocket");
    }
}
