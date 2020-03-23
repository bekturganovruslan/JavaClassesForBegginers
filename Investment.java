public class Investment {

    static  int year;
    static double amount;
    static double rate;

    public static double rateAmount ( int years, double amounts, double rates){
        year = years;
        amount = amounts;
        rate = rates;
        double reateAmountResult = (years * amount * rate / 100);
        return reateAmountResult;
    }

    public static double totalAmount ( int years, double amounts, double rates){
        year = years;
        amount = amounts;
        rate = rates;
        double total = amount + (year * amount * rate / 100);
        return total;
    }

    public static void main (String[]args){
         System.out.println("Your rate amount " + rateAmount(2, 5000, 8.5));
         System.out.println("Your total amount " + totalAmount(5, 1000, 4.5));
     }
}
