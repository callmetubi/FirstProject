public class deneme {
    private String color;
    private String model;
    private double engine;
    private int door;

    public deneme(){
        this("Red","Renault",2,2);
    }
    public deneme(String color,String model,double engine,int door){
    this.color=color;
    this.model=model;
    this.engine=engine;
    this.door=door;
    }
    public void setColor(String color){
         this.color=color;
    }
    public String getColor(){
        return this.color;
    }

    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }

    public void setEngine(double engine){
        this.engine=engine;
    }
    public double getEngine(){
        return this.engine;
    }

    public void setDoor(int door){
        this.door=door;
    }
    public int getDoor(){
        return this.door;
    }

    public void start(){
        System.out.println("Araba calisti");
    }

    public void end(){
        System.out.println("Hayirli olsun");
    }

    public void showInfos(){
        System.out.println("Arabanin Rengi:" + this.color);
        System.out.println("Arabanin Modeli:" + this.model);
        System.out.println("Arabanin Hacmi:" + this.engine);
        System.out.println("Arabanin Kapi Sayisi:" + this.door);
    }

}
