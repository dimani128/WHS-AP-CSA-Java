package org.unit1.ch_17_115;

import java.util.Scanner;

public class lab_2_movie_ticket_sales {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Ticket price: $");
        float price = input.nextFloat();

        System.out.print("# sold: ");
        int numSales = input.nextInt();
        input.nextLine(); // consume leftover newline

        System.out.print("Discount?: ");
        String rawDiscount = input.nextLine();

        float discount;
        if (rawDiscount.endsWith("%")) {
            discount = Float.parseFloat(rawDiscount.substring(0, rawDiscount.indexOf("%")));
        }
        else
        {
            discount = Float.parseFloat(rawDiscount);
        }
        if (discount > 1)
            discount /= 100;

        var sales = new MovieSales(numSales, price);
        System.out.println("Total before discount: $" + sales.CalculateRevenue());
        System.out.println("Total after " + (discount * 100) + "% discount: $" + String.format("%.2f", sales.CalculateRevenue(discount)));
    }
}

class MovieSales
{
    int _unitsSold;
    float _ticketPrice;

    MovieSales(int sales, float ticketPrice)
    {
        _unitsSold = sales;
        _ticketPrice = ticketPrice;
    }

    public float CalculateRevenue()
    {
        return _unitsSold * _ticketPrice;
    }

    public float CalculateRevenue(float discount)
    {
        return (1 - discount) * _ticketPrice * _unitsSold;
    }
}