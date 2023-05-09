public class Flower {
    String name;
    String beautyProducts;

    public Flower(String name,String beautyProducts) {
        this.name = name;
        this.beautyProducts=beautyProducts;
    }
    public Flower(){

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setColour(String beautyProducts){
        this.beautyProducts=beautyProducts;
    }
    public String getColour(){
        return beautyProducts;
    }
    public void flowerCan(){
        System.out.println(name+" can be used in composition of "+beautyProducts);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", beautyProducts='" + beautyProducts + '\'' +
                '}';
    }
}
