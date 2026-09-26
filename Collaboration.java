public class Collaboration {

//////////////
/// adds a quantity to the stock of an item in the store
/// ///////////
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
    }

//////////////
/// displays the inventory of items in the store
//////////////
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if(names[i] != null) {
            System.out.println("Item Name: " + names[i]);
            System.out.println("Item Price: " + prices[i]);
            System.out.println("Item Stock: " + stocks[i]);
            System.out.println("-------------------------");
            }
        }
    }

    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];     

        itemNames[0] = "Apple";
        itemPrices[0] = 0.99;
        itemStocks[0] = 50;

        itemNames[1] = "Banana";
        itemPrices[1] = 0.59;
        itemStocks[1] = 100;

        printInventory(itemNames, itemPrices, itemStocks);
    }
}