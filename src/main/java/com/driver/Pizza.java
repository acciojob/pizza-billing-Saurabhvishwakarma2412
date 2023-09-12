package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesecost;
    private int topping;
    private int takeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
          this.price=300;
        }else{
           this.price=400;
        }
        bill="Base Price Of The Pizza: "+this.price+ '\n';
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheesecost==0){
            cheesecost=80;
            bill+="Extra Cheese Added: 80 \n";
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(topping==0 && isVeg==true){
            topping=70;
            bill+="Extra Toppings Added: 70 \n";
        }else if(topping==0 && isVeg==false){
            topping=120;
            bill+="Extra Toppings Added: 120 \n";
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(takeaway==0){
            takeaway=20;
            bill+="Paperbag Added: 20 \n";
        }
    }

    public String getBill(){
        // your code goes here
        int total=price+cheesecost+topping+takeaway;
        bill+="Total Price: "+total+"\n";
        return this.bill;
    }
}
