package com.bl.sharemarket;

public class Model {
    String companyName;
    int sharePrice;
    public int numOfStock;
    int totalValue;



    public Model(String companyName, int sharePrice, int numOfStock , int totalValue) {
        this.companyName = companyName;
        this.sharePrice = sharePrice;
        this.numOfStock = numOfStock;
        this.totalValue= totalValue;
    }



    public String getCompanyName() {


        return companyName;
    }

    public void setStockName(String stockName) {
        this.companyName = companyName;
    }

    public int getnumOfStock() {
        return numOfStock ;
    }

    public void setShareNumber(int numOfStock) {

        this.numOfStock = numOfStock;
    }

    public int getSharePrice() {

        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {

        this.totalValue = totalValue;
    }



    @Override
    public String toString() {
        return "Model{" +
                "companyName='" + companyName + '\'' +
                ", sharePrice=" + sharePrice +
                ", numOfStock=" + numOfStock +
                ", totalValue=" + totalValue +
                '}';
    }
}
