public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int bagPackPrice =20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayOpted = false;

    public Pizza(Boolean veg) {
        this.veg = veg;

        if(this.veg) {
            this.price = 300;
        } else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
//        System.out.println("Extra Cheese Added.");
        this.price += extraCheesePrice;

    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
//        System.out.println("Extra Topping Added.");
        this.price += extraToppingsPrice;
    }

    public void takeAway(){
        isTakeAwayOpted = true;
//        System.out.println("Take Away opted.");
        this.price += bagPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Base Pizza Prize: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Topping Added: "+extraToppingsPrice+"\n";
        }
        if(isTakeAwayOpted){
            bill += "Take Away Opted: "+bagPackPrice+"\n";
        }
        bill += "Total Bill: "+this.price+"\n";
        System.out.println(bill);
    }
}
