class CoffeeMachine{
    private double milk,water,coffee_powder=0;
    public void GetDetails(){
        System.out.print("The Milk remaining in machine "+this.milk+" liters");
        System.out.print("\n The Water remaining in machine "+this.water+" liters");
        System.out.print("\n The coffee powder remaining in machine "+this.coffee_powder+" liters");
    }
    public void FillMachine(){
                  
    }
   
    public static void main(String[] args) {
        CoffeeMachine cc= new CoffeeMachine();
        cc.GetDetails();
        
    }
    
    
}