public class Account {

    private static int nextAccountNo = 100000;
    protected String sortCode;
    protected int accountNum;

    public Account(String sortCode) {
        this.sortCode = sortCode;
        this.accountNum = nextAccountNo;
        nextAccountNo ++;
    }

    public int getNewAccountNum(){
        int newAccNo = nextAccountNo++;
        return newAccNo;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNum() {
        return accountNum;
    }

    @Override
    public String toString() {
        return String.format("Sort-code is: %s Account number is: %s", sortCode, accountNum);
    }

    public static void main(String [] args){
        Account newAcc = new Account("78-32-09");
        System.out.println(newAcc.toString());
        Account newAcc2 = new Account("78-32-09");
        System.out.println(newAcc2.toString());
    }
}
