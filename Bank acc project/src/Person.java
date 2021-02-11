public class Person {

    private String fName;
    private String lName;
    private String adress;

    Person (String fn, String ln){
        this.fName = fn;
        this.lName = ln;

    }

    Person (String fn, String ln, String addr){
//        this.fName = fn;
//        this.lName = ln;
        this(fn, ln);
        this.adress = addr;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAdress() {
        if (this.adress == null){
            return "Unknown";
        }
        else {
            return this.adress;
        }
    }

    public String toString(){
        if (this.adress == null){
            return String.format("%s %s", fName, lName);
        }
        else {
            return String.format("%s %s %s", fName, lName, adress);
        }
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public static void main(String[] args) {
        Person p = new Person("Jim", "Hill");
        System.out.println(p);
        p.lName = "Jimbo";
        System.out.println(p);
    }

}