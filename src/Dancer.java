public class Dancer extends Person {
    private String groupName;
    public Dancer(String name,String designation,String groupName){
        super(name, designation);
        this.groupName=groupName;
    }
    public void setGroupName(String groupName){
        this.groupName=groupName;
    }
    public String getGroupName(){
        return groupName;
    }
    public void dancing(){
        super.learn();
        super.walk();
        super.eat();
        System.out.printf(getName()+" has been dancing in %s for 5 years",groupName);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                ", name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                '}';
    }
}
