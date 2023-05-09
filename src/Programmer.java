public class Programmer extends Person{
    String companyName;
    public Programmer(String name,String designation,String companyName){
        super(name,designation);
        this.companyName=companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    public String getCompanyName(){
        return companyName;
    }
    public void coding(){
        super.learn();
        super.walk();
        super.eat();
        System.out.println(name+" is currently writes codes in "+companyName);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
