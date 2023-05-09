public class Cat extends Animal {
    private String food;

    public Cat(String name, int age, String food) {

        super(name, age);
        this.food = food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public String getFood() {
        return food;
    }

    public void catMethod(){
        System.out.println(getName()+" is drinking"+getFood());
    }
}