public class sharedBankAccount extends Account{

    private Person[] owners;

    public sharedBankAccount(String sc, Person[] people){
        super(sc);
        this.owners = people;
    }

    public Person[] getOwners() {
        return owners;
    }

    public void setOwners(Person[] owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        String accStr = super.toString();
        for (Person i : owners){
            accStr += String.format("\n%s", i);
        }
        return accStr;
    }

    public static void main(String[] args) {
        Person x = new Person("Mad", "Dog", "1 Cinnamon Row");
        Person y = new Person("Moon", "Dog", "1 Cinnamon Row");
        Person z = new Person("Big", "Dog");
        Person[] houseAcc = new Person[] {x,y,z};
        sharedBankAccount cinnamon = new sharedBankAccount("34-43-45", houseAcc);
        System.out.println(cinnamon);
    }

}
