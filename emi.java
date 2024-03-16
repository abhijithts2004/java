import java.util.Scanner;
public class emi {
	public static void main(String[] args){
		double amt,dpay,balpay,interest,MON,MONL,EMI,YEAR,rate;
		Scanner input =new Scanner(System.in);
		System.out.println("AMOUNT           :  ");
		amt = input.nextDouble();
		System.out.println("DOWN PAYMENT    :    ");
		dpay = input.nextDouble();
		//System.out.println("TOTAL    :    ");
		balpay = amt - dpay;
		System.out.println("INTEREST RATE      :    ");
		rate=input.nextDouble();
		System.out.println("NO. YEAR      :    ");
		YEAR = input.nextDouble();
		interest = (balpay*rate/100)*YEAR;
		//System.out.println("MONTH     :          ");
		MON =(YEAR*12)-1 ;
		//System.out.println("MONTHLY INTERST       :    ");
		MONL = interest/MON;
		EMI =(balpay+interest)/MON;
		//ALL=balpay+EMI;
		
		
		System.out.println("============================================");
		  System.out.println("                  EMI CALCULATOR           ");
		  System.out.println("============================================");
	      System.out.println("AMOUNT                  :         "+amt);
		  System.out.println("============================================");
		  System.out.println("DOWN PAYMENT            :         "+dpay);
		  System.out.println("BALANCE TOTAL           :         "+balpay);
		  System.out.println("INTEREST RATE           :         "+rate);
		  System.out.println("INTEREST                :         "+interest);
		  System.out.println("NO. OF YEAR             :         "+YEAR);
		  System.out.println("MONTH                   :         "+MON);
		  System.out.println("MONTHLY INTEREST        :         "+MONL);
		  System.out.println("============================================");
		  System.out.println("EMI AMOUNT              :         "+EMI);
		  System.out.println("============================================");
		  System.out.println("============================================");
	}
	
	
	

}