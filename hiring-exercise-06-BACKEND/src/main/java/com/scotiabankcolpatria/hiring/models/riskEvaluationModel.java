package com.scotiabankcolpatria.hiring.models;


public class riskEvaluationModel
{
    private clientModel client;

    private productModel product;

    private double standardDeviation;

    private int paymentDelayMaxPeakIndex;

    public clientModel getClient() {
        return client;
    }

    public void setClient(clientModel client) {
        this.client = client;
    }

    public productModel getProduct() {
        return product;
    }

    public void setProduct(productModel product) {
        this.product = product;
    }

    public double getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    public int getPaymentDelayMaxPeakIndex() {
        return paymentDelayMaxPeakIndex;
    }

    public void setPaymentDelayMaxPeakIndex(int paymentDelayMaxPeakIndex) {
        this.paymentDelayMaxPeakIndex = paymentDelayMaxPeakIndex;
    }
}
