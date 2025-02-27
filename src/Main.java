public class Main {
    public static void main(String[] args) {
        Exchange exchange = new TestExchange();
        Cash dollar = new Cash(exchange, 200);
        System.out.println("Dollar: " + dollar.toString());

        Cash euro = dollar.in("EUR");
        System.out.println("Dollar to Euro: " + euro.toString());

        Cash jpy = dollar.in("JPY");
        System.out.println("Dollar to JPY: " + jpy.toString());

        Cash inr = dollar.in("INR");
        System.out.println("Dollar to INR: " + inr.toString());

        Cash unknown = dollar.in("CAD");
        System.out.println("Dollar to CAD: " + unknown.toString());
    }
}
