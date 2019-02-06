package com.johncarlin;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.5, 200);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.5, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

//        for (String s : stockList.Items().keySet()) {
//            System.out.println(s);
//        }

        Basket johnsBasket = new Basket("John");
        sellItem(johnsBasket, "car", 1);
        System.out.println(johnsBasket);

        sellItem(johnsBasket, "car", 1 );
        System.out.println(johnsBasket);
        sellItem(johnsBasket, "car", 1);
        sellItem(johnsBasket, "spanner", 5);
//        System.out.println(johnsBasket);

        sellItem(johnsBasket, "juice", 4);
        sellItem(johnsBasket, "cup", 12);
        sellItem(johnsBasket, "bread", 1);
//        System.out.println(johnsBasket);

//        System.out.println(stockList);

        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(johnsBasket, "car", 1);
        removeItem(johnsBasket, "cup", 9);
        removeItem(johnsBasket, "car", 1);
        System.out.println("cars removed: " + removeItem(johnsBasket, "car", 1));

        System.out.println(johnsBasket);

        //remove all items from johnBasket
        removeItem(johnsBasket, "bread", 1);
        removeItem(johnsBasket, "cup", 3);
        removeItem(johnsBasket, "juice", 4);
        removeItem(johnsBasket, "cup", 3);
        System.out.println(johnsBasket);

        System.out.println("\nDisplay stocklist before and after checkout");

        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

        checkOut(johnsBasket);
        System.out.println(johnsBasket);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unReserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut( Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }

}
