package com.example.preinvest;

public class StockReportModel {

    private String symbol;
    private String name;
    private Double price;
    private Double changesPercentage;
    private Double change;
    private Double dayLow;
    private Double dayHigh;
    private Double yearHigh;
    private Double yearLow;
    private Double marketCap;
    private Double open;
    private Double previousClose;

    public StockReportModel(String symbol, String name, Double price, Double changesPercentage, Double change, Double dayLow, Double dayHigh, Double yearHigh, Double yearLow, Double marketCap, Double open, Double previousClose) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.changesPercentage = changesPercentage;
        this.change = change;
        this.dayLow = dayLow;
        this.dayHigh = dayHigh;
        this.yearHigh = yearHigh;
        this.yearLow = yearLow;
        this.marketCap = marketCap;
        this.open = open;
        this.previousClose = previousClose;
    }

    public StockReportModel() {
    }

    @Override
    public String toString() {
        return "Company Name is " + name + "\n"+
                "Current Price --> " + price +"\n"+
                "ChangesPercentage = " + changesPercentage +"\n"+
                "Change : " + change +"\n"+
                "DayLow : " + dayLow +"\n"+
                "DayHigh : " + dayHigh +"\n"+
                "YearHigh : " + yearHigh +"\n"+
                "YearLow : " + yearLow +"\n"+
                "MarketCap : " + marketCap +"\n"+
                "Open : " + open +"\n"+
                "PreviousClose : " + previousClose;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getChangesPercentage() {
        return changesPercentage;
    }

    public void setChangesPercentage(Double changesPercentage) {
        this.changesPercentage = changesPercentage;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getDayLow() {
        return dayLow;
    }

    public void setDayLow(Double dayLow) {
        this.dayLow = dayLow;
    }

    public Double getDayHigh() {
        return dayHigh;
    }

    public void setDayHigh(Double dayHigh) {
        this.dayHigh = dayHigh;
    }

    public Double getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(Double yearHigh) {
        this.yearHigh = yearHigh;
    }

    public Double getYearLow() {
        return yearLow;
    }

    public void setYearLow(Double yearLow) {
        this.yearLow = yearLow;
    }

    public Double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(Double previousClose) {
        this.previousClose = previousClose;
    }
}
