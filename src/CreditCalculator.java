public class CreditCalculator {
    public  double calculate (BankOperation bankOperation, int years){
        double creditRate = bankOperation.calculateCreditRate();
        double amout = bankOperation.getAmount();
        for (int i = 0; i < years; i++) {
            amout *= creditRate;

        }
        return  amout;
    }
}
