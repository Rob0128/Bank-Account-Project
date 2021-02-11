public class individualBankAccount extends Account {

    private Person owner;

    public individualBankAccount(String sc, Person p) {
        super(sc);
        this.owner = p;

    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String accStr = super.toString();
        return String.format("%s Owner: %s", accStr, this.owner);
    }

    public static void main(String[] args){
        Person Bob = new Person("Bob", "Doll", "7 Cinnamon Row");
        individualBankAccount y = new individualBankAccount("34-34-21", Bob);
        individualBankAccount x = new individualBankAccount("34-34-21", Bob);
        System.out.println(x);

    }


}
