public class Test {
    public static void main(String[] args) {
        PaymentStrategy creditCard=new CreditCardPayment();
        PaymentContext context1=new PaymentContext(creditCard);
        context1.executePayment(5000);
        PaymentStrategy paypal=new PayPalPayment();
        PaymentContext context2=new PaymentContext(paypal);
        context2.executePayment(3000);
    }
}