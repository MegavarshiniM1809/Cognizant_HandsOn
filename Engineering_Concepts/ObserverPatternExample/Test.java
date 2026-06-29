public class Test {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();
        market.registerObserver(mobile);
        market.registerObserver(web);
        System.out.println("First Update:");
        market.setStockPrice("ABC", 4200);
        System.out.println();
        market.deregisterObserver(web);
        System.out.println("Second Update:");
        market.setStockPrice("ABC", 4300);
    }
}