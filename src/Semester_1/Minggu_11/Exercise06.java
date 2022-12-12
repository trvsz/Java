package Semester_1.Minggu_11;

// This program tracks the user's purchases of two stocks,
// computing and reporting which stock is more profitable.

import java.util.*;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // first stock
        System.out.print("First stock's symbol: ");
        String symbol1 = console.next();
        Stock stock1 = new Stock(symbol1);
        double profit1 = makePurchases(stock1, console);

        // second stock
        System.out.print("Second stock's symbol: ");
        String symbol2 = console.next();
        Stock stock2 = new Stock(symbol2);
        double profit2 = makePurchases(stock2, console);

        // report which stock made more money
        if (profit1 > profit2) {
            System.out.println(symbol1 + " was more " +
                    "profitable than " + symbol2 + ".");
        } else if (profit2 > profit1) {
            System.out.println(symbol2 + " was more " +
                    "profitable than " + symbol1 + ".");
        } else {  // profit1 == profit2
            System.out.println(symbol1 + " and " + symbol2 +
                    " are equally profitable.");
        }
    }

    // Makes purchases of stock and returns the profit.
    public static double makePurchases(Stock currentStock, Scanner console) {
        System.out.print("How many purchases did you make? ");
        int numPurchases = console.nextInt();

        // ask about each purchase
        for (int i = 1; i <= numPurchases; i++) {
            System.out.print(i + 
                ": How many shares, at what price per share? ");
            int numShares = console.nextInt();
            double pricePerShare = console.nextDouble();

            // ask the Stock object to record this purchase
            currentStock.purchase(numShares, pricePerShare);
        }

        // use the Stock object to compute profit
        System.out.print("What is today's price per share? ");
        double currentPrice = console.nextDouble();

        double profit = currentStock.getProfit(currentPrice);
        System.out.println("Net profit/loss: $" + profit);
        System.out.println();
        return profit;
    }
}

// A Stock object represents purchases of shares of a stock.

class Stock {
    private String symbol;        // stock symbol, e.g. "YHOO"
    private int totalShares;      // total shares purchased
    private double totalCost;     // total cost for all shares

    // Initializes a new Stock with no shares purchased.
    // Precondition: symbol != null
    public Stock(String theSymbol) {
        if (theSymbol == null) {
            throw new NullPointerException();
        }

        symbol = theSymbol;
        totalShares = 0;
        totalCost = 0.0;
    }

    // Returns the total profit or loss earned on this stock,
    // based on the given price per share.
    // pre: currentPrice >= 0.0
    public double getProfit(double currentPrice) {
        if (currentPrice < 0.0) {
            throw new IllegalArgumentException();
        }

        double marketValue = totalShares * currentPrice;
        return marketValue - totalCost;
    }

    // Records purchase of the given shares at the given price.
    // pre: shares >= 0 && pricePerShare >= 0.0
    public void purchase(int shares, double pricePerShare) {
        if (shares < 0 || pricePerShare < 0.0) {
            throw new IllegalArgumentException();
        }

        totalShares += shares;
        totalCost += shares * pricePerShare;
    }
}

/*
 *  totalShares 75
 *  totalCost 2716.0
 * 
 *  symbol "AMZN"
 *  totalShares 75
 *  total Cost 2716.0
 *  marketValue 2796.75
 * 
 *  totalShares 15 | 25 | 45
 *  totalCost 248.25 | 429.15 | 
 */
