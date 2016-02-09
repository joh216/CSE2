//hw02: Arithmetic Calculations

//This homework is about manipulating stored data in variables
//run simple calcuations and print the numerical output 
//In this hw, we want to compute the cost of the
//the items bought including the PA 6% tax
 
public class Arithmetic{
    
    public static void main(String[] args)  {

    //Number of pairs of pants
    int numPants = 3; 
    //Cost per pair of pants
    double pantsPrice = 34.98; 

    //Number of sweatshirts
    int numShirts=2; 
    //Cost per shirt
    double shirtPrice = 24.99;

    //Number of belts
    int numBelts = 1;
    //cost per box of envelopes 
    double beltCost = 33.99; 
    
    //the tax rate
    double paSalesTax = 0.06;  
    
    double totalCostOfPants = numPants * pantsPrice; 
    //total costs of pants
    
    double totalCostOfShirts = numShirts * shirtPrice; 
    //total costs of shirts
    
    double totalCostOfBelts = numBelts * beltCost; 
    //total cost of belts
    
    double totalCostOfPurchasesPreTax = totalCostOfPants+totalCostOfShirts+totalCostOfBelts;
    //total cost of purchases before taxes
    
    double salesTaxPants= totalCostOfPants * paSalesTax; 
    //sales tax charged on pants
    
    double salesTaxShirts = totalCostOfShirts * paSalesTax; 
    //sales tax charged on shirts
    
    double salesTaxBelts = totalCostOfBelts * paSalesTax; 
    //sales tax charged on belts
    
    double totalSalesTax = salesTaxPants+salesTaxShirts+salesTaxBelts; 
    //total sales tax
    
    double totalCostOfPurchaseAfterTax = totalCostOfPurchasesPreTax + totalSalesTax;
    //total cost of purchase including tax
    
    System.out.println("The total cost of pants is $"+ (double) ((int) (totalCostOfPants*100))/100);
    System.out.println("The total cost of shirts is $"+(double) ((int) (totalCostOfShirts*100))/100);
    System.out.println("The total cost of belts is $"+ (double) ((int) (totalCostOfBelts*100))/100);
    //above prints out the costs for each item
    System.out.println("The total cost of purchases before tax $"+(double) ((int) (totalCostOfPurchasesPreTax*100))/100);
    //above prints out the total cost before tax
    
    System.out.println("The sales tax on pants is $"+(double) ((int) (salesTaxPants*100))/100);
    System.out.println("The sales tax on shirts is $"+(double) ((int) (salesTaxShirts*100))/100);
    System.out.println("The sales tax on belts is $"+ (double) ((int) (salesTaxBelts*100))/100);
    System.out.println("The total sales tax is $"+(double) ((int) (totalSalesTax*100))/100);
    //above prints out sales tax for each item and the total sales tax
    
    System.out.println("The total cost of the purchases after tax is $"+(double) ((int) (totalCostOfPurchaseAfterTax*100))/100);
    //prints out the total cost including tax 
    
    }
}



