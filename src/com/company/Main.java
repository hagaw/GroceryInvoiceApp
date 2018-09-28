package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Grocery> itemData = new ArrayList<>();
        int itemsPurchased=0;
        String newItem = "";
        double total =0;

        do {

                System.out.println("Please write the item you want to buy");
                    String itemName = input.nextLine();
                    Grocery items = new Grocery();
                    items.setItemNames(itemName);

                System.out.println("Please Enter unit price of the item");
                    double itemPrice = input.nextDouble();
                    items.setItemPrices(itemPrice);

                System.out.println("Please Enter the  quantity of the item");
                    int itemQuantity = input.nextInt();
                    items.setItemQuantities(itemQuantity);
//                    input.nextLine();

                    double ItemCost = itemPrice* itemQuantity ;
                    items.setItemCost(ItemCost);
                    itemData.add(items);
                    total = total+ItemCost;
                    itemsPurchased++;
                    input.nextLine();

                    System.out.println("Do you have item to buy? yes or no ");
                    newItem = input.nextLine();

        } while (newItem.equalsIgnoreCase("yes"));

        System.out.println("Item Name" + "\t\t\t\t" + "Price" + "\t\t\t\t" + "Quantity" + "\t\t\t\t" + "Cost");

        for (Grocery itemList : itemData)
        {
            System.out.printf("%s\t\t\t\t\t$%.2f\t\t\t\t\t %d\t\t\t\t\t$%.2f\n",itemList.getItemNames(),itemList.getItemPrices(),itemList.getItemQuantities(), itemList.getItemCost());
        }
        System.out.printf("\n\nTotal Purchase Amount = $%.2f",total);
        System.out.println("\nTotal Items Purchased: "+itemsPurchased);
    }}