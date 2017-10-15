package com.company;

public class Residential extends Customer {
    //this is my variables


    //public boolean senior;
    public double totalCost;
    public double resConstantRate;
    public boolean senior = true;
    public double seniorDiscount;

    /**
     *
     * @param customerName
     * @param customerPhone
     * @param customerAddress
     * @param squareFootage
     * @param resConstantRate
     * @param senior
     * @param seniorDiscount
     */

/* my parameters are above */
    public Residential(String customerName, String customerPhone, String customerAddress, double squareFootage, double resConstantRate, boolean senior, double seniorDiscount) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.resConstantRate = 6.0;
        this.senior = true;
        this.seniorDiscount;
    }

    public void calculate(boolean senior, String customerName, String customerPhone, String customerAddress, double squareFootage, seniorDiscount) {

        double resConstantRate = 6.0;
        double senior = true;
        double squareFootage = 0;
    }


    public int getSenior() {
        return senior;
    }if( senior >= 65){
        seniorDiscount = totalCost * .15;
    }
                  if( senior == true){
        senior = 0;
        totalCost = ((squareFootage/1000)*6) * totalCost;
    }

     if (senior == false){
        System.out.println("Senior discount: " + customerName);
        System.out.println("Customer Name" + customerAddress);
        System.out.println(" Customer Phone" + customerPhone);
        System.out.println(" Customer Address" + customerAddress);
        System.out.println(" total squareFootage is: "+  squareFootage);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

