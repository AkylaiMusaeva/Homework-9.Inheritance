public class Lilac extends Flower {
    String season;
    String smell;
    public Lilac(String name,String beautyProducts,String season,String smell){
        super(name,beautyProducts);
        this.season=season;
        this.smell=smell;
    }
    public Lilac(){

    }
    public void setSeason(String season){
        this.season=season;
    }
    public String getSeason(){
        return season;
    }
    public void setSmell(String smell){
        this.smell=smell;
    }
    public String getSmell(){
        return smell;
    }

    @Override
    public String toString() {
        return "Lilac{" +
                "season='" + season + '\'' +
                ", smell='" + smell + '\'' +
                ", name='" + name + '\'' +
                ", beautyProducts='" + beautyProducts + '\'' +
                '}';
    }
}
