package com.bl.sharemarket;

import java.util.ArrayList;
import java.util.Scanner;

public class StockMarket {

     Model model;

    ArrayList<Model> models = new ArrayList<Model>();

    public ArrayList<Model> getValue() {


        for(int i=0; i<2 ;i++) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the Company Name:");
            String companyName = scan.nextLine();

            System.out.println("Enter the share Price :");
            int sharePrice = scan.nextInt();

            System.out.println("Enter the share Number:");
            int numOfStock = scan.nextInt();

            System.out.println("-----------------------------");

            int totalNumOfStock = (numOfStock * sharePrice);

            models.add(new Model(companyName, sharePrice, numOfStock, totalNumOfStock));


        }

        return models;
    }

}
