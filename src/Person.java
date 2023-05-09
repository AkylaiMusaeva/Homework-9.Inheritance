public class Person {
    String name;
    String designation;
    public Person(String name,String designation){
        this.name=name;
        this.designation=designation;
    }
    public Person(){
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public String getDesignation(){
        return designation;
    }
    public void learn(){
        System.out.println(name+" is a "+designation);
    }
    public void walk(){
        System.out.println(name+" gets to work by transport");
    }
    public void eat(){
        System.out.println(name+" eats every day ");
    }

}
