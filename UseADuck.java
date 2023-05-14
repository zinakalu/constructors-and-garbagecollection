public class Duck{
    int size;
    public Duck(){
        System.out.println("Quack");
    }
    public void setSize(int newSize){
        this.size = newSize;
    }
}

public class UseADuck{
    public static void main(String[] args){
        Duck d = new Duck;
        d.setSize(42);
    }
}