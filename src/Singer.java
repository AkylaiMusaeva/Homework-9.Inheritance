public class Singer extends Person{
    String bandName;
    public Singer(String name,String designation,String bandName){
        super(name, designation);
        this.bandName=bandName;
    }
    public void setBandName(String bandName){
        this.bandName=bandName;
    }
    public String getBandName(){
        return bandName;
    }
    public void singing(){
        super.learn();
        super.walk();
        super.eat();
        System.out.println(getName()+" is currently giving worldwide concerts with his group "+bandName);
    }
    public void playGuitar(){
        System.out.println(getDesignation() +" not always perform with guitar");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                ", name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                '}';
    }
}
