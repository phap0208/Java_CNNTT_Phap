package PizzaShape;

public class PizzaClient {

    public void run() {
        Pizza round = new Pizza (2.88, new Circle (3));
        Pizza rect =  new Pizza (3.88, new Rectangle (7, 5));
        PizzaDeal pd = new PizzaDeal();
        System.out.println(round + " co gia tot hon " + rect + ": " + pd.betterDeal(round, rect));
    }
    public static void main (String[] nu) {
        new PizzaClient().run();

    }
}