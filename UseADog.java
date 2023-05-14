public class Dog{
    int size;

    public Dog (int dogSize){
        System.out.println("Woof");

        this.size = dogSize;

        System.out.println("size is " + size);
    }
}

public class UseADog{
    public static void main(String[] args){
        Dog d = new Dog(20);
    }
}