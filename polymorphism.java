class payment{
    void pay(){
        System.out.println("Payment methods");
    }
}
class upi extends payment{
    void pay(){
        System.out.println("paying with upi");
    }
}
class credit extends payment{
    void pay(){
        System.out.println("paying with credit card");
    }
}
class cod extends payment{
    void pay(){
        System.out.println("paying with cash on delivery");
    }
}
public class Main{
    public static void main (String[] args) {
        payment p=new payment();
        p.pay();
        p=new upi();
        p.pay();
        p=new credit();
        p.pay();
        p=new cod();
        p.pay();
    }
}