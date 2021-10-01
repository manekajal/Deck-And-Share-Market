package com.bl.sharemarket;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        ArrayList<Model> portfolia = new ArrayList<>();
        Scanner scan = new Scanner(System.in);


        StockMarket stockMarket = new StockMarket();
        portfolia= (ArrayList<Model>) stockMarket.getValue();

        for(int i=0;i<portfolia.size();i++){

            System.out.println(" Company Name:" +portfolia.get(i).getCompanyName());
            System.out.println(" Share Price:" +portfolia.get(i).getSharePrice());
            System.out.println(" Number Of Shares:" +portfolia.get(i).getnumOfStock());
            System.out.println(" Total Value:" +portfolia.get(i).getTotalValue());
            System.out.println("----------------------------------");
        }





    }
}
