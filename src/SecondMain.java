public class SecondMain {
    public static void main(String[] args) {

        Bank bank = new Bank (1,"new bank");
        Person daniil = new Person(2, "Daniil", 23);
        Person gleb= new Person(3, "Gleb", 14);
        Person ivan = new Person(4,"Ivan", 5);
        Person ippolit =new Person(5,"Ippolit",70);

        BankOperation bankOperation1 = bank.createOperation(daniil, OperationType.CREDIT,5000);
        System.out.println(bankOperation1);
        BankOperation bankOperation2 = bank.createOperation(gleb, OperationType.DEBIT,5000);
        System.out.println(bankOperation2);
        BankOperation bankOperation3 = bank.createOperation(ivan, OperationType.DEBIT,5000);
        System.out.println(bankOperation3);
        BankOperation bankOperation4 = bank.createOperation(ippolit, OperationType.MORTGAGE,5000);
        System.out.println(bankOperation4);

        String str = "TEEN";
        AgeCategory ageCategory=AgeCategory.valueOf(str);
        String  str1 = ageCategory.name();
        System.out.println(ageCategory);
        System.out.println(str1);

    }
}
