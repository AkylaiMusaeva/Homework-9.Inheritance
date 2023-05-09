public class Animal {
    private String name;
    private int age;
    public Animal(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void getAnimalInfo(){
        System.out.println(name+" is "+age+" years old");
    }

    @Override//родительский класстан келген
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
