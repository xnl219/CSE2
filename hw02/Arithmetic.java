//class
public class Arithmetic {
    //Method
    public static void  main(String[] args) {
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //PA Tax Percentage
        double taxPercent=0.06;
        
        
        
        //CALCULATIONS
		
		//Total cost of each kind of item
		
		double TotalCostSocks, TotalCostGlasses, TotalCostEnvelopes; //item kind cost variable
		TotalCostSocks=nSocks*sockCost$;
		TotalCostGlasses=nGlasses*glassCost$;
		TotalCostEnvelopes=nEnvelopes*envelopeCost$;
        
		
		//Sales tax for the total cost of kind of item
		
		double TaxSocks, TaxGlasses, TaxEnvelopes; //item tax variable
		TaxSocks=TotalCostSocks*taxPercent;
		TaxGlasses=TotalCostGlasses*taxPercent;
		TaxEnvelopes=TotalCostEnvelopes*taxPercent;
		
        //Tax rounding
        TaxSocks=Math.round(TaxSocks*100);
        TaxSocks=TaxSocks/100;
        TaxGlasses=Math.round(TaxGlasses*100);
        TaxGlasses=TaxGlasses/100;
        TaxEnvelopes=Math.round(TaxEnvelopes*100);
        TaxEnvelopes=TaxEnvelopes/100;
		
		//Total cost of purchases (before tax)
		
		double TotalCostPurchases, TotalTax, TotalWithTax; //Total variables
		TotalCostPurchases=TotalCostSocks+TotalCostGlasses+TotalCostEnvelopes;
		//Total Purchase Tax
		TotalTax=TotalCostPurchases*taxPercent;
		//Total actually paid for this transaction, including sales tax
		TotalWithTax=TotalCostPurchases+TotalTax;
		
		//Total Cost Rounding
		
		TotalTax = Math.round(TotalTax * 100);
        TotalTax = TotalTax/100;
        TotalWithTax = Math.round(TotalWithTax * 100);
        TotalWithTax = TotalWithTax/100;
		
		//Print out the output data.
		    System.out.println("");
		    System.out.println("Purchase Order:");
		    System.out.println("---------------");
		    System.out.println("");
		    System.out.println("");
		    System.out.println("Item: Socks");
		    System.out.println("Quantity: "+nSocks+" Socks");
		    System.out.println("Cost Per Item: $"+sockCost$);
		    System.out.println("");
		    System.out.println("Item: Glasses");
		    System.out.println("Quantity: "+nGlasses+" Glasses");
		    System.out.println("Cost Per Item: $"+glassCost$);
		    System.out.println("");
		    System.out.println("Item: Box of Envelopes");
		    System.out.println("Quantity: "+nEnvelopes+"  Box of Envelopes");
		    System.out.println("Cost Per Item: $"+envelopeCost$);
		    System.out.println("");
		    System.out.println("");
		    System.out.println("Total Cost of Socks: $"+TotalCostSocks);
		    System.out.println("Tax on Socks: $"+TaxSocks);
		    System.out.println("");
		    System.out.println("Total Cost of Glasses: $"+TotalCostGlasses);
		    System.out.println("Tax on Glasses: $"+TaxGlasses);
		    System.out.println("");
		    System.out.println("Total Cost of Boxes of Envelopes: $"+TotalCostEnvelopes);
		    System.out.println("Tax on Envelopes: $"+TaxEnvelopes);
		    System.out.println("");
		    System.out.println("");
		    System.out.println("Total Cost of Purchases: $"+TotalCostPurchases);
		    System.out.println("Total Sales Tax: $"+TotalTax);
		    System.out.println("");
		    System.out.println("Total Cost of Purchases Including Tax: $"+TotalWithTax);
		    System.out.println("");
		    System.out.println("Thank You For Shopping :)");
		    System.out.println("");
		
    }
}