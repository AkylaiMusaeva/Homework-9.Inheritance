public class Rose extends Flower{
    String colour;
    int height;
    public Rose(String name,String beautyProducts,String colour,int height){
        super(name,beautyProducts);
        this.colour=colour;
        this.height=height;
    }
    public Rose(){
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public String getColour(){
        return colour;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "colour='" + colour + '\'' +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", beautyProducts='" + beautyProducts + '\'' +
                '}';
    }
}
